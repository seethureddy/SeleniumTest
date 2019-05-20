package Utility;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	static WebDriver driver = null;
	
	public static WebDriver startBrowser(String BrowserName, String url) {
		
		if(BrowserName.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		}
		
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get(url);
		
		return driver;
	}
}
