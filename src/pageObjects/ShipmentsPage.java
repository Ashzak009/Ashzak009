package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShipmentsPage 
{
	WebDriver driver;
	
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
	@FindBy(xpath="(//span[@class='helper-text'])[1]")
	public WebElement shipment_id_1;
	
	@FindBy(xpath="(//span[@class='hyperlink'])[1]")
	public WebElement order_id_1;
	
	@FindBy(xpath="(//td[@class='order_tab tooltipped'])[1]")
	public WebElement shipper_name_1;
	
	@FindBy(xpath="(//td[@class='order_tab tooltipped'])[2]")
	public WebElement product_1;
	
	@FindBy(xpath="(//a[@title='Track Shipment'])[1]")
	public WebElement AWB_1;
	
	@FindBy(xpath="(//td[@class='order_tab'])[2]")
	public WebElement shipment_date_1;
	
	@FindBy(xpath="(//td[@class='order_tab'])[3]")
	public WebElement shipping_charges_1;
	
	@FindBy(xpath="(//td[@class='order_tab'])[4]")
	public WebElement shipped_via_1;
	
	@FindBy(xpath="(//td[@class='order_tab'])[5]")
	public WebElement expected_delivery_1;
	
	//-----Action-----
	@FindBy(xpath="(//i[.='cancel'])[1]")
	public WebElement cancel_order_1;
	
	@FindBy(xpath="(//i[.='schedule'])[1]")
	public WebElement schedule_shipment_1;
	
	@FindBy(xpath="(//i[.='receipt'])[2]")
	public WebElement invoice_1;
	
	@FindBy(xpath="(//a[@title='Declaration'])[1]")
	public WebElement declaration_1;
	
	@FindBy(xpath="(//i[.='file_download'])[1]")
	public WebElement label_download_1;
	
	@FindBy(xpath="(//i[.='event_note'])[1]")
	public WebElement manifest_icon_1;
	
	//-----sender details------
	@FindBy(xpath="(//span[@id='sender_contact_name'])[1]")
	public WebElement send_name_1;
	
	@FindBy(xpath="(//span[@id='sender_company_name'])[1]")
	public WebElement send_company_name_1;
	
	@FindBy(xpath="(//span[@id='sender_phone'])[1]")
	public WebElement send_ph_number_1;
	
	@FindBy(xpath="(//span[@id='sender_email'])[1]")
	public WebElement send_email_1;
	
	@FindBy(xpath="(//span[@id='sender_type'])[1]")
	public WebElement send_address_type_1;
	
	@FindBy(xpath="(//span[@id='sender_street1'])[1]")
	public WebElement send_add1_1;
	
	@FindBy(xpath="(//span[@id='sender_street2'])[1]")
	public WebElement send_add2_1;
	
	@FindBy(xpath="(//span[@id='sender_street3'])[1]")
	public WebElement send_add3_1;
	
	@FindBy(xpath="(//span[@id='sender_state'])[1]")
	public WebElement send_state_1;
	
	@FindBy(xpath="(//span[@id='sender_country'])[1]")
	public WebElement send_country_1;
	
	@FindBy(xpath="(//span[@id='sender_postal_code'])[1]")
	public WebElement send_pincode;
	
	@FindBy(xpath="(//span[@id='receiver_contact_name'])[1]")
	public WebElement rec_name;
	
	@FindBy(xpath="(//span[@id='receiver_company_name'])[1]")
	public WebElement rec_company_name;
	
	@FindBy(xpath="(//span[@id='receiver_phone'])[1]")
	public WebElement rec_ph_number;
	
	@FindBy(id="receiver_email")
	public WebElement rec_email;
	
	@FindBy(id="receiver_type")
	public WebElement rec_address_type;
	
	@FindBy(id="receiver_street1")
	public WebElement rec_add1;
	
	@FindBy(id="receiver_street2")
	public WebElement rec_add2;
	
	@FindBy(id="receiver_street3")
	public WebElement rec_add3;
	
	@FindBy(id="receiver_state")
	public WebElement rec_state;
	
	@FindBy(id="receiver_country")
	public WebElement rec_country;
	
	@FindBy(id="receiver_postal_code")
	public WebElement rec_pincode;
	
	@FindBy(id="return_contact_name")
	public WebElement rto_name;
	
	@FindBy(id="return_company_name")
	public WebElement rto_company_name;
	
	@FindBy(xpath="(//span[@id='return_phone'])[1]")
	public WebElement rto_ph_number_1;
	
	@FindBy(xpath="(//span[@id='return_email'])[1]")
	public WebElement rto_email_1;
	
	@FindBy(id="return_type")
	public WebElement rto_address_type;
	
	@FindBy()
	public WebElement rto_add1;
	
	@FindBy()
	public WebElement rto_add2;
	
	@FindBy()
	public WebElement rto_add3;
	
	@FindBy()
	public WebElement rto_state;
	
	@FindBy()
	public WebElement rto_country;
	
	@FindBy()
	public WebElement rto_pincode;
	
	//-----shipment details------
	@FindBy()
	public WebElement scanned_weight;
	
	@FindBy()
	public WebElement declared_weight;
	
	@FindBy()
	public WebElement service_type;
	
	@FindBy()
	public WebElement service_option;
	
	@FindBy()
	public WebElement shipment_purpose;
	
	@FindBy()
	public WebElement invoice_value;
	
	@FindBy()
	public WebElement shipment_type;
	
	@FindBy()
	public WebElement order_source;
	
	@FindBy()
	public WebElement box;
	
	@FindBy()
	public WebElement dimensions;
	
	@FindBy()
	public WebElement  description;
	

}
