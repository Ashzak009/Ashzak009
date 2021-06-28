package com.eshipz.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eshipz.qa.base.BaseClass;
import com.eshipz.qa.utils.Utilities;

public class ForwardCreateShipmentPage extends BaseClass {

	public int TimeoutValue = 30;
	WebDriverWait wait = new WebDriverWait(driver, Utilities.DRIVER_TIMEOUT);

	public ForwardCreateShipmentPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
		wait = new WebDriverWait(driver, 30);
	}

	@FindBy(xpath = "//a[@class='pm-cta pm-cancel-btn']")
	public WebElement notification_popup;

	@FindBy(xpath = "//div[starts-with(@class,'collapsible-header order-creation')]")
	public List<WebElement> eachOrder;

	// element which represents the validation message i.e., success or any error
	// message which display at right corner of each orders in automation flow
	@FindBy(xpath = "//span[contains(@class,'right status_')]")
	List<WebElement> validationMessage;

	@FindBy(xpath = "//div[@class='input-field col s12']")
	List<WebElement> validationMessageManualFlow;

	@FindBy(xpath = "//select[@ng-model='order.shipment.warehouse_id']")
	public static List<WebElement> selectshipperaddress_dropdown;

	@FindBy(xpath = "//h5[@class='sidenav-heading']")
	public WebElement createShipmentText;

	@FindBy(xpath = "//select[@ng-model='order.shipment.reciever_address_id']")
	public static List<WebElement> selectreceiveraddress_dropdown;

	// rto check box
	@FindBy(xpath = "//div[@class='input-field col s6 m4']/label")
	public List<WebElement> rto_checkbox;

	@FindBy(xpath = "//select[@ng-model='order.shipment.rto_address_id']")
	public static List<WebElement> selectRtoaddress_dropdown;

	// @FindBy(xpath="//span[@class='left new badge']")
	@FindBy(xpath = "//span[@data-badge-caption='Reverse Shipment']")
	public static List<WebElement> customerref_tag;

	@FindBy(xpath = "//input[@id='customer_ref']")
	public static List<WebElement> customerref;

	@FindBy(xpath = "//input[@id='customer_ref']")
	public static WebElement customerref1;

	// for selecting particular row use list
	@FindBy(xpath = "//span[@data-badge-caption='Forward Shipment']")
	public List<WebElement> rowwithforwardtag;

	@FindBy(xpath = "//select[@ng-change='updateShipmentType(order)']")
	public static List<WebElement> shipmenttype;

	@FindBy(xpath = "//select[@ng-model='order.shipment.courier_purpose']")
	public static List<WebElement> courierpurpose;

	@FindBy(xpath = "//select[@ng-options='x for x in payment_type']")
	public static List<WebElement> paymenttype;

	@FindBy(xpath = "//input[@name='cod_amount']")
	public static List<WebElement> cod;

	@FindBy(xpath = "//select[@id='cod_currency']")
	public static List<WebElement> codcurrency;

	@FindBy(id = "parcel_details")
	public static List<WebElement> parceldescription;

	@FindBy(name = "value")
	public static List<WebElement> value;

	@FindBy(xpath = "//select[@ng-model='order.shipment.shipment_value.currency']")
	public static List<WebElement> valuecurrency;

	@FindBy(name = "invoice_number")
	public static List<WebElement> invoiceno;

	@FindBy(name = "waybill_number")
	public static List<WebElement> waybillno;

	@FindBy(name = "ewaybill_number")
	public static List<WebElement> e_waybillno;

	@FindBy(xpath = "//select[@ng-model='package.description']")
	public WebElement selectboxname;

	@FindBy(name = "weight")
	public static List<WebElement> weight;

	@FindBy(name = "length")
	public static List<WebElement> length;

	@FindBy(name = "width")
	public static List<WebElement> width;

	@FindBy(name = "height")
	public static List<WebElement> height;

	@FindBy(name = "quantity")
	public List<WebElement> numberofbox;

	@FindBy(xpath = "//img[@ng-click='addPackage(order)']")
	public WebElement addbox;

	@FindBy(xpath = "//img[@class='icon1']")
	public WebElement removebox;

	// -----Sender Details------
	@FindBy(xpath = "//input[@ng-model='order.shipment.ship_from.contact_name']")
	public static List<WebElement> sendername;

	@FindBy(xpath = "//input[@ng-model='order.shipment.ship_from.company_name']")
	public static List<WebElement> sendercompany;

	@FindBy(xpath = "//input[@ng-model='order.shipment.ship_from.street1']")
	public static List<WebElement> sen_address1;

	@FindBy(xpath = "//input[@ng-model='order.shipment.ship_from.street2']")
	public static List<WebElement> sen_address2;

	@FindBy(xpath = "//input[@ng-model='order.shipment.ship_from.street3']")
	public static List<WebElement> sen_address3;

	@FindBy(xpath = "//input[@ng-model='order.shipment.ship_from.city']")
	public static List<WebElement> sen_city;

	@FindBy(xpath = "//select[@ng-model='order.shipment.sender_country']")
	public static List<WebElement> sen_country;

	@FindBy(xpath = "//input[@ng-model='order.shipment.ship_from.state']")
	public static List<WebElement> sen_state;

	@FindBy(xpath = "//input[@ng-model='order.shipment.ship_from.postal_code']")
	public static List<WebElement> sen_pincode;

	@FindBy(xpath = "//input[@ng-model='order.shipment.ship_from.phone']")
	public static List<WebElement> sen_phone;

	@FindBy(xpath = "//input[@ng-model='order.shipment.ship_from.email']")
	public static List<WebElement> sen_email;

	@FindBy(xpath = "//select[@ng-model='order.shipment.sender_type']")
	public static List<WebElement> sen_addresstype;

	@FindBy(xpath = "//input[@ng-model='order.shipment.ship_from.tax_id']")
	public List<WebElement> sen_taxid;

	// --------Receiver Details----------
	@FindBy(name = "receiver_name")
	public static List<WebElement> rec_name;

	@FindBy(xpath = "//input[@ng-model='order.shipment.ship_to.company_name']")
	public static List<WebElement> rec_companyname;

	@FindBy(name = "receiver_street1")
	public static List<WebElement> rec_address1;

	@FindBy(name = "receiver_street2")
	public static List<WebElement> rec_address2;

	@FindBy(name = "receiver_street3")
	public static List<WebElement> rec_address3;

	@FindBy(name = "receiver_city")
	public static List<WebElement> rec_city;

	@FindBy(xpath = "//select[@ng-model='order.shipment.country']")
	public static List<WebElement> rec_country;

	@FindBy(xpath = "//input[@ng-model='order.shipment.ship_to.state']")
	public static List<WebElement> rec_state;

	@FindBy(name = "receiver_pincode")
	public static List<WebElement> rec_pincode;

	@FindBy(name = "receiver_phone")
	public static List<WebElement> rec_phone;

	@FindBy(name = "receiver_email")
	public static List<WebElement> rec_email;

	@FindBy(xpath = "//select[@ng-model='order.shipment.type']")
	public static List<WebElement> rec_addresstype;

	@FindBy(id = "receiver_tax_id")
	public List<WebElement> rec_taxid;

	// ---------RTO Details--------
	@FindBy(xpath = "//input[@ng-model='order.shipment.return_to.contact_name']")
	public static List<WebElement> rto_name;

	@FindBy(xpath = "//input[@ng-model='order.shipment.return_to.company_name']")
	public static List<WebElement> rto_company;

	@FindBy(xpath = "//input[@ng-model='order.shipment.return_to.street1']")
	public static List<WebElement> rto_address1;

	@FindBy(xpath = "//input[@ng-model='order.shipment.return_to.street2']")
	public static List<WebElement> rto_address2;

	@FindBy(xpath = "//input[@ng-model='order.shipment.return_to.street3']")
	public static List<WebElement> rto_address3;

	@FindBy(xpath = "//input[@ng-model='order.shipment.return_to.city']")
	public static List<WebElement> rto_city;

	@FindBy(xpath = "//select[@ng-model='order.shipment.return_to_country']")
	public static List<WebElement> rto_country;

	@FindBy(xpath = "//input[@ng-model='order.shipment.return_to.state']")
	public static List<WebElement> rto_state;

	@FindBy(xpath = "//input[@ng-model='order.shipment.return_to.postal_code']")
	public static List<WebElement> rto_pincode;

	@FindBy(xpath = "//input[@ng-model='order.shipment.return_to.phone']")
	public static List<WebElement> rto_phone;

	@FindBy(xpath = "//input[@ng-model='order.shipment.return_to.email']")
	public static List<WebElement> rto_email;

	@FindBy(xpath = "//select[@ng-model='order.shipment.return_to.type']")
	public static List<WebElement> rto_addresstype;

	@FindBy(name = "return_to_tax_id")
	public List<WebElement> rto_taxid;

	@FindBy(xpath = "//button[contains(.,'Fetch Services')]")
	public List<WebElement> fetchservice;

	@FindBy(xpath = "//select[@ng-model='selectedService']")
	public List<WebElement> select_service;

	@FindBy(xpath = "//button[contains(.,'Book & Generate Label')]")
	public List<WebElement> book_generate_label;

	@FindBy(xpath = "//span[@data-badge-caption='Download Label']")
	public List<WebElement> download_label;

	// use get text method capture and store and compare against shipments page
	@FindBy(xpath = "//div[@ng-if='order.order_id']//p")
	public List<WebElement> ez_number;

	// @FindBy(xpath="//p[@class='col order_id ng-binding']")
	// public List<WebElement> ez_number;

	// Error message
	@FindBy(xpath = "//b[@class='ng-binding']")
	public List<WebElement> error_msg;

	@FindBy(xpath = "//a[contains(.,'Shipper')]")
	public WebElement shipperaccount_link;

	@FindBy(xpath = "//a[.='Pickup Warehouses']")
	public WebElement pickupwarehouse_link;

	@FindBy(xpath = "//i[.='menu']")
	public WebElement menu;

	@FindBy(xpath = "//i[.='add']")
	public WebElement addneworder;

	@FindBy(xpath = "//i[.='close']")
	public WebElement removeorder;

	@FindBy(xpath = "//a[@title='Excel upload']")
	public WebElement excelthru_menu;

	@FindBy(xpath = "(//i[.='dashboard'])[3]")
	public WebElement shipmentpagethru_menu;
	// AUTOMATION BLOCK

	@FindBy(xpath = "//span[@ng-hide='isVisible']")
	WebElement show_automation_filter;

	@FindBy(xpath = "//select[@ng-model='apply_all_prepaid_carrier']")
	WebElement prepid_carrier_dropdown;

	@FindBy(xpath = "//select[@ng-model='apply_all_prepaid_vendor']")
	WebElement prepaid_vendor_dropdown;

	@FindBy(xpath = "//select[@ng-model='prepaid_service']")
	WebElement prepaid_service_dropdown;

	@FindBy(xpath = "//select[@ng-model='apply_all_cod_carrier']")
	WebElement cod_carrier_dropdown;

	@FindBy(xpath = "//select[@ng-model='apply_all_cod_vendor']")
	WebElement cod_vendor_dropdown;

	@FindBy(xpath = "//select[@ng-model='cod_service']")
	WebElement cod_service_dropdown;

	@FindBy(name = "book_all")
	WebElement ship_order;

	@FindBy(id = "get_excel_status")
	WebElement check_status;

	@FindBy(id = "bulk_labels_download")
	WebElement labels_download;

	@FindBy(id = "bulk_update_sales_channel")
	WebElement update_status;

	@FindBy(id = "manifest")
	WebElement manifest;

	public String verifyCreateShipmentPage() {
		return createShipmentText.getText();
	}

	public void clickOnEachOrder() {
		for (WebElement ele : eachOrder) {
			ele.click();
		}
	}

	public void clickOnEachOrder(int i) {
		eachOrder.get(i).click();
	}

	/*
	 * Expand each order check for fetch service button if enabled click and 
	 * check for visibility of service 
	 * choose service and click on book and generate label and
	 * download label
	 */
	public void manualLabelCreation(String serviceName) throws InterruptedException
	{
		int count=0;
		int label_count=0;
		int book_label=0;
		ArrayList<String> ez_numbers= new ArrayList<String>();
		for(int i=0;i<fetchservice.size();i++)
		{	
			boolean label_check = false;
			if(fetchservice.get(i).isEnabled())
			{		
				String s1="(//span[@data-badge-caption='Download Label'])[";
				String s2="]";
				String label_xpath= s1+(label_count+1)+s2;
				clickOnEachOrder(i);
				fetchservice.get(i).click();
				try {	
					
					if(!select_service.get(i).isDisplayed())
					{
						wait.until(ExpectedConditions.visibilityOf(select_service.get(i)));
						if(select_service.get(i).isDisplayed())
						{
							selectService(i,serviceName);
							clickOnBooknGenerateLabel(book_label);
							label_check=true;
							wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(label_xpath)));
							if(download_label.get(label_count).isDisplayed())
							{
								ez_numbers.add(getEZnumberManual(label_count));
								System.out.println("--------------------PRINTING EZ NUMBERS IF "+getEZnumberManual(label_count));
								clickOnLabelDownload(label_count);
								label_count++;
							}}
					}
					else //if service is displayed
					{
						selectService(i,serviceName);
						clickOnBooknGenerateLabel(book_label);
						label_check=true;
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(label_xpath)));
						if(download_label.get(label_count).isDisplayed())
						{
							ez_numbers.add(getEZnumberManual(label_count));
							System.out.println("--------------------PRINTING EZ NUMBERS ELSE "+getEZnumberManual(label_count));
							clickOnLabelDownload(label_count);
							label_count++;
						}}
				}
				catch(Exception e)	{
					System.out.println(e.getStackTrace());
					if(validationMessageManualFlow.get(count).isDisplayed())
					{
						System.out.println("Unable to fetch service/generate label because  "+validationMessageManualFlow.get(count).getText());
						count++;
						if(label_check=true)
						{
							book_label++;
						}

					}
					else 
						System.out.println("UNABLE TO FETCH SERVICE/GENERATE LABEL BECAUSE OF SERVER TIMEOUT");				
				}}
			else
				System.out.println("In order  "+i+"  few mandatory fields are empty");
		}}

	public void selectService(int i, String carrier_name) {

		Boolean flag= false;
		Select sel = new Select(select_service.get(i));
		List<WebElement> allservice = sel.getOptions();
		for(WebElement servi:allservice)
		{
			if(servi.getText().equalsIgnoreCase(carrier_name))
			{
				sel.selectByVisibleText(carrier_name);
				flag=true;	
			}
		}
		if(flag==false)
			System.out.println("SERVICE IS NOT AVAILABLE IN THE LIST");
	}

	public void clickOnBooknGenerateLabel(int i) {
		book_generate_label.get(i).click();
	}

	public void clickOnBooknGenerateLabel()
	{
		book_generate_label.get(0).click();
	}

	public void clickOnLabelDownload(int i)
	{
		download_label.get(i).click();
	}

	public String getEZnumberManual(int i) {
		String[] ez = ez_number.get(i).getText().split(" ");
		String num = "";
		for (String mm : ez) {
			if(mm.contains("EZ"))
				num = mm;		
		}
		return num;
	}

	public ArrayList<String> getEZNumbersAutomation() throws InterruptedException {
		ArrayList<String> ez_numbers = new ArrayList<String>();
		for (WebElement num : validationMessage) {
			while (true) {
				// Thread.sleep(1500);
				if (num.getText().isEmpty()) {
					System.out.println("Waiting for the Automation process to complete");
					// System.out.println(count+"----- "+num.getText());
				} else {
					// System.out.println("------ENTERED else----");
					// System.out.println(num.getText());
					break;
				}
			}
			String validation_msg = num.getText();
			if (validation_msg.contains("Success")) {

				String[] bb = validation_msg.split(" ");
				for (String mm : bb) {
					if (mm.contains("EZ"))
						ez_numbers.add(mm);
				}
			}
		}
		return ez_numbers;
	}

	public void closeNotification() {
		notification_popup.click();

	}

	public void clickOnShipperaccountLink() {
		shipperaccount_link.click();
	}

	public static String one(int i) {
		String st1 = String.valueOf(customerref1);
		String st2 = "(" + customerref1 + ")" + "[" + i + "]";
		String elm = st1 + st2;
		// WebElement ee = (WebElement)elm;
		return elm;
	}

	public void closeNotificationPresent() {
		if (notification_popup.isDisplayed()) {
			closeNotification();
		}
	}

	public void clickOnPickupwarehouseLink() {
		pickupwarehouse_link.click();
	}

	public ArrayList<String> custmRef() {
		ArrayList<String> k = new ArrayList<String>();
		for (WebElement f : customerref) {
			String n = f.getAttribute("value");
			k.add(n);
		}
		System.out.println(k);
		return k;
	}

	public void clickOnShowAutomationFiltersDropdown() {
		show_automation_filter.click();
	}

	public void selectPrepaidCarrier(String carrier) {
		// prepid_carrier_dropdown
		Select prepaid_carrier = new Select(prepid_carrier_dropdown);
		prepaid_carrier.selectByVisibleText(carrier);

	}

	public void selectPrepaidVendor(String vendor) {
		// prepaid_vendor_dropdown
		Select prepaid_vendor = new Select(prepaid_vendor_dropdown);
		prepaid_vendor.selectByVisibleText(vendor);
	}

	public void selectPrepaidService(String service) {
		// prepaid_service_dropdown
		Select prepaid_service = new Select(prepaid_service_dropdown);
		prepaid_service.selectByVisibleText(service);
		// prepaid_service.selectByIndex(service);
	}

	public void selectCodCarrier(String carrier) {
		// cod_carrier_dropdown
		Select cod_carrier = new Select(cod_carrier_dropdown);
		cod_carrier.selectByVisibleText(carrier);
	}

	public void selectCodVendor(String vendor) {// cod_vendor_dropdown
		Select cod_vendor = new Select(cod_vendor_dropdown);
		cod_vendor.selectByVisibleText(vendor);
	}

	public void selectCodService(String service) {
		// cod_service_dropdown
		Select cod_service = new Select(cod_service_dropdown);
		cod_service.selectByVisibleText(service);
	}

	public void clickOnShipOrder() {
		if (ship_order.isEnabled()) {
			ship_order.click();
		} else {
			System.out
			.println("Ship order button is not enabled, check whether all PREPAID/COD dropdowns are selected");
		}
	}

	public void clickOnCheckStatus() throws InterruptedException {// wait until ship order button is enabled then click
		// on check status button
		wait.until(ExpectedConditions.visibilityOf(ship_order));
		check_status.click();
	}

	public void clickOnLabelsDownload() {
		int count = 0;
		for (WebElement order : validationMessage) {
			// wait till some validation message appear on each order
			// wait.until(ExpectedConditions.attributeToBeNotEmpty(order, order.getText()));
			// get the count of orders with validation message
			if (order.getText() != "" || order.getText() != null || order.getText() != " ")
				count++;
		}
		// when validation message displays on all orders click on download label
		if (eachOrder.size() == count) {
			wait.until(ExpectedConditions.elementToBeClickable(labels_download));
			Actions action = new Actions(driver);
			action.moveToElement(labels_download).click(labels_download).build().perform();
		} else
			System.out.println("All orders are not processed");
	}

	public void clickOnUpdateStatus() {
		// update_status
		wait.until(ExpectedConditions.visibilityOf(update_status));
		update_status.click();
	}

	public void clickOnManifest() {
		// wait until validation is done for all orders and click on manifest button
		wait.until(ExpectedConditions.visibilityOf(labels_download));
		manifest.click();
	}

	public void prepaidOrders(String carrier, String vendor, String service) throws InterruptedException {
		selectPrepaidCarrier(carrier);
		selectPrepaidVendor(vendor);
		selectPrepaidService(service);
	}

	public void codOrders(String carrier, String vendor, String service) {
		selectCodCarrier(carrier);
		selectCodVendor(vendor);
		selectCodService(service);

	}

	public void ship() throws InterruptedException {
		clickOnShipOrder();
		clickOnCheckStatus();
	}
	
	public ShipmentsPage clickOnShipmentsFrmCreateshipment() throws AWTException
	{
		 Actions move = new Actions(driver);
		 move.moveToElement(menu).contextClick(shipmentpagethru_menu).build().perform();
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 return new ShipmentsPage();
	}
}
