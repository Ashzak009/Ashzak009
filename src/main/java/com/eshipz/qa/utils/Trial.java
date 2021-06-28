package com.eshipz.qa.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.eshipz.qa.base.BaseClass;
import com.eshipz.qa.pages.ExcelUploadPage;
import com.eshipz.qa.pages.ForwardCreateShipmentPage;
import com.eshipz.qa.pages.HomePage;
import com.eshipz.qa.pages.LoginPage;
import com.eshipz.qa.pages.PickupWarehousePage;
import com.eshipz.qa.pages.ShipmentsPage;
import com.eshipz.qa.utils.GetDataFromWarehouses.DataFromPickupWarehouse;

public class Trial extends BaseClass
{
	static LoginPage login_pg;
	static HomePage home_pg;
	static ExcelUploadPage excel_pg;
	ForwardCreateShipmentPage create_Ship_page;
	static GetDataFromCreateShipment ele_data;
	static Utilities utils;
	static ForwardCreateShipmentPage create_shipment_pg;
	ShipmentsPage shipment_pg;
	static PickupWarehousePage pickup_warehs_pg;
	public Trial() {
		super();
	}

	@BeforeTest
	public void setUp()
	{
		launchApp();
		login_pg = new LoginPage();
		excel_pg = new ExcelUploadPage();
		ele_data = new GetDataFromCreateShipment();
		utils = new Utilities();
		create_shipment_pg = new ForwardCreateShipmentPage();
		pickup_warehs_pg= new PickupWarehousePage();
	}

	@Test(enabled=false)
	public static void five()
	{
		home_pg = login_pg.eshipzLogin(pro.getProperty("username"), pro.getProperty("password"));
		String text = home_pg.verifyHomePage();
		Assert.assertEquals("Welcome", text, "Didn't land on Home page");
		home_pg.clickOnMyWarehouse();
		home_pg.clickOnPickupWarehouse();
		// int popo = PickupWarehousePage.pic_warehouse_icon.size();
		String idp = pickup_warehs_pg.checkForDefaultWarehouse();
		System.out.println(idp);
		/*PickupWarehousePage.clickOnEditWarehouseDetails(idp);
		driver.navigate().refresh();
		System.out.println("-----------------------------REFRESHED");
		GetDataFromWarehouses obj_warehouse= new GetDataFromWarehouses();
		DataFromPickupWarehouse obj_picwarehs = obj_warehouse.new DataFromPickupWarehouse();
		ArrayList<String> pic_data = obj_picwarehs.pickupWarehouseData();
		System.out.println("------------->"+pic_data);*/
		//driver.quit();
	}
	@Test(enabled=true)
	public static void six() throws InterruptedException
	{
		home_pg = login_pg.eshipzLogin(pro.getProperty("username"), pro.getProperty("password"));
		String text = home_pg.verifyHomePage();
		Assert.assertEquals("Welcome", text, "Didn't land on Home page");
		home_pg.clickOnCreateshipment();
		home_pg.clickOnForward();
		create_shipment_pg.clickOnPickupwarehouseLink();
		String MainWindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();		
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())			
		{		
			String ChildWindow=i1.next();
			if(!MainWindow.equalsIgnoreCase(ChildWindow))			
			{
				driver.switchTo().window(ChildWindow);  
				home_pg.clickOnMyWarehouse();
				home_pg.clickOnPickupWarehouse();
				driver.navigate().refresh();
				String idp = pickup_warehs_pg.checkForDefaultWarehouse();
				pickup_warehs_pg.clickOnEditWarehouseDetails(idp);
				driver.navigate().refresh();
				System.out.println("-----------------------------REFRESHED");
				GetDataFromWarehouses obj_warehouse= new GetDataFromWarehouses();
				DataFromPickupWarehouse obj_picwarehs = obj_warehouse.new DataFromPickupWarehouse();
				ArrayList<String> pic_data = obj_picwarehs.pickupWarehouseData();
				System.out.println("------------->"+pic_data);
				
				Thread.sleep(4000);
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);		
	}
	@Test(enabled=false)
	public void getCustmRef() throws InterruptedException
	{
		home_pg = login_pg.eshipzLogin(pro.getProperty("username"), pro.getProperty("password"));
		String text = home_pg.verifyHomePage();
		Assert.assertEquals("Welcome", text, "Didn't land on Home page");
		home_pg.clickOnExcelupload();
		create_Ship_page = excel_pg.selectUpload(pro.getProperty("uploadfile"));
		String text1 = create_Ship_page.verifyCreateShipmentPage();
		Assert.assertEquals("Create Shipment", text1, "Didn't land on Create shipment page");
		//ArrayList<String> b = create_shipment_pg.custmRef();
		String b = create_shipment_pg.customerref.get(1).getAttribute("value");
	    System.out.println("PRINTING   --->  "+b);
	}
	@Test(enabled=false)
	public void seven()
	{
		int p=10;
		if(p==10)
		{
			System.out.println("First if");
		}
		if(p==10)
		{
			System.out.println("SECOND IF");
		}
		else if(p==5)
		{
			System.out.println("THIRD IF");
		}
		else
		{
			System.out.println("entered ELSE");
		}
		
		
	}
}
