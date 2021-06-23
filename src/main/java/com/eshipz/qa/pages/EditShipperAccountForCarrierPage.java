package com.eshipz.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eshipz.qa.base.BaseClass;
import com.eshipz.qa.utils.Utilities;

public class EditShipperAccountForCarrierPage extends BaseClass {
	public int TimeoutValue = 30;
	WebDriverWait wait = new WebDriverWait(driver, Utilities.DRIVER_TIMEOUT);
	Actions actions = new Actions(driver);

	public EditShipperAccountForCarrierPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
	}
	
	@FindBy(xpath="//h5[@class='sidenav-heading']")
	WebElement page_text;
	
//	@FindBy(xpath="(//div[@class='select-wrapper validate'])[2]")
//	WebElement specialServiceSignatureOption_dropdown;
	
	@FindBy(id="signature_option")
	WebElement specialServiceSignatureOption_dropdown;
	
	@FindBy(xpath="(//div[@class='select-wrapper validate'])[3]")
	WebElement dutiesPaymentBy_dropdown ;
	
	@FindBy(xpath="(//div[@class='select-wrapper validate'])[4]")
	WebElement freightPaymentBy_dropdown ;
	
	@FindBy(xpath="//ul/li/span[.='ADULT']")
	WebElement adult_option;
	
	@FindBy(xpath="//ul/li/span[.='INDIRECT']")
	WebElement indirect_option;
	
	@FindBy(xpath="//button[contains(.,'Validate & Save')]")
	WebElement validatensave_button;
	
	public String verifyEditShipperAccountPage()
	{
		return page_text.getText();
	}

	public void selectSpecialService(String signature_option)
	{
		actions.doubleClick(specialServiceSignatureOption_dropdown).perform();
		//indirect_option.click();
		String s1= "//ul/li/span[.='";
		String s2="']";
		String s= s1+signature_option+s2;
		driver.findElement(By.xpath(s)).click();
	}
	
	public void selectDutiesPaymentBy(String duties_payment_by)
	{
		actions.doubleClick(dutiesPaymentBy_dropdown).perform();
		String s1= "//ul/li/span[contains(.,'";
		String s2="')]";
		String s= s1+duties_payment_by+s2;
		driver.findElement(By.xpath(s)).click();
	}
	
	public void selectFreightPaymentBy(String freight_payment_by)
	{
		actions.doubleClick(freightPaymentBy_dropdown).perform();
		String s1= "//ul/li/span[.='";
		String s2="']";
		String s= s1+freight_payment_by+s2;
		driver.findElement(By.xpath(s)).click();
	}
	
	public void clickOnValidateNSave()
	{
		validatensave_button.click();
	}
}
