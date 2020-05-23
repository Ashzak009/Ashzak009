package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.ExcelUploadPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class ShipmentCreation
{
	WebDriver driver;
	
	public void invokeBrowser()
	{
		String path = "C:\\Users\\Windows\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://eshipz-qa.herokuapp.com");
		
	}
	
	public void login()
	{
		LoginPage login= new LoginPage(driver);
		login.eshipzLogin("d.v.krupa@gmail.com", "password");
	}
	
	public void excelUpload() throws InterruptedException
	{
		HomePage home = new HomePage(driver);
		home.clickOnExcelupload();
		ExcelUploadPage excel_upload = new ExcelUploadPage(driver);
		//path of the file need to upload
		String excel_file_path = "C:\\Users\\Windows\\Downloads\\eshipz_excel_upload_template_new (1).xlsx";
		excel_upload.selectUpload(excel_file_path);
		
	}
	
	public void fetchEachFieldDetails()
	{/*assert each field data present against excel file data*/
		
	}
	
	public void manualLabelGeneration()
	{/*fetch service
	 *select the service
	 *book&generate label
	 *capture EZ number*/
		
	}
	
	public void automationLabelGeneration()
	{/*check for dimensions
	  *Apply dimensions
	  *set up automation requirement
	  *capture validation message
	  *for failed orders */
		
	}
	
	public void validatingOrderOnShipments() 
	{/*find order by customer_ref
	  *assert the data of My_Shipments page against create-shipments page data
	  *for automation flow apply soft assert for failed customer_ref and display a message*/
		
	}
	
	public void invoiceData()
	{/*assert data of invoice against create-shipment page data*/
		
	}
	
	public void declarationData()
	{/*assert data of declaration against create-shipment page data*/
		
	}
	
	public void actionColumnbuttonCheck()
	{/*check label download
	 *schedule and capture the pickup_ID*/
		
	}
	
	public void reportDownload()
	{/*assert the data of report against create-shipment page data*/
		
	}
	
	public void cancelledOrderDetailsOnReport()
	{/*cancel the order and check on the report*/
		
	}
	
}
