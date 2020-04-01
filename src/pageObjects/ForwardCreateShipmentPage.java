package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class ForwardCreateShipmentPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.warehouse_id']")
	public WebElement selectshipperaddress_dropdown;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.reciever_address_id']")
	public WebElement selectreceiveraddress_dropdown;
	
	//rto check box
	@FindBy(xpath="//div[@class='input-field col s6 m4']/label")
	public WebElement rto_checkbox;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.rto_address_id']")
	 public WebElement selectRtoaddress_dropdown;
	
	//@FindBy(xpath="//label[contains(.,'Customer Ref.')]")
	@FindBy(xpath="(//label[@id='customer_ref'])[1]]")
	public
	WebElement customerref;
	
	@FindBy(xpath="(//label[contains(.,'Customer Ref.')])[1]")
	public WebElement customerref_rw_1;
	
	//for selecting particular row use list
	@FindBy(xpath="//span[@data-badge-caption='Forward Shipment']")
	public List<WebElement> rowwithforwardtag;
	
	@FindBy(xpath="//select[@ng-change='updateShipmentType(order)']")
	public WebElement shipmenttype;
	
	@FindBy(xpath="(//select[@ng-change='updateShipmentType(order)'])[1]")
	public WebElement shipmenttype_rw_1;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.courier_purpose']")
	public WebElement courierpurpose;
	
	@FindBy(xpath="(//select[@ng-model='order.shipment.courier_purpose'])[1]")
	public WebElement courierpurpose_rw_1;
	
	@FindBy(xpath="//select[@ng-options='x for x in payment_type']")
	public WebElement paymenttype;
	
	@FindBy(xpath="(//select[@ng-options='x for x in payment_type'])[1]")
	public WebElement paymenttype_rw_1;
	
	@FindBy(xpath="//input[@name='cod_amount']")
	public WebElement cod;
	
	@FindBy(xpath="(//input[@name='cod_amount'])[1]")
	public WebElement cod_rw_1;
	
	@FindBy(xpath="//select[@id='cod_currency']")
	public WebElement codcurrency;
	
	@FindBy(xpath="(//select[@id='cod_currency'])[1]")
	public WebElement codcurrency_rw_1;
	
	@FindBy(id="parcel_details")
	public WebElement parceldescription;
	
	@FindBy(xpath="(//input[@id='parcel_details'])[1]")
	public WebElement parceldescription_rw_1;
	
	@FindBy(name="value")
	public WebElement value;
	
	@FindBy(xpath="(//input[@name='value'])[1]")
	public WebElement value_rw_1;
	
	
	@FindBy(xpath="//select[@ng-model='order.shipment.shipment_value.currency']")
	public WebElement valuecurrency;
	
	@FindBy(xpath="(//select[@ng-model='order.shipment.shipment_value.currency'])[1]")
	public WebElement valuecurrency_rw_1;
	
	@FindBy(name="invoice_number")
	public WebElement invoiceno;
	
	@FindBy(xpath="(//input[@name='invoice_number'])[1]")
	public WebElement invoiceno_rw_;
	
	@FindBy(xpath="//select[@ng-model='package.description']")
	public WebElement selectboxname;
	
	@FindBy(xpath="(//select[@ng-model='package.description'])[1]")
	public WebElement selectboxname_rw_1;
	
	@FindBy(name="weight")
	public WebElement weight;
	
	@FindBy(xpath="(//input[@name='weight'])[1]")
	public WebElement weight_rw_1;
	
	@FindBy(name="length")
	public WebElement length;
	
	@FindBy(xpath="(//input[@name='length'])[1]")
	public WebElement length_rw_1;
	
	@FindBy(name="width")
	public WebElement width;
	
	@FindBy(xpath="(//input[@name='width'])[1]")
	public WebElement width_rw_1;
	
	@FindBy(name="height")
	public WebElement height;
	
	@FindBy(xpath="(//input[@name='height'])[1]")
	public WebElement height_rw_1;
	
	@FindBy(name="quantity")
	public WebElement numberofbox;
	
	@FindBy(xpath="(//input[@name='quantity'])[1]")
	public WebElement numberofbox_rw_1;
	
	@FindBy(xpath="//img[@ng-click='addPackage(order)']")
	public WebElement addbox;
	
	@FindBy(xpath="(//img[@ng-click='addPackage(order)'])[1]")
	public WebElement addbox_rw_1;
	
	@FindBy(xpath="//img[@class='icon1']")
	public WebElement removebox;
	
	@FindBy(xpath="(//img[@class='icon1'])[1]")
	public WebElement removebox_rw_1;
	
	//-----Sender Details------
	@FindBy(id="sender_name")
	public WebElement sendername;
	
	@FindBy(xpath="(//input[@id='sender_name'])[1]")
	public WebElement sendername_rw_1;
	
	@FindBy(xpath="(//input[@id='sender_name'])[2]")
	public WebElement sendername_rw_2;
	
	@FindBy(xpath="(//input[@id='sender_name'])[3]")
	public WebElement sendername_rw_3;
	
	@FindBy(xpath="(//input[@id='sender_name'])[4]")
	public WebElement sendername_rw_4;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_from.company_name']")
	public WebElement sendercompany;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.ship_from.company_name'])[1]")
	public
	WebElement sendercompany_rw_1;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.ship_from.company_name'])[2]")
	public WebElement sendercompany_rw_2;
	
	@FindBy(name="sender_street1")
	public WebElement sen_address1;
	
	@FindBy(xpath="(//input[@name='sender_street1'])[1]")
	public WebElement sen_address1_rw_1;
	
	@FindBy(xpath="(//input[@name='sender_street1'])[2]")
	public WebElement sen_address1_rw_2;
	
	@FindBy(xpath="(//input[@name='sender_street1'])[3]")
	public WebElement sen_address1_rw_3;
	
	@FindBy(xpath="(//input[@name='sender_street1'])[4]")
	public WebElement sen_address1_rw_4;
	
	@FindBy(xpath="(//input[@name='sender_street1'])[5]")
	public WebElement sen_address1_rw_5;
	
	@FindBy(xpath="(//input[@name='sender_street1'])[6]")
	public WebElement sen_address1_rw_6;
	
	@FindBy(xpath="(//input[@name='sender_street1'])[7]")
	public WebElement sen_address1_rw_7;
	
	@FindBy(xpath="(//input[@name='sender_street1'])[8]")
	public WebElement sen_address1_rw_8;
	
	@FindBy(xpath="(//input[@name='sender_street1'])[9]")
	public WebElement sen_address1_rw_9;
	
	@FindBy(xpath="(//input[@name='sender_street1'])[10]")
	public WebElement sen_address1_rw_10;
	
	@FindBy(name="sender_street2")
	public WebElement sen_address2;
	
	@FindBy(xpath="(//input[@name='sender_street2'])[1]")
	public WebElement sen_address2_rw_1;
	
	@FindBy(xpath="(//input[@name='sender_street2'])[2]")
	public WebElement sen_address2_rw_2;
	
	@FindBy(name="sender_street3")
	public WebElement sen_address3;
	
	@FindBy(xpath="(//input[@name='sender_street3'])[1]")
	public WebElement sen_address3_rw_1;
	
	@FindBy(xpath="(//input[@name='sender_street3'])[2]")
	public WebElement sen_address3_rw_2;
	
	@FindBy(name="sender_city")
	public WebElement sen_city;
	
	@FindBy(xpath="(//input[@name='sender_city'])[1]")
	public WebElement sen_city_rw_1;
	
	@FindBy(xpath="(//input[@name='sender_city'])[2]")
	public WebElement sen_city_rw_2;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.sender_country']")
	public WebElement sen_country;
	
	@FindBy(xpath="(//select[@ng-model='order.shipment.sender_country'])[1]")
	public WebElement sen_country_rw_1;
	
	@FindBy(xpath="(//select[@ng-model='order.shipment.sender_country'])[2]")
	public WebElement sen_country_rw_2;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_from.state']")
	public WebElement sen_state;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.ship_from.state'])[1]")
	public WebElement sen_state_rw_1;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.ship_from.state'])[2]")
	public WebElement sen_state_rw_2;
	
	@FindBy(name="sender_pincode")
	public WebElement sen_pincode;
	
	@FindBy(xpath="(//input[@name='sender_pincode'])[1]")
	public WebElement sen_pincode_rw_1;
	
	@FindBy(name="sender_phone")
	public WebElement sen_phone;
	
	@FindBy(xpath="(//input[@name='sender_phone'])[1]")
	public WebElement sen_phone_rw_1;
	
	@FindBy(name="sender_email")
	public WebElement sen_email;
	
	@FindBy(xpath="(//input[@name='sender_email'])[1]")
	public WebElement sen_email_rw_1;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.sender_type']")
	public WebElement sen_addresstype;
	
	@FindBy(xpath="(//select[@ng-model='order.shipment.sender_type'])[1]")
	public WebElement sen_addresstype_rw_1;
	
	@FindBy(id="sender_tax_id")
	public WebElement sen_taxid;
	
	@FindBy(xpath="(//input[@id='sender_tax_id'])[1]")
	public WebElement sen_taxid_rw_1;
	
	//--------Receiver Details----------
	@FindBy(name="receiver_name")
	public WebElement rec_name;
	
	@FindBy(xpath="(//input[@name='receiver_name'])[1]")
	public WebElement rec_name_rw_1;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_to.company_name']")
	public WebElement rec_companyname;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.ship_to.company_name'])[1]")
	public WebElement rec_companyname_rw_1;
	
	@FindBy(name="receiver_street1")
	public WebElement rec_address1;
	
	@FindBy(xpath="(//input[@name='receiver_street1'])[1]")
	public WebElement rec_address1_rw_1;
	
	@FindBy(name="receiver_street2")
	public WebElement rec_address2;
	
	@FindBy(xpath="(//input[@name='receiver_street2'])[1]")
	public WebElement rec_address2_rw_1;
	
	@FindBy(name="receiver_street3")
	public WebElement rec_address3;
	
	@FindBy(xpath="(//input[@name='receiver_street3'])[1]")
	public WebElement rec_address3_rw_1;
	
	@FindBy(name="receiver_city")
	public WebElement rec_city;
	
	@FindBy(xpath="(//input[@name='receiver_city'])[1]")
	public WebElement rec_city_rw_1;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.country']")
	public WebElement rec_country;
	
	@FindBy(xpath="(//select[@ng-model='order.shipment.country'])[1]")
	public WebElement rec_country_rw_1;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_to.state']")
	public WebElement rec_state;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.ship_to.state'])[1]")
	public WebElement rec_state_rw_1;
	
	@FindBy(name="receiver_pincode")
	public WebElement rec_pincode;
	
	@FindBy(xpath="(//input[@name='receiver_pincode'])[1]")
	public WebElement rec_pincode_rw_1;
	
	@FindBy(name="receiver_phone")
	public WebElement rec_phone;
	
	@FindBy(xpath="(//input[@name='receiver_phone'])[1]")
	public WebElement rec_phone_rw_1;
	
	@FindBy(name="receiver_email")
	public WebElement rec_email;
	
	@FindBy(xpath="(//input[@name='receiver_email'])[1]")
	public WebElement rec_email_rw_1;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.type']")
	public WebElement rec_addresstype;
	
	@FindBy(xpath="(//select[@ng-model='order.shipment.type'])[1]")
	public WebElement rec_addresstype_rw_1;
	
	@FindBy(id="receiver_tax_id")
	public WebElement rec_taxid;
	
	@FindBy(xpath="(//input[@id='receiver_tax_id'])[1]")
	public WebElement rec_taxid_rw_1;
	
	//---------RTO Details--------
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.contact_name']")
	public WebElement rto_name;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.return_to.contact_name'])[1]")
	public WebElement rto_name_rw_1;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.company_name']")
	public WebElement rto_company;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.return_to.company_name'])[1]")
	public WebElement rto_company_rw_1;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.street1']")
	public WebElement rto_address1;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.return_to.street1'])[1]")
	public WebElement rto_address1_rw_1;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.street2']")
	public WebElement rto_address2;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.return_to.street2'])[1]")
	public WebElement rto_address2_rw_1;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.street3']")
	public WebElement rto_address3;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.return_to.street3'])[1]")
	public WebElement rto_address3_rw_1;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.city']")
	public WebElement rto_city;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.return_to.city'])[1]")
	public WebElement rto_city_rw_1;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.return_to_country']")
	public WebElement rto_country;
	
	@FindBy(xpath="(//select[@ng-model='order.shipment.return_to_country'])[1]")
	public WebElement rto_country_rw_1;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.state']")
	public WebElement rto_state;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.return_to.state'])[1]")
	public WebElement rto_state_rw_1;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.postal_code']")
	public WebElement rto_pincode;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.return_to.postal_code'])[1]")
	public WebElement rto_pincode_rw_1;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.phone']")
	public WebElement rto_phone;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.return_to.phone'])[1]")
	public WebElement rto_phone_rw_1;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.email']")
	public WebElement rto_email;
	
	@FindBy(xpath="(//input[@ng-model='order.shipment.return_to.email'])[1]")
	public WebElement rto_email_rw_1;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.return_to.type']")
	public WebElement rto_addresstype;
	
	@FindBy(xpath="(//select[@ng-model='order.shipment.return_to.type'])[1]")
	public WebElement rto_addresstype_rw_1;
	
	@FindBy(name="return_to_tax_id")
	public WebElement rto_taxid;
	
	@FindBy(xpath="(//input[@name='return_to_tax_id'])[1]")
	public WebElement rto_taxid_rw_1;
	
	@FindBy(xpath="//button[contains(.,'Fetch Services')]")
	public WebElement fetchservice;
	
	@FindBy(xpath="//select[@ng-model='selectedService']")
	public WebElement select_service;
	
	@FindBy(xpath="//button[contains(.,'Book & Generate Label')]")
	public WebElement book_generate_label;
	
	@FindBy(xpath="//span[@data-badge-caption='Download Label']")
	public WebElement download_label;
	//use get text method capture and store and compare against shipments page
	@FindBy(xpath="//p[contains(@class,'col order_id')]")
	public WebElement ez_number;
	
	@FindBy(xpath="//a[.='Shipper Accounts']")
	public WebElement shipperaccount_link;
	
	@FindBy(xpath="//a[.='Pickup Warehouses']")
	public WebElement pickupwarehouse_link;
	
	@FindBy(xpath="//i[.='menu']")
	public WebElement menu;
	
	@FindBy(xpath="//i[.='add']")
	public WebElement addneworder;
	
	@FindBy(xpath="//i[.='close']")
	public WebElement removeorder;
	
	@FindBy(xpath="//a[@title='Excel upload']")
	public WebElement excelthru_menu;
	
	@FindBy(xpath="//i[.='dashboard']")
	public WebElement shipmentpagethru_menu;
	
	public int TimeoutValue = 30;
	public ForwardCreateShipmentPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
	}
	//we can use iterator as well as select class check in a flow and change if select doesn't work
	public void selectSenderWarehouse(String sender_warehouse)
	{
		Select sender = new Select(selectshipperaddress_dropdown);
		sender.selectByVisibleText(sender_warehouse);
	}
	
	public void selectReceiverWarehouse(String receiver_warehouse)
	{
		Select receiver = new Select(selectreceiveraddress_dropdown);
		receiver.selectByVisibleText(receiver_warehouse);
	}
	
	public void selectRtoWarehouse(String rto_warehouse)
	{
		Select rto = new Select(selectRtoaddress_dropdown);
		rto.selectByVisibleText(rto_warehouse);
	}
	

	
}
