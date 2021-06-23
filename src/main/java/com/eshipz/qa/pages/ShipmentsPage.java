package com.eshipz.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eshipz.qa.base.BaseClass;

public class ShipmentsPage extends BaseClass
{
	int TimeOutValue= 40;

	public ShipmentsPage() 
	{
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeOutValue), this);
	}
	//-------Filter block------
	@FindBy(id="toggle_filter")
	public WebElement show_hide_filter;

	@FindBy()
	public WebElement shipmentsafter;

	@FindBy()
	public WebElement shipmentsbefore;

	@FindBy(id="search_ids")
	public WebElement globalshipmentsearch;

	@FindBy(xpath="(//input[@class='select-dropdown'])[1]")
	public WebElement searchtype_dropdown;

	@FindBy(xpath="//span[contains(.,' Order IDs ')]")
	public WebElement searchtype_orderID;

	@FindBy(xpath="//span[contains(.,' Tracking IDs ')]")
	public WebElement searchtype_trackingID;

	@FindBy(xpath="//span[contains(.,'Shipment IDs ')]")
	public WebElement searchtype_shipmentID;

	@FindBy(xpath="//input[@value='Shipped Via']")
	public WebElement shippedvia_dropdown;

	@FindBy(xpath="//input[@value='Payment']")
	public WebElement payment_dropdown;

	@FindBy(xpath="//input[@value='Labels Processed']")
	public WebElement labelsprocessed_dropdown;

	@FindBy(xpath="//input[@value='Manifestation']")
	public WebElement manifestation_dropdown;

	@FindBy(xpath="//input[@value='Type']")
	public WebElement type_dropdown;

	@FindBy(xpath="//input[@title='Shipper Name']")
	public WebElement shipper;

	@FindBy(xpath="//input[@title='Receiver Name']")
	public WebElement receiver;

	@FindBy(id="search_shipments")
	public WebElement search_button;

	@FindBy(xpath="//a[@title='Reset Search']")
	public WebElement reset_search;

	//----Major tabs----
	@FindBy(xpath="(//a[contains(.,'Forward')])[2]")
	public WebElement forward_tab;

	@FindBy(xpath="(//a[contains(.,'Reverse')])[2]")
	public WebElement reverse_tab;

	@FindBy(xpath="//a[.='NDR']")
	public WebElement ndr_tab;

	//----Forward minor tabs----
	@FindBy(xpath="(//a[@class='active'])[1]")
	public WebElement for_all_shipments;

	@FindBy(xpath="//a[.='All Shipments']")
	public WebElement for_info_received;

	@FindBy(xpath="//a[.='Picked Up']")
	public WebElement for_picked_up;

	@FindBy(xpath="//a[.='In Transit']")
	public WebElement for_in_transit;

	@FindBy(xpath="//a[.='Exception']")
	public WebElement for_exception;

	@FindBy(xpath="//a[.='Out For Delivery']")
	public WebElement for_out_for_delivery;

	@FindBy(xpath="(//a[.='RTO'])[1]")
	public WebElement for_rto;

	@FindBy(xpath="(//a[.='Delivered'])[1]")
	public WebElement for_delivered;

	@FindBy(xpath="//a[.='Cancelled']")
	public WebElement for_cancelled;

	//----Reverse minor tabs----
	@FindBy(xpath="(//a[@class='active'])[1]")
	public WebElement rev_all_shipments;

	@FindBy(xpath="//a[.='All Shipments']")
	public WebElement rev_info_received;

	@FindBy(xpath="//a[.='Picked Up']")
	public WebElement rev_picked_up;

	@FindBy(xpath="//a[.='In Transit']")
	public WebElement rev_in_transit;

	@FindBy(xpath="//a[.='Exception']")
	public WebElement rev_exception;

	@FindBy(xpath="//a[.='Out For Delivery']")
	public WebElement rev_out_for_delivery;

	@FindBy(xpath="(//a[.='RTO'])[1]")
	public WebElement rev_rto;

	@FindBy(xpath="(//a[.='Delivered'])[1]")
	public WebElement rev_delivered;

	@FindBy(xpath="//a[.='Cancelled']")
	public WebElement rev_cancelled;

	//-----ndr minor tabs-----
	@FindBy(xpath="//a[@id='ndr-action-required']")
	public WebElement action_required_tab;

	@FindBy(xpath="//a[.='Action Requested']")
	public WebElement action_requested_tab;

	@FindBy(xpath="//a[.='Delivered']")
	public WebElement delivered_tab;

	@FindBy(xpath="//a[.='RTO']")
	public WebElement rto_tab;

	@FindBy(xpath="//a[@id='ndr-bulk-upload']")
	public WebElement bulk_ndr_action_tab;

	//-----fields under bulk ndr action -----
	@FindBy(xpath="//input[@name='file']")
	public WebElement select_file_button;

	@FindBy(xpath="//button[@id='upload_ndr']")
	public WebElement upload_button;

	@FindBy(xpath="//a[@id='download_ndr_file']")
	public WebElement ndr_filedownload;

	@FindBy(xpath="//a[contains(.,'Sample Format')]")
	public WebElement sample_format;

	@FindBy()
	public WebElement ndr_start_date;

	@FindBy()
	public WebElement ndr_end_date;

	@FindBy(xpath="//i[@id='closeIcon_bulk_ndr']")
	public WebElement close_ndr_popup;

	//-----------Forward/Reverse data-------------
	@FindBy(xpath="//div[@class='pagination-page-info']/b[2]")
	public WebElement total_shipment_count;

	@FindBy(xpath="//div[@class='pagination-page-info']/b[1]")
	public WebElement shipment_count_range;

	@FindBy(xpath="(//input[@class='select-dropdown'])[7]")
	public WebElement display_per_page;

	@FindBy(xpath="(//i[contains(.,'arrow_back')])[2]")
	public WebElement ndr_instruction;

	@FindBy(xpath="(//i[.='file_download'])[1]")
	public WebElement bulk_label_download;

	@FindBy(xpath="(//i[.='receipt'])[1]")
	public WebElement bulk_invoice_download;

	@FindBy(xpath="//i[.='low_priority']")
	public WebElement bulk_update_status;

	@FindBy(xpath="(//i[.='event_note'])[1]")
	public WebElement bulk_manifest;

	@FindBy(xpath="//label[@for='myCheckbox']")
	public WebElement select_all_checkbox;

	//-------------shipments data--------------
	@FindBy(xpath="//span[@class='helper-text']")
	public List<WebElement> shipment_id;

	@FindBy(xpath="//span[@class='hyperlink']")
	public static List<WebElement> order_id;

	@FindBy(xpath="(//td[@class='order_tab tooltipped'])[1]")
	public WebElement shipper_name;

	@FindBy(xpath="(//td[@class='order_tab tooltipped'])[2]")
	public static WebElement product;

	@FindBy(xpath="//a[@title='Track Shipment']")
	public WebElement AWB;

	@FindBy(xpath="(//td[@class='order_tab'])[2]")
	public WebElement shipment_date;

	@FindBy(xpath="(//td[@class='order_tab'])[3]")
	public WebElement shipping_charges;

	@FindBy(xpath="(//td[@class='order_tab'])[4]")
	public WebElement shipped_via;

	@FindBy(xpath="(//td[@class='order_tab'])[5]")
	public WebElement expected_delivery;

	//-----Action-----
	@FindBy(xpath="//i[.='cancel']")
	public WebElement cancel_order;

	@FindBy(xpath="//i[.='schedule']")
	public WebElement schedule_shipment;

	@FindBy(xpath="//i[.='receipt']")
	public WebElement invoice;

	@FindBy(xpath="//a[@title='Declaration']")
	public WebElement declaration;

	@FindBy(xpath="//i[.='file_download']")
	public WebElement label_download;

	@FindBy(xpath="//i[.='event_note']")
	public WebElement manifest_icon;

	//-----sender details------
	@FindBy(xpath="//span[@id='sender_contact_name']")
	public static WebElement send_name;

	@FindBy(xpath="//span[@id='sender_company_name']")
	public static WebElement send_company_name;

	@FindBy(xpath="//span[@id='sender_phone']")
	public static WebElement send_ph_number;

	@FindBy(xpath="//span[@id='sender_email']")
	public static WebElement send_email;

	@FindBy(xpath="//span[@id='sender_type']")
	public static WebElement send_address_type;

	@FindBy(xpath="//span[@id='sender_street1']")
	public static WebElement send_add1;

	@FindBy(xpath="//span[@id='sender_street2']")
	public static WebElement send_add2;

	@FindBy(xpath="//span[@id='sender_street3']")
	public static WebElement send_add3;

	@FindBy(xpath="//span[@id='sender_state']")
	public static WebElement send_state;

	@FindBy(xpath="//span[@id='sender_country']")
	public static WebElement send_country;

	@FindBy(xpath="//span[@id='sender_postal_code']")
	public static WebElement send_pincode;

	@FindBy(xpath="//span[@id='receiver_contact_name']")
	public static WebElement rec_name;

	@FindBy(xpath="//span[@id='receiver_company_name']")
	public static WebElement rec_company_name;

	@FindBy(xpath="//span[@id='receiver_phone']")
	public static WebElement rec_ph_number;

	@FindBy(id="receiver_email")
	public static WebElement rec_email;

	@FindBy(id="receiver_type")
	public static WebElement rec_address_type;

	@FindBy(id="receiver_street1")
	public static WebElement rec_add1;

	@FindBy(id="receiver_street2")
	public static WebElement rec_add2;

	@FindBy(id="receiver_street3")
	public static WebElement rec_add3;

	@FindBy(id="receiver_state")
	public static WebElement rec_state;

	@FindBy(id="receiver_country")
	public static WebElement rec_country;

	@FindBy(id="receiver_postal_code")
	public static WebElement rec_pincode;

	@FindBy(id="return_contact_name")
	public static WebElement rto_name;

	@FindBy(id="return_company_name")
	public static WebElement rto_company_name;

	@FindBy(id="return_phone")
	public static WebElement rto_ph_number;

	@FindBy(id="return_email")
	public static WebElement rto_email;

	@FindBy(id="return_type")
	public static WebElement rto_address_type;

	@FindBy(id="return_street1")
	public static WebElement rto_add1;

	@FindBy(id="return_street2")
	public static WebElement rto_add2;

	@FindBy(id="return_street3")
	public static WebElement rto_add3;

	@FindBy(id="return_state")
	public static WebElement rto_state;

	@FindBy(id="return_country")
	public static WebElement rto_country;

	@FindBy(id="return_postal_code")
	public static WebElement rto_pincode;

	//-----shipment details------
	@FindBy(id="scanned_weight")
	public WebElement scanned_weight;

	@FindBy(id="declared_weight")
	public static WebElement declared_weight;

	@FindBy(id="service_type")
	public static WebElement service_type;

	@FindBy(id="service_option")
	public static WebElement service_option;

	@FindBy(id="shipment_purpose")
	public static WebElement shipment_purpose;

	@FindBy(id="invoice_value")
	public static WebElement invoice_value;

	@FindBy(xpath="//tr[@id='more1']/td[4]/span[8]")
	public static WebElement shipment_type_1;

	@FindBy(xpath="//span[@id='invoice_value']//following-sibling::span[2]")
	public static WebElement order_source;

	@FindBy()
	public WebElement box;

	@FindBy(xpath="//td[@colspan='3']//td[@class='order_tab'][2]")
	public static WebElement dimensions;

	@FindBy()
	public WebElement  description;


	public void searchGlobaly(String ref_id)
	{
		globalshipmentsearch.sendKeys(ref_id);
	}

	public void searchByShipmentID()
	{
		searchtype_dropdown.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(searchtype_shipmentID));
		if(searchtype_shipmentID.isDisplayed()==true)
		{
			searchtype_shipmentID.click();
		}
	}

	public void searchByOrderID()
	{
		searchtype_dropdown.click();
		if(searchtype_orderID.isDisplayed()==true)
		{
			searchtype_orderID.click();
		}
	}
	public void searchByTrackingID()
	{
		searchtype_dropdown.click();
		if(searchtype_trackingID.isDisplayed()==true)
		{
			searchtype_trackingID.click();
		}
	}

	public void clickOnSearchBtn()
	{
		search_button.click();
	}

	public void compareShipmentData(String ezNum)
	{
		for(int i=0;i<shipment_id.size();i++)
			if(shipment_id.get(i).getText()==ezNum)
				System.out.println("Order is displayed on Shipments page");
	}
	public void clickOnOrderID()
	{
		for(WebElement orderId: order_id)
			orderId.click();
	}
	public static String[] splitDimensions() 
	{
		String dim = dimensions.getText();
		String[] di = dim.split("*");
		return di;
	}

	public void labelDownloadOnEZNumber(String ezNum)
	//public void getTheEzNClickOnOrder(String ezNum)
	{
		for(int i=0;i<shipment_id.size();i++)
		{
			//if(shipment_id.get(i).getText().equalsIgnoreCase(ezNum) && order_id.get(i).getText().equalsIgnoreCase(custm_ref))
			if(shipment_id.get(i).getText().equalsIgnoreCase(ezNum))	
			{
				String s1="//a[@href='/batch-labels?order_ids=";
				String s2="']/i[.='file_download']";
				String s=s1+ezNum+s2;
				driver.findElement(By.xpath(s)).click();
			}
		}
	}
	public void getTheEzNExpandOrder(List<String> ezNum)
	{
		for(String ezs: ezNum)
		{
			String s1= "//span[text()='";
			String s2= "']/following-sibling::span";
			String num= s1+ezs+s2;
			driver.findElement(By.xpath(num)).click();
		}
	}

	public void getTheEzNExpandOrder(String ezNum)
	{
		String s1= "//span[text()='";
		String s2= "']/following-sibling::span";
		String num= s1+ezNum+s2;
		driver.findElement(By.xpath(num)).click();
	}

	public void clickOnReset()
	{
		reset_search.click();
	}
}
