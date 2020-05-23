package try1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.ExcelUploadPage;
import pageObjects.ForwardCreateShipmentPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class FetchServiceAndBook {
	

	public static void main(String[] args) throws InterruptedException
	{
/*
 * The only constraint is make sure that only one carrier is enabled because 
 * in loop we are capturing error message first then EZ number if any error occurs 
 * from other carriers then EZ number will not be captured even if shipment is successful
 */
		
		String path = "C:\\Users\\Windows\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://app.eshipz.com");
		
//LOGIN
		LoginPage login= new LoginPage(driver);
		login.eshipzLogin("krupa.ecourierz@gmail.com", "password");
		
//EXCEL UPLOAD
		HomePage home = new HomePage(driver);
		home.clickOnExcelupload();
		ExcelUploadPage excel_upload = new ExcelUploadPage(driver);
		//path of the file need to upload
		String excel_file_path = "C:\\Users\\Windows\\Downloads\\eshipz_excel_upload_template_new (1).xlsx";
		excel_upload.selectUpload(excel_file_path);
		//Fetching all fields data from create-shipment page
		ForwardCreateShipmentPage forward = new ForwardCreateShipmentPage(driver);
		
		
		WebElement row_1 = forward.rowwithforwardtag.get(0);
		row_1.click();
		boolean fch = forward.fetchservice.isEnabled();
		if(fch==true)
		{
			forward.fetchservice.click();
		}
		else {
			System.out.println("All mandatory fields are not filled");
			
		}
		Thread.sleep(6000);
		boolean ser = forward.select_service.isDisplayed();
		if(ser==true)
		{
			Select obj1= new Select(forward.select_service);
			obj1.selectByValue("  [ DomesticPriority - BLUEDART - TEST_BANGLORE ] ");
			boolean book = forward.book_generate_label.isEnabled();
			if(book==true)
			{
				forward.book_generate_label.click();
				Thread.sleep(6000);
				
				
				
/*				boolean ez = forward.ez_number.isDisplayed();
				System.out.println(ez);
				if(ez==true)
				{
					String numb = forward.ez_number.getText();
					System.out.println(numb);
				}
				else {                                                                  
					String msg = forward.error_msg.getText();
					System.out.println("error has occured and here is the message-->"+msg);
				}*/
				
				     boolean msg = forward.error_msg.getText().isEmpty();
	//			System.out.println("error has occured and here is the message-->"+msg);
				if(msg==true)
				{                                                               
					String ez = forward.ez_number.getText();
					System.out.println(ez);
					forward.download_label.click();
					System.out.println("EZ number has been captured and label got downloaded");
				}
				else {
					System.out.println("error has occured and here is the message-->"+forward.error_msg.getText());
				}
			}
			else {
				System.out.println("Book and Generate Label button is not enabled");
			}
			
		}  
		else {
			System.out.println("Select a service drop-down is not displayed");
			
		}
	}
}
