package com.eshipz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.eshipz.qa.base.BaseClass;

public class DeliveryWarehouseEditPage extends BaseClass
{

int TimeOutValue= 40;
	
	public DeliveryWarehouseEditPage() 
	{
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeOutValue), this);		
	}
	
	@FindBy(id="company_name")
	public static WebElement del_company_name_field;
	
	@FindBy(id="contact_name")
	public static WebElement del_name_field;
	
	@FindBy(id="email")
	public static WebElement del_email_field;
	
	@FindBy(id="phone")
	public static WebElement del_phone_field;
	
	@FindBy(id="street1")
	public static WebElement del_address_line1_field;
	
	@FindBy(id="street2")
	public static WebElement del_address_line2_field;
	
	@FindBy(id="street3")
	public static WebElement del_address_line3_field;
	
	@FindBy(xpath="(//input[@class='select-dropdown'])[1]")
	public static WebElement del_country_dropdown;
	
	@FindBy(id="state")
	public static WebElement del_state_field;
	
	@FindBy(id="city")
	public static WebElement del_city_field;
	
	@FindBy(id="postal_code")
	public static WebElement del_pincode_field;
	
	@FindBy(id="(//input[@class='select-dropdown'])[2]")
	public static WebElement del_address_type_dropdown;
	
	@FindBy(id="tax_id")
	public static WebElement del_taxid_gstin_field;
	
	@FindBy(id="fax")
	WebElement del_fax_field;
	
	@FindBy(id="alias_name")
	public static WebElement del_alias_name_field;
	
	@FindBy(name="action")
	WebElement del_pic_save_button;
	
	@FindBy(className="btn cancel-button")
	WebElement del_back_button;
	
}
