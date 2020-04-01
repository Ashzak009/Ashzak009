package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShipmentsPage 
{
	WebDriver driver;
	
	//-------Filter block------
	@FindBy(id="toggle_filter")
	WebElement show_hide_filter;
	
	@FindBy()
	WebElement shipmentsafter;
	
	@FindBy()
	WebElement shipmentsbefore;
	
	@FindBy(id="search_ids")
	WebElement globalshipmentsearch;
	
	@FindBy(xpath="(//input[@class='select-dropdown'])[1]")
	WebElement searchtype_dropdown;
	
	@FindBy(xpath="//input[@value='Shipped Via']")
	WebElement shippedvia_dropdown;
	
	@FindBy(xpath="//input[@value='Payment']")
	WebElement payment_dropdown;
	
	@FindBy(xpath="//input[@value='Labels Processed']")
	WebElement labelsprocessed_dropdown;
	
	@FindBy(xpath="//input[@value='Manifestation']")
	WebElement manifestation_dropdown;
	
	@FindBy(xpath="//input[@value='Type']")
	WebElement type_dropdown;
	
	@FindBy(xpath="//input[@title='Shipper Name']")
	WebElement shipper;
	
	@FindBy(xpath="//input[@title='Receiver Name']")
	WebElement receiver;
	
	@FindBy(id="search_shipments")
	WebElement search_button;
	
	@FindBy(xpath="//a[@title='Reset Search']")
	WebElement reset_search;
	
	//----Major tabs----
	@FindBy(xpath="(//a[contains(.,'Forward')])[2]")
	WebElement forward_tab;
	
	@FindBy(xpath="(//a[contains(.,'Reverse')])[2]")
	WebElement reverse_tab;
	
	@FindBy(xpath="//a[.='NDR']")
	WebElement ndr_tab;
	
	//----Forward/Reverse minor tabs----
	@FindBy(xpath="//a[contains(.,'All Shipments')]")
	WebElement all_shipments;
	
	@FindBy(xpath="//a[contains(.,'Info Received')]")
	WebElement info_received;
	
	@FindBy(xpath="Picked Up")
	WebElement picked_up;
	
	@FindBy(xpath="//a[contains(.,'In Transit')]")
	WebElement in_transit;
	
	@FindBy(xpath="//a[contains(.,'Exception')]")
	WebElement exception;
	
	@FindBy(xpath="//a[contains(.,'Out For Delivery')]")
	WebElement out_for_delivery;
	
	@FindBy(xpath="(//a[contains(.,'RTO')])[2]")
	WebElement rto;
	
	@FindBy(xpath="(//a[contains(.,'Delivered')])[1]")
	WebElement delivered;
	
	@FindBy(xpath="//a[contains(.,'Cancelled')]")
	WebElement cancelled;
	
	//-----ndr minor tabs-----
	@FindBy(xpath="//a[@id='ndr-action-required']")
	WebElement action_required_tab;
	
	@FindBy(xpath="//a[contains(.,'Action Requested')]")
	WebElement action_requested_tab;
	
	@FindBy(xpath="//a[contains(.,'Delivered')]")
	WebElement delivered_tab;
	
	@FindBy(xpath="//a[.='RTO']")
	WebElement rto_tab;
	
	@FindBy(xpath="//a[@id='ndr-bulk-upload']")
	WebElement bulk_ndr_action_tab;
	
	//-----fields under bulk ndr action -----
	@FindBy(xpath="//input[@name='file']")
	WebElement select_file_button;
	
	@FindBy(xpath="//button[@id='upload_ndr']")
	WebElement upload_button;
	
	@FindBy(xpath="//a[@id='download_ndr_file']")
	WebElement ndr_filedownload;
	
	@FindBy(xpath="//a[contains(.,'Sample Format')]")
	WebElement sample_format;
	
	@FindBy()
	WebElement ndr_start_date;
	
	@FindBy()
	WebElement ndr_end_date;
	
	@FindBy(xpath="//i[@id='closeIcon_bulk_ndr']")
	WebElement close_ndr_popup;
	
	@FindBy(xpath="//div[@class='pagination-page-info']/b[2]")
	WebElement total_shipment_count;
	
	@FindBy(xpath="//div[@class='pagination-page-info']/b[1]")
	WebElement shipment_count_range;
	
	@FindBy(xpath="(//input[@class='select-dropdown'])[7]")
	WebElement display_per_page;
	
	@FindBy(xpath="(//i[contains(.,'arrow_back')])[2]")
	WebElement ndr_instruction;
	
	@FindBy(xpath="(//i[.='file_download'])[1]")
	WebElement bulk_label_download;
	
	@FindBy(xpath="(//i[.='receipt'])[1]")
	WebElement bulk_invoice_download;
	
	@FindBy(xpath="//i[.='low_priority']")
	WebElement bulk_update_status;
	
	@FindBy(xpath="(//i[.='event_note'])[1]")
	WebElement bulk_manifest;
	
	@FindBy(xpath="//label[@for='myCheckbox']")
	WebElement select_all_checkbox;
	
	@FindBy(xpath="//span[@class='helper-text']")
	WebElement shipment_id;
	
	@FindBy(xpath="//span[@class='hyperlink']")
	WebElement order_id;
	
	@FindBy()
	WebElement shipper_name;
	
	@FindBy()
	WebElement product;
	
	@FindBy()
	WebElement AWB;
	
	@FindBy()
	WebElement shipment_date;
	
	@FindBy()
	WebElement shipping_charges;
	
	@FindBy()
	WebElement shipped_via;
	
	@FindBy()
	WebElement expected_delivery;
	
	//-----Action-----
	@FindBy(xpath="//a[@class='cancel_order']")
	WebElement cancel_order;
	
	@FindBy(xpath="//a[@class='schedule']")
	WebElement schedule_shipment;
	
	@FindBy(xpath="//a[@title='Invoice']")
	WebElement invoice;
	
	@FindBy(xpath="//a[@title='Declaration']")
	WebElement declaration;
	
	@FindBy(xpath="//a[contains(@title,'Download Label ')]")
	WebElement label_download;
	
	@FindBy(xpath="//i[.='event_note']")
	WebElement manifest_icon;
	
	//-----sender details------
	@FindBy(id="sender_contact_name")
	WebElement send_name;
	
	@FindBy(id="sender_company_name")
	WebElement send_company_name;
	
	@FindBy(id="sender_phone")
	WebElement send_ph_number;
	
	@FindBy(id="sender_email")
	WebElement send_email;
	
	@FindBy(id="sender_type")
	WebElement send_address_type;
	
	@FindBy(id="sender_street1")
	WebElement send_add1;
	
	@FindBy(id="sender_street2")
	WebElement send_add2;
	
	@FindBy(id="sender_street3")
	WebElement send_add3;
	
	@FindBy(id="sender_state")
	WebElement send_state;
	
	@FindBy(id="sender_country")
	WebElement send_country;
	
	@FindBy(id="sender_postal_code")
	WebElement send_pincode;
	
	@FindBy(id="receiver_contact_name")
	WebElement rec_name;
	
	@FindBy(id="receiver_company_name")
	WebElement rec_company_name;
	
	@FindBy(id="receiver_phone")
	WebElement rec_ph_number;
	
	@FindBy(id="receiver_email")
	WebElement rec_email;
	
	@FindBy(id="receiver_type")
	WebElement rec_address_type;
	
	@FindBy(id="receiver_street1")
	WebElement rec_add1;
	
	@FindBy(id="receiver_street2")
	WebElement rec_add2;
	
	@FindBy(id="receiver_street3")
	WebElement rec_add3;
	
	@FindBy(id="receiver_state")
	WebElement rec_state;
	
	@FindBy(id="receiver_country")
	WebElement rec_country;
	
	@FindBy(id="receiver_postal_code")
	WebElement rec_pincode;
	
	@FindBy(id="return_contact_name")
	WebElement rto_name;
	
	@FindBy(id="return_company_name")
	WebElement rto_company_name;
	
	@FindBy(id="return_phone")
	WebElement rto_ph_number;
	
	@FindBy()
	WebElement rto_email;
	
	@FindBy(id="return_type")
	WebElement rto_address_type;
	
	@FindBy()
	WebElement rto_add1;
	
	@FindBy()
	WebElement rto_add2;
	
	@FindBy()
	WebElement rto_add3;
	
	@FindBy()
	WebElement rto_state;
	
	@FindBy()
	WebElement rto_country;
	
	@FindBy()
	WebElement rto_pincode;
	
	//-----shipment details------
	@FindBy()
	WebElement scanned_weight;
	
	@FindBy()
	WebElement declared_weight;
	
	@FindBy()
	WebElement service_type;
	
	@FindBy()
	WebElement service_option;
	
	@FindBy()
	WebElement shipment_purpose;
	
	@FindBy()
	WebElement invoice_value;
	
	@FindBy()
	WebElement shipment_type;
	
	@FindBy()
	WebElement order_source;
	
	@FindBy()
	WebElement box;
	
	@FindBy()
	WebElement dimensions;
	
	@FindBy()
	WebElement description;
	

}
