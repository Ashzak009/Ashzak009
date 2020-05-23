package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage 
{
	WebDriver driver;
	int TimeOutValue= 40;

	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeOutValue), this);
	}
	
	@FindBy(xpath="(//a[@class='waves-effect waves-light'])[1]")
	WebElement eshipz_icon;
	
	@FindBy(xpath="//a[@title='Shipment Analytics']")
	WebElement homeTab;
	
	@FindBy(xpath="//a[@href='/integrations/channels/sync-orders']")
	WebElement ordersTab;
	
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
	
	public void directToHomePage()
	{
		eshipz_icon.click();
	}
	
	public void clickonHomeTab()
	{
		homeTab.click();
	}
	
	public void clickOnShipments()
	{
		shipmentsTab.click();
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
	

}
