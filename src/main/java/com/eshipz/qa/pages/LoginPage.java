package com.eshipz.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.eshipz.qa.base.BaseClass;

public class LoginPage extends BaseClass
{
	int TimeOutValue= 30;

	public LoginPage() 
	{
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,TimeOutValue), this);
	}

	@FindBy(className="logo-img responsive-img")
	WebElement logo;
	
	@FindBy(xpath="(//h5)[1]")
	WebElement welcomeText;
	
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
	
	@FindBy(xpath="//div[@class='row']//h5")
	WebElement dont_have_acc_text;
	
	@FindBy(xpath="//a[contains(.,'Create account')]")
	WebElement create_account_btn;
	
	//method to verify logo
	//method to verify welcome text
	//method to verify dont have account text
	//method to click on create account button
	//method to click on verify email
	//method to click on forgot password
	//method to check remember_me functionality
	public HomePage eshipzLogin(String username, String password)
	{
		login_userName.sendKeys(username);
		login_password.sendKeys(password);
		loginButton.click();
		return new HomePage();
	}
}
