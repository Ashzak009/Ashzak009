package try1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageObjects.ExcelUploadPage;
import pageObjects.ForwardCreateShipmentPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class ForMultipleElementsDifferentImplementation 
{
	static WebDriver driver; 
	LoginPage login;
	HomePage home;
	ExcelUploadPage excel_upload;
	static ForwardCreateShipmentPage forward;
	@Test
	public void method1() throws InterruptedException, IOException
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
		
//		ArrayList<List<WebElement>> feww = ForMultipleElementsDifferentImplementation.eachElementsInCreateShipmentPage();
//		int totalele = feww.size();
//		System.out.println(totalele);
//		for(List<WebElement> one11:feww)
//		{
		ForMultipleElementsDifferentImplementation.getEachListAndMoveItToArray();
//		}
		
				
		driver.quit(); 
	}
	
	public static ArrayList<List<WebElement>> eachElementsInCreateShipmentPage()
	{
		ArrayList<List<WebElement>> eachEle = new ArrayList<List<WebElement>>();
		eachEle.add(forward.length);
		eachEle.add(forward.height);
		eachEle.add(forward.width);
		return eachEle;
	}
	
	public static void getEachListAndMoveItToArray() throws IOException
	{
		ForExcel.writingToExcel();

	}
	
	public static ArrayList<String> method2(List<WebElement> five_six)
	{
		ArrayList<String> length_array = new ArrayList<String>();
		for(WebElement el13: five_six)
		{
			String k = el13.getAttribute("value");
			length_array.add(k);
		}
		System.out.println(length_array);
		return length_array;
	}
	
	
}
