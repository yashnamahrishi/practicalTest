package trainline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserSignIn {
	
	WebDriver driver;
	
	public static void Signin(WebDriver driver) {
		
		//defining web elements to be used in method
		String IamNewCustomerChkboxPath = "//input[@type='radio' and @value='true']";
		String EnterEmailIDPath = "//input[@placeholder='Email']";
		String ContinueAsGuestPath = "//button[@type='submit']";
		
		//entering my email id then continuing as guest
	    driver.findElement(By.xpath(IamNewCustomerChkboxPath)).click();
	    driver.findElement(By.xpath(EnterEmailIDPath)).sendKeys("testuser321@gmail.com");
	    driver.findElement(By.xpath(ContinueAsGuestPath)).click();
		    
	}

}
