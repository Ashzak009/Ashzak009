package com.eshipz.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eshipz.qa.base.BaseClass;
import com.eshipz.qa.utils.Utilities;

public class ShipperAccountPage extends BaseClass 
{
	public int TimeoutValue = 30;
	WebDriverWait wait = new WebDriverWait(driver, Utilities.DRIVER_TIMEOUT);

	public ShipperAccountPage()
	{
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
	}

	@FindBy(xpath="//tr/td[2]")
	List<WebElement> carrier_column;
	
	@FindBy(xpath="//i[.='edit']")
	List<WebElement> edit;
	
	@FindBy(xpath="//h5[@class='sidenav-heading']")
	WebElement shipperAccountText;

	public EditShipperAccountForCarrierPage identifyRowAndClickOnEdit(String carrier_name)
	{
		for(WebElement carrier: carrier_column)
		{
			if(carrier.getText().equalsIgnoreCase(carrier_name))
			{
				String s1="//td[.='";
				String s2="']/following-sibling::td[3]/a/i[.='edit']";
				String s=s1+carrier.getText()+s2;
				driver.findElement(By.xpath(s)).click();
			}
		}
		return new EditShipperAccountForCarrierPage();
	}
	
	public String verifyShipperAccountPage()
	{
		return shipperAccountText.getText();
	}
}
