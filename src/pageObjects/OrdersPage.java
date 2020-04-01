package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(.,'Unshipped Orders')]")
	WebElement unshippedorders_tab;
	
	@FindBy(xpath="//a[contains(.,'Shipped Orders')]")
	WebElement shippedorders_tab;
	
	@FindBy(xpath="//a[contains(.,'Cancelled Orders')]")
	WebElement cancelledorders_tab;
	
	@FindBy(id="refresh")
	WebElement refresh_button;
	
	@FindBy(xpath="//a[@title='Setup Sales Channel']")
	WebElement saleschannel_button;
	
	@FindBy(id="order_sync")
	WebElement ordersync_button;
	
	@FindBy(id="mark_shipped_btn")
	WebElement markordersshipped_button;
	
	@FindBy(id="shipping_btn")
	WebElement createshipments_button;
	
	@FindBy(id="add_order_btn")
	WebElement addorder_button;
	
	//page number--change the value corresponding to text to find specific page 
	@FindBy(xpath="//a[.='1']")
	WebElement pagenumber;
	
	//create-shipment of first order will be selected by default in-order to traverse to required change the subscript number
	@FindBy(xpath="(//i[.='local_shipping'])[2]")
	WebElement createshipment_icon;
	
	//clone icon --change the subscript to traverse to required orders clone--default clone of first order will be considered
	@FindBy(xpath="(//i[.='content_copy'])[1]")
	WebElement clone_icon;
	
	@FindBy(xpath="(//i[.='edit'])[1]")
	WebElement edit_icon;
	
	@FindBy(xpath="(//i[.='delete_forever'])[1]")
	WebElement delete_icon;
	
	//display per page drop-down
	@FindBy(xpath="(//select[@name='sales_orders_length'])[1]")
	WebElement show;
	
	//top search bar will be identified by following; in-order to select bottom change the subscript to 2
	@FindBy(xpath="(//input[@type='search'])[1]")
	WebElement searchbar;
	
	@FindBy(xpath="//th[contains(.,'Update Date')]")
	WebElement updatedate_sort;
	
	@FindBy(xpath="//th[contains(.,'Create Date')]")
	WebElement createdate_sort;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement selectall_checkbox;
	
	//default first order checkbox will selected in-order to choose other change the subscript 1 to corresponding check-box
	@FindBy(xpath="(//td[@class=' select-checkbox'])[1]")
	WebElement selectone_checkbox;
	
	//default order id of first order will be identified change the subscript 1 to corresponding count to identify particular order
	@FindBy(xpath="(//div[@id='order_info'])[1]")
	WebElement	orderid;
	
	@FindBy(xpath="(//td[@class='sorting_1'])[1]")
	WebElement	updatedatentime;

	//edit window shipment type
	@FindBy(xpath="//select[@id='shipment_type']")
	WebElement shipmenttype_editwindow;
	
	@FindBy(xpath="//select[@title='Order Status']")
	WebElement orderstatus_editwindow;
	
	@FindBy(xpath="//input[@title='Order Status Custom']")
	WebElement ordercustomstatus_editwindow;
	
	@FindBy(xpath="//select[@title='Payment Method']")
	WebElement paymentmethod_editwindow;
	
	@FindBy(xpath="//input[@title='COD Amount']")
	WebElement codamount_editwindow;
	
	@FindBy(xpath="//input[@title='Order Value']")
	WebElement ordervalue_editwindow;
	
	@FindBy(xpath="//select[@title='Order Currency']")
	WebElement currency_editwindow;
	
	@FindBy(xpath="//a[@title='Remove Item']")
	WebElement remove_editwindow;
	
	@FindBy(xpath="//a[@title='Add Item']")
	WebElement add_editwindow;
	
	@FindBy(xpath="(//input[@name='item_name'])[1]")
	WebElement itemdescription_editwindow;
	
	@FindBy(xpath="(//input[@title='Item SKU'])[1]")
	WebElement itemsku_editwindow;
	
	@FindBy(xpath="(//input[@name='item_weight'])[1]")
	WebElement weight_editwindow;
	
	@FindBy(xpath="(//input[@name='item_value'])[1]")
	WebElement value_editwindow;
	
	@FindBy(xpath="(//input[@name='item_quantity'])[1]")
	WebElement quantity_editwindow;
	
	@FindBy(xpath="(//input[@name='item_length'])[1]")
	WebElement length_editwindow;
	
	@FindBy(xpath="(//input[@name='item_width'])[1]")
	WebElement width_editwindow;
	
	@FindBy(xpath="(//input[@name='item_height'])[1]")
	WebElement height_editwindow;
	
	//Customer Address
	@FindBy(xpath="//input[@name='receiver_fname']")
	WebElement customerfirstname_editwindow;
	
	@FindBy(xpath="//input[@name='receiver_lname']")
	WebElement customerlastname_editwindow;
	
	@FindBy(id="receiver_phone")
	WebElement customerphone_editwindow;
	
	@FindBy(id="receiver_email")
	WebElement customeremail_editwindow;
	
	@FindBy(id="receiver_company")
	WebElement customercompany_editwindow;
	
	@FindBy(id="receiver_address")
	WebElement customeraddress_editwindow;
	
	@FindBy(id="receiver_city")
	WebElement customercity_editwindow;
	
	@FindBy(id="receiver_postalcode")
	WebElement customerpostalcode_editwindow;
	
	@FindBy(id="receiver_state")
	WebElement customerstate_editwindow;
	
	@FindBy(xpath="//select[@title='Consignee Country']")
	WebElement customercountry_editwindow;
	
	//Seller address
	@FindBy(id="sender_firstname")
	WebElement sellerfirstname_editwindow;
	
	@FindBy(id="sender_lastname")
	WebElement sellerlastname_editwindow;
	
	@FindBy(id="sender_phone")
	WebElement sellerphone_editwindow;
	
	@FindBy(id="sender_email")
	WebElement selleremail_editwindow;
	
	@FindBy(id="sender_company")
	WebElement sellercompany_editwindow;
	
	@FindBy(id="sender_address")
	WebElement selleraddress_editwindow;
	
	@FindBy(id="sender_city")
	WebElement sellercity_editwindow;
	
	@FindBy(id="sender_postalcode")
	WebElement sellerpostalcode_editwindow;
	
	@FindBy(id="sender_state")
	WebElement sellerstate_editwindow;
	
	@FindBy(xpath="//select[@id='sender_country']")
	WebElement sellercountry_editwindow;
	
	@FindBy(xpath="//button[@id='submit_edit_order']")
	WebElement save_button_editwindow;
	
	//close button
	@FindBy(xpath="//button[@id='clso_edit_order']")
	WebElement close_button_editwindow;
	
	//close icon 'cross mark' at the top of the edit window
	@FindBy(xpath="//i[.='close']")
	WebElement close_icon_editwindow;
	
	//page number previous button
	@FindBy(id="sales_orders_previous")
	WebElement previous_button;
	
	//page number next button
	@FindBy(id="sales_orders_next")
	WebElement next_button;
	
}
