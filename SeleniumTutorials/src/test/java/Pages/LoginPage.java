package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	
     private WebDriver driver;
	
	By searchText = By.id("global-search");
    By linkText = By.linkText("Get WordPress");
    By login = By.linkText("Log In");
    
    @FindBy(how=How.ID,using="user_login")
    WebElement username;
    
    @FindBy(how=How.ID,using="user_pass")
    WebElement password;
    
    @FindBy(how=How.ID,using="rememberme")
    WebElement rememberMe;
    
    @FindBy(how=How.ID,using="wp-submit")
    WebElement submitButton;
    
    public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
		
	public void geSearchText(String key) {
		
//		username.sendKeys(uName);
//		password.sendKeys(pwd);
//		loginButton.click();
		driver.findElement(searchText).sendKeys(key);
	}
    
	public void clickButton() {
		driver.findElement(linkText).click();
		//driver.findElement(searchButton).sendKeys(Keys.ENTER);
	}
	
	public void loginButtonPress() {
		driver.findElement(login).click();
	}
	
	public void userDetails(String user, String pwd) {
		username.sendKeys(user);
		password.sendKeys(pwd);
		rememberMe.click();
	}
	
	public void submitPage() {
		submitButton.click();
	}
}
