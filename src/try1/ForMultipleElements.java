package try1;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseFunctionalities.BaseClass1;
import pageObjects.ExcelUploadPage;
import pageObjects.ForwardCreateShipmentPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class ForMultipleElements
{
	public WebDriver driver;
	@Test(enabled = false)
	public void log()
	{
		String path = "C:\\Users\\Windows\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	
    @Test(enabled=false)
	public void oneFieldWithInOther() throws InterruptedException {
		

		//EXCEL UPLOAD
		HomePage home = new HomePage(driver);
		home.clickOnExcelupload();
		ExcelUploadPage excel_upload = new ExcelUploadPage(driver);
		//path of the file need to upload
		String excel_file_path = "C:\\Users\\Windows\\Downloads\\eshipz_excel_upload_template_new (14).xlsx";
		excel_upload.selectUpload(excel_file_path);
		//Fetching all fields data from create-shipment page
		ForwardCreateShipmentPage forward = new ForwardCreateShipmentPage(driver);
		int no_of_rows = forward.rowwithforwardtag.size();
		System.out.println("total orders: "+no_of_rows);
		List<String> row_3Elements = new ArrayList<String>();


		for(WebElement eactElement: forward.customerref)
		{
			String ref_number = eactElement.getAttribute("value");
			row_3Elements.add(ref_number);
			//System.out.println("ref number is "+ref_number);
			for(WebElement el2:forward.shipmenttype)
			{
				String ship = el2.getAttribute("value");
				row_3Elements.add(ship);
				//System.out.println("shipment type is "+ship);
			}
			for(WebElement el3:forward.courierpurpose)
			{
				String courier = el3.getAttribute("value");
				row_3Elements.add(courier);
				//System.out.println("shipment type is "+ship);
			}
			for(WebElement el4:forward.paymenttype)
			{
				String payment = el4.getAttribute("value");
				row_3Elements.add(payment);
				//System.out.println("shipment type is "+ship);
			}
			for(WebElement el5:forward.parceldescription)
			{
				String description = el5.getAttribute("value");
				row_3Elements.add(description);
				//System.out.println("shipment type is "+ship);
			}
			for(WebElement el6:forward.value)
			{
				String value1 = el6.getAttribute("value");
				row_3Elements.add(value1);
				//System.out.println("shipment type is "+ship);
			}
			for(WebElement el7:forward.valuecurrency)
			{
				String ship = el7.getAttribute("value");
				row_3Elements.add(ship);
				//System.out.println("shipment type is "+ship);
				break;
			}



			/*	if(ref_number.contentEquals("New_auto_09"))
			{
				eactElement.click();
				row_3Elements.add(forward.customerref.getAttribute("value"));
				row_3Elements.add(forward.shipmenttype.getAttribute("value"));
				row_3Elements.add(forward.courierpurpose.getAttribute("value"));
				row_3Elements.add(forward.paymenttype.getAttribute("value"));
				row_3Elements.add(forward.parceldescription.getAttribute("value"));
				row_3Elements.add(forward.value.getAttribute("value"));
				System.out.println("ref number after clicking_1 "+row_3Elements);
				break;

			}*/
			//System.out.println("ref number after clicking_2 "+row_3Elements);
		}
		System.out.println("List is "+row_3Elements);

	}
	@Test(enabled = true)
	public void captureDataIndividualy() throws InterruptedException
	{
		String path = "C:\\Users\\Windows\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://eshipz-qa.herokuapp.com");    

		//LOGIN
		LoginPage login= new LoginPage(driver);
		login.eshipzLogin("d.v.krupa@gmail.com", "password");
		HomePage home = new HomePage(driver);
		home.clickOnExcelupload();
		ExcelUploadPage excel_upload = new ExcelUploadPage(driver);
		//path of the file need to upload
		String excel_file_path = "C:\\Users\\Windows\\Downloads\\eshipz_excel_upload_template_new (14).xlsx";
		excel_upload.selectUpload(excel_file_path);
		//Fetching all fields data from create-shipment page
		ForwardCreateShipmentPage forward = new ForwardCreateShipmentPage(driver);
		 int coun = forward.customerref_tag.size();
		 System.out.println(coun);
//List of customer reference
		 ArrayList<String> custm_ref_array = new ArrayList<String>();
		for(WebElement el:forward.customerref)
		{
			custm_ref_array.add(el.getAttribute("value"));	
		}
		//System.out.println("elements outside for loop---->"+custm_ref_array);
//List of Shipment type		
		ArrayList<String> shipment_type_array= new ArrayList<String>();			
		for(WebElement el1:forward.shipmenttype)
		{	
			String ship_type = el1.getAttribute("value");
			String[] arr = ship_type.split(":");
			for(String y:arr)
			{
			shipment_type_array.add(y);
			}
			shipment_type_array.remove("string");
		}	
		//System.out.println("elements outside for loop---->"+shipment_type_array);
//courier purpose
		ArrayList<String> courier_purpose_array= new ArrayList<String>();			
		for(WebElement el2:forward.courierpurpose)
		{	
			String courier = el2.getAttribute("value");
			for(String z:courier.split(":"))
			{
				courier_purpose_array.add(z);
			}
			courier_purpose_array.remove("string");
		}	
		//System.out.println("elements outside for loop---->"+courier_purpose_array);
//payment type
		ArrayList<String> payment_type_array = new ArrayList<String>();
		int pay_size = forward.paymenttype.size();
		System.out.println(pay_size);
		for(WebElement el3: forward.paymenttype)
		{
			String pay = el3.getAttribute("value");
			//System.out.println("each element "+pay);
			if(pay.isEmpty())
			{
				payment_type_array.add(","+" "+",");
			}
			for(String a: pay.split(":"))
			{
				payment_type_array.add(a);
			}
			payment_type_array.remove("string");		
		}
		//System.out.println(payment_type_array);
//cod value
		ArrayList<String> cod_value_array= new ArrayList<String>();
		for(WebElement el4: forward.cod)
		{
			String b = el4.getAttribute("value");
			cod_value_array.add(b);
		}
		//System.out.println(cod_value_array);
//cod currency            
		ArrayList<String> cod_currency_array= new ArrayList<String>();
		for(WebElement el5: forward.codcurrency)
		{
			String c = el5.getAttribute("value");
			cod_currency_array.add(c);
		}
		//System.out.println(cod_currency_array);
//parcel description
		ArrayList<String> parcel_desc_array = new ArrayList<String>();
		for(WebElement el6: forward.parceldescription)
		{
			String d = el6.getAttribute("value");
			parcel_desc_array.add(d);
		}
		//System.out.println(parcel_desc_array);
//value
		ArrayList<String> value_array = new ArrayList<String>();
		for(WebElement el7: forward.value)
		{
			String e = el7.getAttribute("value");
			value_array.add(e);
		}
		//System.out.println(value_array);
//value currency
		ArrayList<String> value_currency_array = new ArrayList<String>();
		for(WebElement el8: forward.valuecurrency)
		{
			String f = el8.getAttribute("value");
			value_currency_array.add(f);
		}
		//System.out.println(value_currency_array);
//invoice
		ArrayList<String> invoice_array = new ArrayList<String>();
		for(WebElement el9: forward.invoiceno)
		{
			String g = el9.getAttribute("value");
			invoice_array.add(g);
		}
		//System.out.println(invoice_array);
//waybill
		ArrayList<String> waybill_array = new ArrayList<String>();
		for(WebElement el10: forward.waybillno)
		{
			String h = el10.getAttribute("value");
			waybill_array.add(h);
		}
		//System.out.println(waybill_array);
//e-waybill[AWB]
		ArrayList<String> e_waybill_array = new ArrayList<String>();
		for(WebElement el11: forward.e_waybillno)
		{
			String i = el11.getAttribute("value");
			e_waybill_array.add(i);
		}
		//System.out.println(e_waybill_array);
//weight
		ArrayList<String> weight_array = new ArrayList<String>();
		for(WebElement el12: forward.weight)
		{
			String j = el12.getAttribute("value");
			weight_array.add(j);
		}
		//System.out.println(weight_array);
//length
		ArrayList<String> length_array = new ArrayList<String>();
		for(WebElement el13: forward.length)
		{
			String k = el13.getAttribute("value");
			length_array.add(k);
		}
		//System.out.println(length_array);
//width
		ArrayList<String> width_array = new ArrayList<String>();
		for(WebElement el14: forward.width)
		{
			String l = el14.getAttribute("value");
			width_array.add(l);
		}
		//System.out.println(width_array);
//height
		ArrayList<String> height_array = new ArrayList<String>();
		for(WebElement el14: forward.height)
		{
			String l = el14.getAttribute("value");
			height_array.add(l);
		}
		System.out.println(height_array);
//sender details
		
driver.quit();
	}
	
	public void getEachListAndMoveItToArray()
	{
		ArrayList row_1 = new ArrayList();
		
	}
}
