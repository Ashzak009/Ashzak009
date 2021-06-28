package com.eshipz.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.eshipz.qa.base.BaseClass;

public class PickupWarehouseEditPage extends BaseClass
{
	int TimeOutValue= 40;

	public PickupWarehouseEditPage() 
	{
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeOutValue), this);		
	}

	@FindBy(id="company_name")
	public static WebElement pic_company_name_field;

	@FindBy(id="contact_name")
	public static WebElement pic_name_field;

	@FindBy(id="email")
	public static WebElement pic_email_field;

	@FindBy(id="phone")
	public static WebElement pic_phone_field;

	@FindBy(id="street1")
	public static WebElement pic_address_line1_field;

	@FindBy(id="street2")
	public static WebElement pic_address_line2_field;

	@FindBy(id="street3")
	public static WebElement pic_address_line3_field;

	@FindBy(xpath="(//input[@class='select-dropdown'])[1]")
	public static WebElement pic_country_dropdown;

	@FindBy(id="state")
	public static WebElement pic_state_field;

	@FindBy(id="city")
	public static WebElement pic_city_field;

	@FindBy(id="postal_code")
	public static WebElement pic_pincode_field;

	@FindBy(xpath="(//input[@class='select-dropdown'])[2]")
	public static WebElement pic_address_type_dropdown;

	@FindBy(id="tax_id")
	public static WebElement pic_taxid_gstin_field;

	@FindBy(id="fax")
	WebElement pic_fax_field;

	@FindBy(id="alias_name")
	public static WebElement pic_alias_name_field;

	@FindBy(name="action")
	WebElement pic_save_button;

	@FindBy(className="btn cancel-button")
	WebElement pic_back_button;
}
