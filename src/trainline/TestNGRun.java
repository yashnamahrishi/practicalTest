package trainline;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGRun {
			
	WebDriver driver;
	
			@BeforeTest
			public void LaunchBrowser() {
				
				//1.Navigate to  https://www.thetrainline.com/ 	
				driver = BrowserUtil.LaunchApplication();
			
			}
			@Test
			public void testCase() {
				
				FindTrain.AcceptCookies(driver);
			
				//2.Enter From and To as shown in the screen shot and select ‘tomorrow’ 
				//3.Click on ‘Get times and ticket’ 
				FindTrain.SearchingTrains(driver);
		    
		  
			    //4.Wait for the results to display 
			    //5.Print the total number of trains displayed.
			    //6.Verify the From and To location are displayed correct.
			    //7.Click on continue button.
				SearchedResults.SearchedResult(driver);
		  
		    
				//8.Next page select the options as shown in the below screen shot and click on continue.
				TravelOptions.Preferences(driver);
		    		    
		    
				//9.In next page select the option as shown in screen shot and enter your email id  then click continue as guest.
				UserSignIn.Signin(driver);
		    
		   
				//10.In the next page ,  read the fair and Print it . provide an assertion , if fair >20 test should fail 
				//And if fair <20  test should pass.  
				DeliveryOption.GetFare(driver);
			
			}
				
			@AfterTest
			public void ClosingBrowser() {
					
				//closing the web application
				BrowserUtil.CloseApplication(driver);
		  
			}
			
}
