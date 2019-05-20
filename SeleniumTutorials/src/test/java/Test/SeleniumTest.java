package Test;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	
	@Test
	public void SampleTest() {
		
//		WebDriverManager.chromedriver().setup();		
//		WebDriver driver = new InternetExplorerDriver();
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	    
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        test.log(Status.INFO, "This step shows usage of log(status, details)");

        test.info("This step shows usage of info(details)");
        test.pass("Test Passed");
       
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("This is Automation Test");
		//driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Test Xpath");
		//List<WebElement> webElement = driver.findElements(By.xpath("//input"));
		
		driver.close();
		driver.quit();
		extent.flush();
		//int a = webElement.size();
		//System.out.println("Count of Elements :" + a);
	}
}
