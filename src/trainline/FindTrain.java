package trainline;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class FindTrain {
	
	WebDriver driver;
	
	public static void AcceptCookies(WebDriver driver) {
		
		//defining cookies pop-up xpath
		String AccptCookiesPath = "//button[normalize-space()='Accept cookies']";
		
		//if the pop-up appears, click ok; else printing pop up not present
		 try{
	    	 driver.findElement(By.xpath(AccptCookiesPath)).click();
	    	 System.out.println("Accept cookies pop up present");
	    	}
	    	catch(NoSuchElementException e){
	    	 System.out.println("Accept cookies pop up not present");
	    	}
		
	}
	
	public static void SearchingTrains(WebDriver driver) {
		
		//defining web elements to be used in method
		String FromPath = "//input[@id='from.search']";
		String From = "London";
	    String To = "Coventry";
	    String ToPath = "//input[@id='to.search']";
	    String TomorrowPath = "//button[@data-test='datepicker-next-day-button']";
	    String TimeTicketPath = "//button[@type='submit']";
	    
	    //entering From and To places, clicking tomorrow button
	    driver.findElement(By.xpath(FromPath)).sendKeys(From);
	    driver.findElement(By.xpath(FromPath)).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath(ToPath)).sendKeys(To); 
	    driver.findElement(By.xpath(ToPath)).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath(TomorrowPath)).click();
	    
	    
	    //clicking on get times and ticket button to search trains
	    driver.findElement(By.xpath(TimeTicketPath)).click();
	    try{
	    	 driver.findElement(By.xpath(TimeTicketPath)).click();
	    	 System.out.println("Clicked get times and ticket button on second time");
	    	}
	    	catch(NoSuchElementException e){
	    	 
	    	}   
	
	}

}
