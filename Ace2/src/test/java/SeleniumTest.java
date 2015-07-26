package test.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	private static WebDriver driver = null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a new instance of the Firefox driver		 
        driver = new FirefoxDriver();
        
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website 
        driver.get("http://localhost:8080/");
        
        login();
        
        //add();
        
        edit();
        
        //testCommand();
 
        // Find the element that's ID attribute is 'account_logout' (Log Out) 
        //driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
        
        // Print a Log In message to the screen        
        //System.out.println("LogOut Successfully");
 
        // Close the driver 
        //driver.quit();
	}
	
	public static void login() { 
        // Find the element that's ID attribute is 'account'(My Account) 
        //driver.findElement(By.xpath(".//*[@name='email']/a")).click();
 
        // Find the element that's ID attribute is 'log' (Username)
 
        // Enter Username on the element found by above desc. 
        driver.findElement(By.name("email")).sendKeys("asdf@asdf.com"); 
 
        // Find the element that's ID attribute is 'pwd' (Password)
 
        // Enter Password on the element found by the above desc. 
        driver.findElement(By.name("password")).sendKeys("asdf");
 
        // Now submit the form. WebDriver will find the form for us from the element 
        driver.findElement(By.xpath("//input[@type='submit']")).click();
 
        // Print a Log In message to the screen 
        System.out.println("Login Successfully");		
	}
	
	public static void add() {
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println("Current Url : " + currentUrl);
		
        // Click on "Partial Link Text" link
        driver.findElement(By.linkText("Add")).click();
        
        driver.findElement(By.name("email")).sendKeys("asdf1@asdf.com"); 
        driver.findElement(By.name("password")).sendKeys("asdf"); 
        driver.findElement(By.name("confirmPassword")).sendKeys("asdf"); 
        driver.findElement(By.name("name")).sendKeys("asdf"); 
        driver.findElement(By.name("mobileNumber")).sendKeys("1234"); 
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
		// Storing Page Source in String variable 
        //String sPageSource = driver.getPageSource();
        
		// Printing Page Source on console 
        //System.out.println("Page Source : " + sPageSource);    
        System.out.println("Add Successfully");		
	}
	
	public static void edit() {
		driver.findElement(By.linkText("List")).click();
		
        // Click on first row and second column of the table		 
        WebElement we = driver.findElement(By.className("table-striped"));
        we.findElement(By.xpath("./tbody/tr[1]/td[2]/a")).click();
        
        // Edit Phone Number
        driver.findElement(By.name("password")).sendKeys("asdf"); 
        driver.findElement(By.name("confirmPassword")).sendKeys("asdf");
        driver.findElement(By.name("mobileNumber")).clear();
        driver.findElement(By.name("mobileNumber")).sendKeys("1"); 
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        System.out.println("Edit Successfully");		
	}	

	public static void testCommand() {
		// Storing Title name in String variable		 
        String sTitle = driver.getTitle();
 
		// Storing Title length in Int variable 
        int iTitleLength = driver.getTitle().length();
 
		// Printing Title name on Console 
        System.out.println("Title : " + sTitle);
 
		// Printing Title length on console 
        System.out.println("Title Length : " + iTitleLength);
 
		// Storing URL in String variable 
        sTitle = driver.getCurrentUrl();
 
		// Storing URL length in Int variable 
        iTitleLength = driver.getCurrentUrl().length();
 
		// Printing URL on Console 
        System.out.println("Current Url : " + sTitle);
 
		// Printing URL length on console 
        System.out.println("Current Url Length : " + iTitleLength);
 
		// Refreshing current page 
        driver.get(driver.getCurrentUrl());  
 
		// Storing Page Source in String variable 
        String sPageSource = driver.getPageSource();
 
		// Storing Page Source length in Int variable 
        int iPageSourceLength = driver.getPageSource().length();
 
		// Printing Page Source on console 
        System.out.println("Page Source : " + sPageSource);
 
		// Printing Page SOurce length on console 
        System.out.println("Page Source Length : " + iPageSourceLength);
 
		//Closing browser
	}
}
