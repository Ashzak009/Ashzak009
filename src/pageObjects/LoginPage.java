package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage 
{
	WebDriver driver;
	int TimeOutValue= 30;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,TimeOutValue), this);
	}

	@FindBy(id="email")
	WebElement login_userName;
	
	@FindBy(id="password")
	WebElement login_password;
	
	@FindBy()
	WebElement rememberMe;
	
	@FindBy()
	WebElement verifyEmail;
	
	@FindBy()
	WebElement forgotPassword;
	
	@FindBy(id="login-submit")
	WebElement loginButton;
	
	public void eshipzLogin(String username, String password)
	{
		login_userName.sendKeys(username);
		login_password.sendKeys(password);
		loginButton.click();
	}
	
}
