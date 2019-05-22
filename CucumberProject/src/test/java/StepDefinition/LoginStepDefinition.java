package StepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageDefinition.LoginPageDef;
import Utility.BrowserFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	static Properties prop = new Properties();
	String path = System.getProperty("user.dir");
	
	LoginPageDef pageDef;
	
	@Given("user is on wordpress.org website")
	public void user_is_on_wordpress_org_website() {
		driver = BrowserFactory.startBrowser("chrome", "https://wordpress.org");
		pageDef = PageFactory.initElements(driver, LoginPageDef.class);
	}

	@When("user enter some text and click enter")
	public void user_enter_some_text_and_click_enter() {
		pageDef.geSearchText("Page Factory Sample");
		pageDef.clickGetWordPress();
	}

	@Then("click on login button in the new screen")
	public void click_on_login_button_in_the_new_screen() {
		pageDef.loginButtonPress();
	}

	@When("user is on Login Screen and enter Valid Username and Password")
	public void user_is_on_Login_Screen() {
		pageDef.userDetails("ABCS", "123455");
	}

	@Then("click Submit to Validate")
	public void click_Submit_to_Validate() {
		pageDef.submitPage();
	}
}
