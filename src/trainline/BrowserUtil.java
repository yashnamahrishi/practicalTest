package trainline;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtil {
	
	public static WebDriver LaunchApplication() {
		
		//defining web elements to be used in method
		WebDriver driver;
		String driverPath = "./chromedriver.exe";
		String Url = "https://www.thetrainline.com/";
		
		//launching application and managing browser
		System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDriver();
	    driver.get(Url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    return driver;
		
	}
   public static void CloseApplication(WebDriver driver) {
		
	   //closing the web application
		driver.quit();
		
	}
}
