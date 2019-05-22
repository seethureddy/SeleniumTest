package Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.LoginPage;
import Utility.BrowserFactory;

public class LoginPageTest {

	static WebDriver driver = null;
	static Properties prop = new Properties();
	String path = System.getProperty("user.dir");
	
	@Test
	public void verifyLoginPage() {
		
		try {
		
			InputStream inputStream = new FileInputStream(path+"/src/test/java/Config/browser.properties");
			prop.load(inputStream);
			String browseName = prop.getProperty("browser");
			String url = prop.getProperty("url");
			driver = BrowserFactory.startBrowser(browseName, url);

			LoginPage page = PageFactory.initElements(driver, LoginPage.class);
			page.geSearchText("PAge Factory Sample");
			page.clickButton();
			page.loginButtonPress();
			
			page.userDetails("ABCS", "123455");
			page.submitPage();
			
			driver.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException io) {
			
		}
		
	}
}
