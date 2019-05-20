package Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	ExtentHtmlReporter reporter;
	ExtentReports extentReport;
	
	WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		reporter = new ExtentHtmlReporter("extent.html");
		
		extentReport = new ExtentReports();
		
		extentReport.attachReporter(reporter);		
		
	}
	
	@BeforeTest
	public void GetDriver() {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("ignoreProtectedModeSettings", true);
		driver = new InternetExplorerDriver(capabilities);
	}
	
	@Test
	public void TestReports() throws IOException {
		
		ExtentTest test = extentReport.createTest("MyFirstTest", "Sample description");
		
		driver.get("https://www.google.com");
		
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.pass("Test Passed");
        //test.fail("details").addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
	
	@AfterSuite
	public void TearDown() {
		extentReport.flush();
	}
}
