package com.integrationwizards.common;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PingCheck {
	private static boolean accessToRetriever = false;
	private static boolean accessToM3 = false;
	
	@Scheduled(fixedDelay = 10000)
	private void sendPing() {
		// check Retriever server
		//setAccessToRetriever(sendPing(Constants.retrieverServerURL, 80));
		// check M3 server
		setAccessToM3(sendPing(Constants.m3ServerURL, Constants.m3ServerPort));
		
		//checkServerAlive();
		setAccessToRetriever(checkServerAlive("https://" + Constants.retrieverServerURL, 80));
		//setAccessToM3(checkServerAlive("http://" + Constants.m3ServerURL, Constants.m3ServerPort));
	}	
	
	/**
	 * Check target Server is alive
	 * @param URL
	 * @param port
	 * @return
	 */
	public boolean sendPing(String URL, int port) {
		Socket socket = null;
		boolean reachable = false;
		try {
		    socket = new Socket(URL, port);
		    reachable = true;
		}
		catch(IOException e) {
			System.out.println(e.getMessage() + " => " + URL + ":" + port);
		}
		finally {            
		    if (socket != null) try { socket.close(); } catch(IOException e) {}
		}
		
		return reachable;
	}
	
	/**
	 * Check target Server is alive with HTTP protocol
	 * @param URL
	 * @param port
	 * @return
	 */
	private boolean checkServerAlive(String URL, int port) {
		boolean reachable = false;
		String url = URL;
		
		if(port != 80) {
			URL += ":" + port;
		}
		
		try {
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	
			// optional default is GET
			con.setRequestMethod("GET");
	
			//add request header
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
			//con.setRequestProperty("Content-Type", "text/html; charset=UTF-8");
			con.setConnectTimeout(1000);
	
			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);
			
			if(responseCode == 200) {
				reachable = true;
			}
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage() + " => " + URL);
		}
		
		return reachable;
	}
	


	public static boolean isAccessToRetriever() {
		return accessToRetriever;
	}
	
	public void setAccessToRetriever(boolean accessToRetriever) {
		PingCheck.accessToRetriever = accessToRetriever;
	}

	public static boolean isAccessToM3() {
		return accessToM3;
	}

	public void setAccessToM3(boolean accessToM3) {
		PingCheck.accessToM3 = accessToM3;
	}
}
