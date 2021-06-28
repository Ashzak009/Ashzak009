package com.eshipz.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.eshipz.qa.base.BaseClass;

public class RtoWarehousePage extends BaseClass
{
int TimeOutValue= 40;
	
	public RtoWarehousePage() 
	{
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeOutValue), this);		
	}
	
	@FindBy(className="set_default_warehouse green-text")
	WebElement rto_primary_warehouse;
	
	@FindBy(id="set_default")
	WebElement rto_warehouse_icon;
	
	public static DeliveryWarehouseEditPage clickOnEditWarehouseDetails(String warehouse_id)
	{
		String edit_warehouse_details= "//a[@data-wh_address='"+warehouse_id+"']/following-sibling::a/i[.='edit']";
		
		if(driver.findElement(By.xpath(edit_warehouse_details)).isDisplayed())
		{
			driver.findElement(By.xpath(edit_warehouse_details)).click();
		}
		return new DeliveryWarehouseEditPage();
	}
	
	public static void clickOnDeleteWarehouse(String warehouse_id)
	{
		String delete_warehouse="//a[@data-wh_address='"+warehouse_id+"']/i[.='delete_forever']";
		if(driver.findElement(By.xpath(delete_warehouse)).isDisplayed())
		{
			driver.findElement(By.xpath(delete_warehouse)).click();
		}
	}
}
