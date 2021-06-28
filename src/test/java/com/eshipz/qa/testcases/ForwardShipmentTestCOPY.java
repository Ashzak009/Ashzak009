package com.eshipz.qa.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.eshipz.qa.base.BaseClass;
import com.eshipz.qa.pages.ExcelUploadPage;
import com.eshipz.qa.pages.ForwardCreateShipmentPage;
import com.eshipz.qa.pages.HomePage;
import com.eshipz.qa.pages.LoginPage;
import com.eshipz.qa.pages.ShipmentsPage;
import com.eshipz.qa.utils.ExcelData;
import com.eshipz.qa.utils.GetDataFromCreateShipment;
import com.eshipz.qa.utils.GetDataFromShipmentsPage;
import com.eshipz.qa.utils.Utilities;

public class ForwardShipmentTestCOPY extends BaseClass{

	LoginPage login_pg;
	HomePage home_pg;
	ExcelUploadPage excel_pg;
	ForwardCreateShipmentPage create_Ship_page;
	GetDataFromCreateShipment ele_data;
	String excelFile= "C:\\Users\\Krupa\\Downloads\\eshipz_excel_upload_template_new.xlsx";
	Utilities utils;
	ForwardCreateShipmentPage create_shipment_pg;
	ShipmentsPage shipment_pg;

	public ForwardShipmentTestCOPY() {
		super();
	}

	@BeforeTest
	public void setUp()
	{
		//launchApp();
		login_pg = new LoginPage();
		excel_pg = new ExcelUploadPage();
		ele_data = new GetDataFromCreateShipment();
		utils = new Utilities();
		create_shipment_pg = new ForwardCreateShipmentPage();
	}
	
	
	/*before running the script have to delete "Sheet1" from New_data excel and create new "Sheet1"--need to handle
	 * make sure that there is no default 'package setting' in account*/
	@Test
	public void createShipmentThruExcel()throws InterruptedException, EncryptedDocumentException, IOException, AWTException
	{
	/*	JavascriptExecutor js = (JavascriptExecutor) driver;
		home_pg = login_pg.eshipzLogin(pro.getProperty("username"), pro.getProperty("password"));
		String text = home_pg.verifyHomePage();
		Assert.assertEquals("Welcome", text, "Didn't land on Home page");
		home_pg.clickOnExcelupload();
		create_Ship_page = excel_pg.selectUpload(excelFile);
		String text1 = create_Ship_page.verifyCreateShipmentPage();
		Assert.assertEquals("Create Shipment", text1, "Didn't land on Create shipment page");
		create_Ship_page.closeNotification();
		int number_f_orders = create_Ship_page.eachOrder.size();  */
		
		for(int i=0;i<=1;i++)
		{
			String re = ForwardCreateShipmentPage.one(i);
			
		}
		
/*		ArrayList<String> ez_r_error = utils.labelCreation(pro.getProperty("carrierName"));	
		System.out.println(ez_r_error);    
		
		
		//create_Ship_page.clickOnShipperaccountLink();
		String ez_number;
		for(String ez: ez_r_error )
		{
			if(ez.contains("EZ"))
			{
				ez_number= ez.substring(13);   
				//scroll till the top of the page
				js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
				create_Ship_page.clickOnShipperaccountLink();
				String MainWindow=driver.getWindowHandle();
				Set<String> s1=driver.getWindowHandles();		
				Iterator<String> i1=s1.iterator();
				while(i1.hasNext())			
				{		
					String ChildWindow=i1.next();
					if(!MainWindow.equalsIgnoreCase(ChildWindow))			
					{
						driver.switchTo().window(ChildWindow);   
						Thread.sleep(4000);
						shipment_pg =home_pg.clickOnShipments();				
						//pass ez_number
						shipment_pg.searchGlobaly(ez_number);
						shipment_pg.searchByShipmentID();
						shipment_pg.clickOnSearchBtn(); 
						Thread.sleep(5000);
						shipment_pg.clickOnOrderID();
						Thread.sleep(3000);
						ArrayList<String> uu = GetDataFromShipmentsPage.dataOfAShipment();
						System.out.println("DATA FROM SHIPMENTS PAGE----------->"+uu);
						driver.close();

					}
				}
				driver.switchTo().window(MainWindow);
				ArrayList<String> qq = ExcelData.getRequiredRowDataFromExcel("Sheet2", "C:\\Users\\Windows\\eclipse-workspace\\EshipzProject\\ObjectRepo\\src\\main\\java\\com\\eshipz\\qa\\testdata\\data1.xlsx", 1);

				System.out.println("DATA FROM FIRST ROW OF EXCEL------------>"+qq);
			}
		}*/

	}



	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}
