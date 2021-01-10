package trainline;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeliveryOption {
	
	WebDriver driver;
	public static void GetFare(WebDriver driver) { 
		
		//defining web elements to be used in method
	    String TrainFarePath = "//span[@class='_1vk5zhek']/span";
	    
	    //reading the fare and Printing it
	    String TrainFare = driver.findElement(By.xpath(TrainFarePath)).getText();
	    System.out.println("Journey Cost : " +TrainFare);
	    
	    //removing the currency to compare as float value and then putting assertion
	    TrainFare = TrainFare.replaceAll ("£", "");
	    TrainFare = TrainFare.replaceAll ("€", "");
	    TrainFare = TrainFare.replaceAll ("$", "");
	    float Fare = Float.parseFloat(TrainFare);
	    
	     if(Fare<20) {
	    	//assertEquals(Fare,Fare,"Journey is more than 20");
	    	System.out.println("Fare is less than 20");
	    	assertTrue(true);
	    			    
	    } 
	     else  {
	    	 System.out.println("Fare is more than 20");
	     	assertTrue(false);
	     }
	}

}
