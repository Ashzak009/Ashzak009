package com.eshipz.qa.testcases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eshipz.qa.base.BaseClass;
import com.eshipz.qa.pages.ExcelUploadPage;
import com.eshipz.qa.pages.ForwardCreateShipmentPage;
import com.eshipz.qa.pages.HomePage;
import com.eshipz.qa.pages.LoginPage;
import com.eshipz.qa.utils.GetDataFromCreateShipment;
import com.eshipz.qa.utils.Utilities;

public class ExistingBrowser extends BaseClass{

	
		@Test
		public static void existingSession() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Krupa\\eclipse-workspace\\eShipz\\Drivers\\chromedriver.exe");
			ChromeOptions option= new ChromeOptions();
			option.setExperimentalOption("debuggerAddress", "localhost:1122");
			WebDriver driver=new ChromeDriver(option);
			//launchApp();
//			driver.get("http://eshipz-qa.herokuapp.com/");
//			LoginPage login_pg = new LoginPage(driver);
//			ExcelUploadPage excel_pg = new ExcelUploadPage(driver);
//			HomePage home_pg = new HomePage(driver);
		//	GetDataFromCreateShipment ele_data = new GetDataFromCreateShipment();
		//	Utilities utils = new Utilities();
			//ForwardCreateShipmentPage create_shipment_pg = new ForwardCreateShipmentPage(driver);
		//	login_pg.eshipzLogin("digitalmarketing@ecourierz.com", "password");
		//	String text = home_pg.verifyHomePage();
			//Assert.assertEquals("Welcome", text, "Didn't land on Home page");
		//	driver.navigate().refresh();
//			driver.findElement(By.xpath("//a[@title='Bulk Upload Shipments - Excel Utility']")).click();
			//home_pg.clickOnExcelupload();
//			driver.findElement(By.xpath("(//a[@href='/excel-upload'])[2]")).click();
//			excel_pg.selectUpload("C:\\Users\\Krupa\\Downloads\\eshipz_excel_upload_template_new.xlsx");
		//	String text1 = create_Ship_page.verifyCreateShipmentPage();
		//	Assert.assertEquals("Create Shipment", text1, "Didn't land on Create shipment page");
//			create_shipment_pg.clickOnShowAutomationFiltersDropdown();
			//create_shipment_pg.prepaidOrders("FedEx India","fedex_logit_new_flatI","International First");
//			create_shipment_pg.prepaidOrders("Blue Dart","Test_banglore","eTail PrePaid Ground");
//			create_shipment_pg.ship();
			ArrayList<String> order_ids = create_shipment_pg.getEZNumbersAutomation();
			//System.out.println("Number of EZ numbers--------->"+order_ids.size());
			for(int i=0; i<order_ids.size();i++)
			{
				System.out.println("PRINTING ORDER ID---------- "+order_ids.get(i));
			}
			//create_shipment_pg.clickOnLabelsDownload(driver);
			WebElement labels_download= driver.findElement(By.id("bulk_labels_download"));
			Actions action =new Actions(driver);
			action.moveToElement(labels_download).click(labels_download).build().perform();
//			return order_ids;
		}
		
	

}
