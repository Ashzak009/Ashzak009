package testCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageObjects.ExcelUploadPage;
import pageObjects.ForwardCreateShipmentPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class ShipmentCreation
{
	/*
	 *Launch a browser
	 *login to eshipz
	 *upload a excel file
	 *assert each field from create shipment page against the excel
	 *fetch service book and generate label
	 * 
	 */
	//@Test
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		String path = "C:\\Users\\Windows\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://eshipz-qa.herokuapp.com");
		
		LoginPage login= new LoginPage(driver);
		login.eshipzLogin("d.v.krupa@gmail.com", "password");
		
		HomePage home = new HomePage(driver);
		home.clickOnExcelupload();
		ExcelUploadPage excel_upload = new ExcelUploadPage(driver);
		//path of the file need to upload
		String excel_file_path = "C:\\Users\\Windows\\Downloads\\eshipz_excel_upload_template_new (1).xlsx";
		excel_upload.selectUpload(excel_file_path);
		
		ForwardCreateShipmentPage forward = new ForwardCreateShipmentPage(driver);
		int no_of_rows = forward.rowwithforwardtag.size();
		System.out.println("total orders: "+no_of_rows);
		for(int i=0; i<=no_of_rows; i++) 
		{
			WebElement select_row = forward.rowwithforwardtag.get(i);
			select_row.click();
			int count_of_sen_name = forward.sendername.size();
			System.out.println("sender name count: "+count_of_sen_name);
			for(int j = i;j<count_of_sen_name;j++)
			{
			WebElement s_name = forward.sendername.get(j);
			String sample = s_name.getText();
			System.out.println("sender name: "+sample);
			}
		}
		
		
		
	/*	FileInputStream excel = new FileInputStream("./TestData1.xlsx");
		Workbook open = WorkbookFactory.create(excel);
		Sheet page = open.getSheet("Sheet1");
		int last_row = page.getLastRowNum();
		int orders = 10;
		int count= 0;
		*/
	}
}
