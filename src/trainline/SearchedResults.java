package trainline;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchedResults {
	
	WebDriver driver;
	
	public static void SearchedResult(WebDriver driver) {
		
		//defining web elements to be used in method
		String ContinueBtnPath = "//button[@title='Continue']";
		String From = "London";
	    String To = "Coventry";
		String SearchedFromPath = "//strong[@data-test='change-journey-header-origin']";
	    String SearchedToPath = "//strong[@data-test='change-journey-header-destination']";
	    
	    //Printing the total number of trains displayed.
		List<WebElement> elementcount = driver.findElements(By.xpath("//div[contains(@data-test,'column-result')]"));
	    System.out.println("Number of trains displayed : " +elementcount.size());
	   
	    //Verifying the From and To location are displayed correct.
	    String actualFromString = driver.findElement(By.xpath(SearchedFromPath)).getText();
	    Assert.assertEquals(actualFromString, From, "The From location didnt match");
	    String actualToString = driver.findElement(By.xpath(SearchedToPath)).getText();
	    Assert.assertEquals(actualToString, To, "The To location didnt match");
	    
	    //Clicking on continue button.
	    driver.findElement(By.xpath(ContinueBtnPath)).click();
	}

}
