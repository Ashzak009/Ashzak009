package try1;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.ExcelUploadPage;
import pageObjects.ForwardCreateShipmentPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Trials {

	@Test(enabled=false)
	public void log_in()
	{
		//adding nothing remove this after pushing	
		String path = "C:\\Users\\Windows\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://eshipz-qa.herokuapp.com");
		LoginPage login= new LoginPage(driver);
		login.eshipzLogin("d.v.krupa@gmail.com", "password");
		HomePage home = new HomePage(driver);
		home.clickOnCreateshipment();
		home.clickOnForward();
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[.='add']")));
		element1.click();
		//		ForwardCreateShipmentPage forwd = new ForwardCreateShipmentPage(driver);
		//		WebElement name = forwd.sendername.get(1);
		//		String sen_name = name.getText();
		//		System.out.println("senderrrrr nameeee----->"+sen_name);
	}

	@Test
	//TEST CASE 1
	public void uploadExcelAssertEachField() throws EncryptedDocumentException, IOException, InterruptedException
	{
		/*		String path = "C:\\Users\\Windows\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://eshipz-qa.herokuapp.com");

		//LOGIN
		LoginPage login= new LoginPage(driver);
		login.eshipzLogin("d.v.krupa@gmail.com", "password");

		//EXCEL UPLOAD
		HomePage home = new HomePage(driver);
		home.clickOnExcelupload();
		ExcelUploadPage excel_upload = new ExcelUploadPage(driver);
		//path of the file need to upload
		String excel_file_path = "C:\\Users\\Windows\\Downloads\\eshipz_excel_upload_template_new (1).xlsx";
		excel_upload.selectUpload(excel_file_path);
		//Fetching all fields data from create-shipment page
		ForwardCreateShipmentPage forward = new ForwardCreateShipmentPage(driver);
				int no_of_rows = forward.rowwithforwardtag.size();
		System.out.println("total orders: "+no_of_rows);
			//List<String> l1= new ArrayList<String>();
			// String add1 = forward.customerref_rw_1.getAttribute("value");
			 String add2 = forward.customerref_rw_1.getAttribute("value");
			 System.out.println("customer reference: "+add2);                                                         */
		/* l1.add(add1);

			 String add2 = forward.invoiceno.getAttribute("value");
			 l1.add(add2);

			 String add3 = forward.courierpurpose.getAttribute("value");
			 l1.add(add3);

			 String add4 = forward.parceldescription.getAttribute("value");
			 l1.add(add4);

			 String add5 = forward.shipmenttype.getAttribute("value");
			 l1.add(add5);

			 String add6 = forward.paymenttype.getAttribute("value");
			 l1.add(add6);

			 String add7 = forward.cod.getAttribute("value");
			 l1.add(add7);

			 String add8 = forward.codcurrency.getAttribute("value");
			 l1.add(add8);

			 String add9 = forward.length.getAttribute("value");
			 l1.add(add9);

			 String add10 = forward.width.getAttribute("value");
			 l1.add(add10);

			 String add11 = forward.height.getAttribute("value");
			 l1.add(add11);

			 String add12 = forward.value.getAttribute("value");
			 l1.add(add12);

			 String add13 = forward.weight.getAttribute("value");
			 l1.add(add13);

			 String add14 = forward.rec_name_rw_1.getAttribute("value");
			 l1.add(add14);

			 String add15 = forward.rec_companyname_rw_1.getAttribute("value");
			 l1.add(add15);

			 String add16 = forward.rec_address1_rw_1.getAttribute("value");
			 l1.add(add16);

			 String add17 = forward.rec_address2_rw_1.getAttribute("value");
			 l1.add(add17);

			 String add18 = forward.rec_address3_rw_1.getAttribute("value");
			 l1.add(add18);

			 String add19 = forward.rec_city_rw_1.getAttribute("value");
			 l1.add(add19);

			 String add20 = forward.rec_pincode_rw_1.getAttribute("value");
			 l1.add(add20);

			 String add21 = forward.rec_state_rw_1.getAttribute("value");
			 l1.add(add21);

			 String add22 = forward.rec_country_rw_1.getAttribute("value");
			 l1.add(add22);

			 	String add23 = forward.rec_phone_rw_1.getAttribute("value");
				 l1.add(add23);

				 String add24 = forward.rec_email_rw_1.getAttribute("value");
				 l1.add(add24);

				 String add25 = forward.rec_addresstype_rw_1.getAttribute("value");
				 l1.add(add25);

				 String add26 = forward.sendername_rw_1.getAttribute("value");
				 l1.add(add26);

				 String add27 = forward.sendercompany_rw_1.getAttribute("value");
				 l1.add(add27);

				 String add28 = forward.sen_address1_rw_1.getAttribute("value");
				 l1.add(add28);

				 String add29 = forward.sen_address2_rw_1.getAttribute("value");
				 l1.add(add29);

				 String add30 = forward.sen_address3_rw_1.getAttribute("value");
				 l1.add(add30);

				 String add31 = forward.sen_city_rw_1.getAttribute("value");
				 l1.add(add31);

				 String add32 = forward.sen_pincode_rw_1.getAttribute("value");
				 l1.add(add32);

				  String add33 = forward.sen_state_rw_1.getAttribute("value");
				 l1.add(add33);

				 String add34 = forward.sen_country_rw_1.getAttribute("value");
				 l1.add(add34);

				 String add35 = forward.sen_phone_rw_1.getAttribute("value");
				 l1.add(add35);

				 String add36 = forward.sen_email_rw_1.getAttribute("value");
				 l1.add(add36);

				 String add37 = forward.sen_addresstype_rw_1.getAttribute("value");
				 l1.add(add37);

				 String add38 = forward.rto_name_rw_1.getAttribute("value");
				 l1.add(add38);

				 String add39 = forward.rto_company_rw_1.getAttribute("value");
				 l1.add(add39);

				 String add40 = forward.rto_address1_rw_1.getAttribute("value");
				 l1.add(add40);

				 String add41 = forward.rto_address2_rw_1.getAttribute("value");
				 l1.add(add41);

				 String add42 = forward.rto_address3_rw_1.getAttribute("value");
				 l1.add(add42);

				 String add43 = forward.rto_city_rw_1.getAttribute("value");
				 l1.add(add43);

				 String add44 = forward.rto_pincode_rw_1.getAttribute("value");
				 l1.add(add44);

				 String add45 = forward.rto_state_rw_1.getAttribute("value");
				 l1.add(add45);

				 String add46 = forward.rto_country_rw_1.getAttribute("value");
				 l1.add(add46);

				 String add47 = forward.rto_phone_rw_1.getAttribute("value");
				 l1.add(add47);

				 String add48 = forward.rto_email_rw_1.getAttribute("value");
				 l1.add(add48);

				 String add49 = forward.rto_addresstype_rw_1.getAttribute("value");
				 l1.add(add49);

				 System.out.println("printing with in for loop"+l1);                                                        */            


		//Fetching all fields data from excel
		String excel_file_path_10 ="./TestData1.xlsx";


		FileInputStream excel = new FileInputStream(excel_file_path_10);
		Workbook open = WorkbookFactory.create(excel);
		Sheet page = open.getSheet("Sheet1");
		ArrayList<Cell> e= new ArrayList<Cell>();
		int lastRow = page.getLastRowNum();
		for(int i=1;i<=lastRow; i++) 
		{
			Row row_text = page.getRow(i);
			short lastCol = row_text.getLastCellNum();
			for(int j=1;j<lastCol;j++)
			{
				  Cell colmn = row_text.getCell(j);
				e.add(colmn);
				//System.out.println("COLUMN....."+j+"      "+col_name);
				
			}
			System.out.println("row_"+i+" "+e);
			e.clear();
			
		}                                                         
		//		Assert.assertEquals(e, l1);








		//FETCH SERVICE
		/*		WebElement row_1 = forward.rowwithforwardtag.get(0);
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

				boolean msg = forward.error_msg.getText().isEmpty();

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

		}                                        */                                                   

	}
	

}
