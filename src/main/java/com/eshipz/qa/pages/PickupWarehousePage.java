package com.eshipz.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.eshipz.qa.base.BaseClass;

public class PickupWarehousePage extends BaseClass
{
	int TimeOutValue= 40;

	public PickupWarehousePage() 
	{
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeOutValue), this);		
	}

	@FindBy(className = "set_default_warehouse green-text")
	WebElement pic_primary_warehouse;

	@FindBy(xpath = "//a[@id='set_default']")
	public static List<WebElement> pic_warehouse_icon;

	public  PickupWarehouseEditPage clickOnEditWarehouseDetails(String warehouse_id)
	{
		String edit_warehouse_details= "//a[@data-wh_address='"+warehouse_id+"']/following-sibling::a/i[.='edit']";

		if(driver.findElement(By.xpath(edit_warehouse_details)).isDisplayed())
		{
			driver.findElement(By.xpath(edit_warehouse_details)).click();
		}
		return new PickupWarehouseEditPage();
	}

	public static void clickOnDeleteWarehouse(String warehouse_id)
	{
		String delete_warehouse="//a[@data-wh_address='"+warehouse_id+"']/i[.='delete_forever']";
		if(driver.findElement(By.xpath(delete_warehouse)).isDisplayed())
		{
			driver.findElement(By.xpath(delete_warehouse)).click();
		}
	}
	public static boolean checkDefaultWarehouseForId(String warehouse_id)
	{
		String warehouse_icon= "//a[@data-wh_address='"+warehouse_id+"']/following-sibling::a[2]";
		String class_of_ele = driver.findElement(By.xpath(warehouse_icon)).getAttribute("class");
		boolean res = false;
		if(class_of_ele.equalsIgnoreCase("set_default_warehouse green-text "))
			res= true;
		return res;
	}

	public String checkForDefaultWarehouse()
	{
		String res="";
		for(WebElement el: pic_warehouse_icon)
		{
			String val = el.getAttribute("class");
			if(val.equalsIgnoreCase("set_default_warehouse green-text "))
			{
				res=el.getAttribute("data-wh_address");
			}
		}
		return res;
	}
	
	
}
