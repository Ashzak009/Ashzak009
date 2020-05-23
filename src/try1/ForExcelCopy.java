package try1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageObjects.ExcelUploadPage;
import pageObjects.ForwardCreateShipmentPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class ForExcelCopy {
	
	static WebDriver driver; 
	static LoginPage login;
	static HomePage home;
	static ExcelUploadPage excel_upload;
	static ForwardCreateShipmentPage forward;

	static FileOutputStream fout;
	static int y;
	@Test
	public static void writingToExcel() throws IOException, InterruptedException
	{
		String path = "C:\\Users\\Windows\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://eshipz-qa.herokuapp.com");    

		//LOGIN
		login= new LoginPage(driver);
		login.eshipzLogin("d.v.krupa@gmail.com", "password");
		 home = new HomePage(driver);
		home.clickOnExcelupload();
		
		//path of the file need to upload
		String excel_file_path = "C:\\Users\\Windows\\Downloads\\eshipz_excel_upload_template_new (14).xlsx";
		excel_upload = new ExcelUploadPage(driver);
		excel_upload.selectUpload(excel_file_path);
		//Fetching all fields data from create-shipment page
		forward = new ForwardCreateShipmentPage(driver);
		
		
		ArrayList<String> data_from_requiredcolimn = ForMultipleElementsDifferentImplementation.method2(forward.length);
		int max_elements = data_from_requiredcolimn.size();
		
			int column_count=0;
			File src_file = new File("./writingToExcel.xlsx");
			FileInputStream fis = new FileInputStream(src_file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			for(int j=0;j<=max_elements;j++)
			{
				Cell cell = sheet.createRow(j).createCell(column_count);
				
				//for(int y=0;y<=max_elements;y++)
				while(y<max_elements)
				{
					String data = data_from_requiredcolimn.get(y);
					 cell.setCellValue(data);
					 break;
				}
				y++;
				fout = new FileOutputStream(src_file);
				workbook.write(fout);
			}
			//column_count++;
		
		fout.close();
		System.out.println("END OF WRITING DATA IN EXCEL");
		driver.quit(); 
	}
	
}
