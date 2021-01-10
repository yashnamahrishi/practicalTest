package trainline;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TravelOptions {
	
	WebDriver driver;
	
	public static void Preferences(WebDriver driver) {
		
		//defining web elements to be used in method
		String DirectionOptionPath = "//select[@id='direction']";
	    String PositionOptionPath = "//select[@id='position']";
	    String CoachOptionPath = "//select[@id='carriageType']";
	    
	    //selecting the travel options, as they are not available for all trains, kept it in try block 
	    try{
	    	 driver.findElements(By.xpath(DirectionOptionPath));
	    	 System.out.println("Travel options are available");
	    	 Select selectDirection = new Select(driver.findElement(By.xpath(DirectionOptionPath)));
			    selectDirection.selectByVisibleText("Backward facing");
			    Select selectPosition = new Select(driver.findElement(By.xpath(PositionOptionPath)));
			    selectPosition.selectByValue("Window");
			    Select selectCoach = new Select(driver.findElement(By.xpath(CoachOptionPath)));
			    selectCoach.selectByValue("Quiet");
			    
			    String TableSeatChkbxPath = "//input[@id='facilities.tableSeat']";
			    driver.findElement(By.xpath(TableSeatChkbxPath)).click();
			    String NearToiletChkbxPath = "//input[@id='facilities.nearToilet']";
			    driver.findElement(By.xpath(NearToiletChkbxPath)).click();
			    String ContinueOptionsBtnPath = "//button[@title='Continue']";
			    driver.findElement(By.xpath(ContinueOptionsBtnPath)).click();
	    	}
	    	catch(NoSuchElementException e){
	    	 System.out.println("Travel options not available");
	    	}
	}

}
