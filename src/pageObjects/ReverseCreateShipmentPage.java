package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReverseCreateShipmentPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.warehouse_id']")
	WebElement selectshipperaddress_dropdown;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.reciever_address_id']")
	WebElement selectreceiveraddress_dropdown;
	
	//rto check box
	@FindBy(xpath="//div[@class='input-field col s6 m4']/label")
	WebElement rto_checkbox;
	
	@FindBy(xpath="//div[@ng-if='order.is_reverse_shipping']/label")
	WebElement to_pay;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.rto_address_id']")
	WebElement selectrtoaddress_dropdown;
	
	@FindBy(xpath="//label[contains(.,'Customer Ref.')]")
	WebElement customerref;
	
	//for selecting particular row use list
	@FindBy(xpath="//span[@data-badge-caption='Reverse Shipment']")
	WebElement rowwithforwardtag;
	
	@FindBy(xpath="//select[@ng-change='updateShipmentType(order)']")
	WebElement shipmenttype;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.courier_purpose']")
	WebElement courierpurpose;
	
	@FindBy(xpath="//div[@ng-show='order.is_reverse_shipping']")
	WebElement paymenttype;
	
	@FindBy(id="parcel_details")
	WebElement parceldescription;
	
	@FindBy(name="value")
	WebElement value;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.shipment_value.currency']")
	WebElement valuecurrency;
	
	@FindBy(name="invoice_number")
	WebElement invoiceno;
	
	@FindBy(xpath="//select[@ng-model='package.description']")
	WebElement selectboxname;
	
	@FindBy(name="weight")
	WebElement weight;
	
	@FindBy(name="length")
	WebElement length;
	
	@FindBy(name="width")
	WebElement width;
	
	@FindBy(name="height")
	WebElement height;
	
	@FindBy(name="quantity")
	WebElement numberofbox;
	
	@FindBy(xpath="//img[@ng-click='addPackage(order)']")
	WebElement addbox;
	
	@FindBy(xpath="//img[@class='icon1']")
	WebElement removebox;
	
	//-----Sender Details------
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_from.contact_name']")
	WebElement sendername;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_from.company_name']")
	WebElement sendercompany;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_from.street1']")
	WebElement sen_address1;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_from.street2']")
	WebElement sen_address2;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_from.street3']")
	WebElement sen_address3;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_from.city']")
	WebElement sen_city;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.sender_country']")
	WebElement sen_country;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_from.state']")
	WebElement sen_state;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_from.postal_code']")
	WebElement sen_pincode;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_from.phone']")
	WebElement sen_phone;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_from.email']")
	WebElement sen_email;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.sender_type']")
	WebElement sen_addresstype;
	
	@FindBy(id="sender_tax_id")
	WebElement sen_taxid;
	
	//--------Receiver Details----------
	@FindBy(name="receiver_name")
	WebElement rec_name;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_to.company_name']")
	WebElement rec_companyname;
	
	@FindBy(name="receiver_street1")
	WebElement rec_address1;
	
	@FindBy(name="receiver_street2")
	WebElement rec_address2;
	
	@FindBy(name="receiver_street3")
	WebElement rec_address3;
	
	@FindBy(name="receiver_city")
	WebElement rec_city;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.country']")
	WebElement rec_country;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.ship_to.state']")
	WebElement rec_state;
	
	@FindBy(name="receiver_pincode")
	WebElement rec_pincode;
	
	@FindBy(name="receiver_phone")
	WebElement rec_phone;
	
	@FindBy(name="receiver_email")
	WebElement rec_email;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.type']")
	WebElement rec_addresstype;
	
	@FindBy(id="receiver_tax_id")
	WebElement rec_taxid;
	
	//---------RTO Details--------
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.contact_name']")
	WebElement rto_name;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.company_name']")
	WebElement rto_company;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.street1']")
	WebElement rto_address1;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.street2']")
	WebElement rto_address2;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.street3']")
	WebElement rto_address3;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.city']")
	WebElement rto_city;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.return_to_country']")
	WebElement rto_country;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.state']")
	WebElement rto_state;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.postal_code']")
	WebElement rto_pincode;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.phone']")
	WebElement rto_phone;
	
	@FindBy(xpath="//input[@ng-model='order.shipment.return_to.email']")
	WebElement rto_email;
	
	@FindBy(xpath="//select[@ng-model='order.shipment.return_to.type']")
	WebElement rto_addresstype;
	
	@FindBy(name="return_to_tax_id")
	WebElement rto_taxid;
	
	@FindBy(xpath="//button[contains(.,'Fetch Services')]")
	WebElement fetchservice;
	
	@FindBy(xpath="//select[@ng-model='selectedService']")
	WebElement select_service;
	
	@FindBy(xpath="//button[contains(.,'Book & Generate Label')]")
	WebElement book_generate_label;
	
	@FindBy(xpath="//a[.='Shipper Accounts']")
	WebElement shipperaccount_link;
	
	@FindBy(xpath="//a[.='Pickup Warehouses']")
	WebElement pickupwarehouse_link;
	
	@FindBy(xpath="//i[.='menu']")
	WebElement menu;
	
	@FindBy(xpath="//i[.='add']")
	WebElement addneworder;
	
	@FindBy(xpath="//i[.='close']")
	WebElement removeorder;
	
	@FindBy(xpath="//a[@title='Excel upload']")
	WebElement excelthru_menu;
	
	@FindBy(xpath="//i[.='dashboard']")
	WebElement shipmentpagethru_menu;

}
