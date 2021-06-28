package com.eshipz.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eshipz.qa.base.BaseClass;
import com.eshipz.qa.utils.Utilities;

public class HomePage extends BaseClass
{
	public int TimeoutValue = 30;
	//WebDriverWait wait = new WebDriverWait(driver, Utilities.DRIVER_TIMEOUT);
	
	
	public HomePage() 
	{
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
		 
	}
	
	@FindBy(xpath="(//a[@class='waves-effect waves-light'])[1]")
	WebElement eshipz_icon;
	
	@FindBy(className="help-inline")
	WebElement welcomeText;
	
	@FindBy(xpath="//a[@title='Shipment Analytics']")
	WebElement homeTab;
	
	/*mouse hover*/
	//@FindBy(xpath="//a[@href='/integrations/channels/sync-orders']")
	//@FindBy(xpath="//a[@data-activates='my_orders']")
	@FindBy(xpath="(//a[contains(.,'Orders')])[1]")
	WebElement ordersTab;
	
	@FindBy(xpath="//a[@title='Un-Shipped Orders Management']")
	WebElement Un_shipped_option;
	
	@FindBy(xpath="//a[@title='Shipped Orders Management']")
	WebElement shipped_option;
	
	@FindBy(xpath="//a[@title='Cancelled Orders Management']")
	WebElement cancelled_option;
	
	@FindBy(xpath="//a[@title='Un-Processed Orders Management']")
	WebElement Un_processed_option;
	
	@FindBy(xpath="//a[@title='Shipments History & Management']")
	WebElement shipmentsTab;
	
	@FindBy(xpath="(//div[contains(.,'Create Shipment')])[2]")
	WebElement createShipment;
	
	@FindBy(xpath="//a[@title='Quick Shipment Creation - Forward']")
	WebElement forwardCreateShipment;
	
	@FindBy(xpath="//a[@title='Quick Shipment Creation - Reverse']")
	WebElement reverseCreateShipment;
	
//	@FindBy(xpath="//a[@title='Bulk Upload Shipments - Excel Utility']")
	@FindBy(xpath="(//a[@href='/excel-upload'])[2]")
	WebElement excelUploadTab;
	
	@FindBy(xpath="//div[@title='Account Settings']")
	WebElement myAccount;
	
	@FindBy(xpath="//div[@title='Warehouse Settings']")
	WebElement myWarehouse;
	
	@FindBy(xpath="//a[@href='/myaccount/warehouse-list/pickup/data']")
	WebElement pickupWarehouse;
	
	@FindBy(xpath="//a[@href='/myaccount/warehouse-list/delivery/data']")
	WebElement deliveryWarehouse;
	
	@FindBy(xpath="//a[@href='/myaccount/warehouse-list/rto/data']")
	WebElement rtoWarehouse;
	
	@FindBy(xpath="//a[@href='/myaccount/account-settings']")
	WebElement accountSettings;
	
	@FindBy(xpath="//a[@href='/myaccount/package-settings']")
	WebElement packageSettings;
	
	@FindBy(xpath="(//a[@href='/myaccount/subscription-plans'])[2]")
	WebElement subscriptionPlan;
	
	@FindBy(xpath="//a[@href='/plan/payment-details']")
	WebElement paymentHistory;
	
	@FindBy(xpath="//div[@title='Integration Settings for Carriers & eCommerce Platforms']")
	WebElement integrationsTab;
	
	@FindBy(xpath="//a[@href='/integrations/shipper-accounts/list']")
	WebElement carriers;
	
	@FindBy(xpath="//a[@href='/integrations/channel-settings']")
	WebElement salesChannels;
	
	@FindBy(xpath="//div[@title='Shipments COD Reconciliation']")
	WebElement accounting;
	
	//mouse-hover on 
	@FindBy(className="dropdown-button")
	WebElement codReconciliation;
	
	@FindBy(xpath="//a[@href='/accounts/cod-upload']")
	WebElement uploadCodSheets;
	
	@FindBy(xpath="//a[@href='/accounts/remittance']")
	WebElement remittanceReport;
	
	@FindBy(xpath="//a[@title='Global Reports']")
	WebElement reports;
	
	@FindBy(xpath="//a[@title='International State Codes Master List']")
	WebElement stateList;
	
	@FindBy(xpath="(//a[@title='Logout'])[2]")
	WebElement logout;
	
	public void clickOnEshipzIcon()
	{
		eshipz_icon.click();
	}
	public String verifyHomePage()
	{
		return (welcomeText.getText());
	}
	public void directToHomePage()
	{
		eshipz_icon.click();
	}
	
	public void clickonHomeTab()
	{
		homeTab.click();
	}
	
	public ShipmentsPage clickOnShipments()
	{
		shipmentsTab.click();
		return new ShipmentsPage();
	}
	
	public void clickOnCreateshipment()
	{
		createShipment.click();
	}
	
	public void clickOnForward()
	{
		forwardCreateShipment.click();
	}
	
	public void clickOnReverse()
	{
		reverseCreateShipment.click();
	}
	
	public void clickOnExcelupload()
	{
		excelUploadTab.click();
	}
	
	public void clickOnMyAccount()
	{
		myAccount.click();
	}
	
	public void clickOnMyWarehouse()
	{
		myWarehouse.click();
	}
	
	public void clickOnPickupWarehouse()
	{
		pickupWarehouse.click();
	}
	
	public void clickOnDeliveryWarehouse()
	{
		deliveryWarehouse.click();
	}
	
	public void clickOnRtoWarehouse()
	{
		rtoWarehouse.click();
	}
	
	public void clickOnAccountSettings()
	{
		accountSettings.click();
	}
	public void clickOnPackageSettings()
	{
		packageSettings.click();
	}
	
	public void clickOnSubscription()
	{
		subscriptionPlan.click();
	}
	
	public void clickOnPaymentHistory()
	{
		paymentHistory.click();
	}
	
	public void clickOnIntegrationsTab()
	{
		integrationsTab.click();
	}
	
	public ShipperAccountPage clickOnCarriers()
	{
		clickOnIntegrationsTab();
		WebDriverWait wait = new WebDriverWait(driver, Utilities.DRIVER_TIMEOUT);
		wait.until(ExpectedConditions.visibilityOf(carriers));
		carriers.click();
		return new ShipperAccountPage();
	}
	
	public OrdersPage clickOnUnShippedOpt()
	{
		Actions act = new Actions(driver);
		act.moveToElement(ordersTab).click(Un_shipped_option).build().perform();
		return new OrdersPage();
	}
	
	public OrdersPage clickOnShippedOpt()
	{
		Actions act = new Actions(driver);
		act.moveToElement(ordersTab).click(shipped_option).build().perform();
		return new OrdersPage();
	}
	
	public OrdersPage clickOnCancelledOpt()
	{
		Actions act = new Actions(driver);
		act.moveToElement(ordersTab).click(cancelled_option).build().perform();
		return new OrdersPage();
	}
	
	public OrdersPage clickOnUnProcessedOpt()
	{
		Actions act = new Actions(driver);
		act.moveToElement(ordersTab).click(Un_processed_option).build().perform();
		return new OrdersPage();
	}
}
