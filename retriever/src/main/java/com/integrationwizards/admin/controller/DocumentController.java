package com.integrationwizards.admin.controller;

import java.io.File;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.integrationwizards.admin.model.Document;
import com.integrationwizards.admin.model.UserInfo;
import com.integrationwizards.admin.service.DocumentService;
import com.integrationwizards.common.Constants;
import com.integrationwizards.model.Order;
import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Details;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.PayerInfo;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.PaymentExecution;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;

@Controller
public class DocumentController {
	@Autowired
	DocumentService documentService;
	
    /**
     * Upload single file using Spring Controller
     */
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public @ResponseBody Map<String, String> uploadFileHandler(@RequestParam("file") MultipartFile file, 
    		HttpServletRequest request, HttpSession session) throws Exception {
    	Map<String, String> returnMap = null;
    	
        if (!file.isEmpty()) {
        	returnMap = documentService.upload(file);
        	
        	// update points
        	if(returnMap.get("downloadFileName") != null) {
        		documentService.updatePoints((UserInfo)session.getAttribute(Constants.USER_KEY));
        	}
        } 
        
        return returnMap;
        
    }
    
    
    /**
     * Method for handling file download request from client
     */
    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public void doDownload(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
    	String id = request.getParameter("id");
    	
        // get absolute path of the application
    	if(id == null) {
    		return;
    	}
    	
    	Document document = documentService.getDocument(id);    	
          
        // set content attributes for the response
        response.setContentType("application/octet-stream");
        response.setContentLength(document.getDownloadFileData().length);
 
        // set headers for the response
        String headerKey = "Content-Disposition";
        String headerValue = String.format("attachment; filename=\"%s\"",
        		document.getDownloadFileName());
        response.setHeader(headerKey, headerValue);
 
        // get output stream of the response
        try (OutputStream outStream = response.getOutputStream()) {
	        // write bytes read from the input stream into the output stream
	        outStream.write(document.getDownloadFileData());
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
    }
    
    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    public void payPal() throws Exception {
    	ClassLoader classLoader = getClass().getClassLoader();
    	File file = new File(classLoader.getResource("sdk_config.properties").getFile());
    	
    	OAuthTokenCredential tokenCredential = Payment.initConfig(file);
    	String accessToken = tokenCredential.getAccessToken();
    	String orderId = UUID.randomUUID().toString();
    	APIContext apiContext = new APIContext(accessToken, orderId);
    	
		Details amountDetails = new Details();
		//amountDetails.setShipping("0");
		amountDetails.setSubtotal("5");
		//amountDetails.setTax(order.getTax());

		Amount amount = new Amount();
		amount.setCurrency("AUD");
		Double total = Double.parseDouble("0")
				+ Double.parseDouble("0")
				+ Double.parseDouble("5");
		amount.setTotal(String.format("%.2f", total));
		amount.setDetails(amountDetails);

		RedirectUrls redirectUrls = new RedirectUrls();
		redirectUrls.setCancelUrl("http://localhost:8080/");
		redirectUrls.setReturnUrl("http://localhost:8080/approve/" + orderId);

		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		transaction.setDescription("Test");
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(transaction);
		
		PayerInfo payerInfo = new PayerInfo();
		payerInfo.setEmail("jake.park0120-buyer@gmail.com");

		Payer payer = new Payer();
		payer.setPaymentMethod("paypal");
		//payer.setPayerInfo(payerInfo);
		
		Payment payment = new Payment();
		payment.setIntent("sale");
		payment.setPayer(payer);
		payment.setRedirectUrls(redirectUrls);
		payment.setTransactions(transactions);
		Payment returnPayment = payment.create(apiContext);
		
		System.out.println(returnPayment);
		
		String approvalURL = getApprovalURL(returnPayment);		
		
		System.out.println(approvalURL);
		
		documentService.insertOrder(returnPayment, orderId);
    }
    
    @RequestMapping(value = "/approve/{orderId}", method = RequestMethod.GET)
    public void approvePaypal(@PathVariable String orderId, HttpServletRequest request) throws Exception {
    	String payerId = request.getParameter("PayerID");
		
		Order order = documentService.getOrderByOrderId(orderId);
		
		System.out.println(order.getPaymentId() + "----approve----" + orderId);

		// Construct a payment for complete payment execution
		Payment payment = new Payment();
		payment.setId(order.getPaymentId());
		PaymentExecution paymentExecute = new PaymentExecution();
		paymentExecute.setPayerId(payerId);
		
		try {
			// set access token
			String accessToken = getAccessToken();
			String requestId = UUID.randomUUID().toString();
			APIContext apiContext = new APIContext(accessToken, requestId);
			payment = payment.execute(apiContext, paymentExecute);
		} catch (PayPalRESTException pex) {
			pex.printStackTrace();
		}
		
		System.out.println("----Payment====" + payment);
    }
    
    /*
	 * Retrieve approval URL form payment object
	 */
	private String getApprovalURL(Payment payment)
			throws UnsupportedEncodingException {
		String redirectUrl = null;
		List<Links> links = payment.getLinks();
		for (Links l : links) {
			if (l.getRel().equalsIgnoreCase("approval_url")) {
				redirectUrl = URLDecoder
						.decode(l.getHref(), "UTF-8");
				break;
			}
		}
		return redirectUrl;
	}
	
	public String getAccessToken() throws PayPalRESTException {
		// ###AccessToken
		// Retrieve the access token from
		// OAuthTokenCredential by passing in
		// ClientID and ClientSecret

		// ClientID and ClientSecret retrieved from configuration
		String clientID = "AcmGyUxTU8YdEzkWo5LbQrCXkKMnRVeEQOnBLhXEy0Uc8z2-X9ls3CMU8Ab2weHcNy2Zo0XVJlEyR0HQ";
		String clientSecret = "EI3FZ_pv9qpT3zBdH0aCcTgl_f8gUJgdHzXBTSl5-4eNIJKY6dO8EB3oYzSyUWv1lP40HyVl-1vdtaUy";
		return new OAuthTokenCredential(clientID, clientSecret).getAccessToken();
	}
}
