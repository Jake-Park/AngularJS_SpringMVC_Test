package test.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
 
        // Find the element that's ID attribute is 'account_logout' (Log Out) 
        //driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
        
        // Print a Log In message to the screen        
        //System.out.println("LogOut Successfully");
 
        // Close the driver 
        //driver.quit();
	}

}
