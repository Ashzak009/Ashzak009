package com.eshipz.qa.testcases;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.eshipz.qa.base.BaseClass;
import com.eshipz.qa.pages.ExcelUploadPage;
import com.eshipz.qa.pages.ForwardCreateShipmentPage;
import com.eshipz.qa.pages.HomePage;
import com.eshipz.qa.pages.LoginPage;
import com.eshipz.qa.pages.OrdersPage;
import com.eshipz.qa.utils.GetDataFromCreateShipment;
import com.eshipz.qa.utils.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImportordersLabelgeneration extends BaseClass
{
	static HomePage home_pg;
	static LoginPage login_pg;
	static Utilities utils;
	static OrdersPage orders_pg;
	static ForwardCreateShipmentPage forwardCreateShip_pg;


	@BeforeTest
	public void setUp()
	{
		launchApp();
		login_pg = new LoginPage();
		utils = new Utilities();
		
	}
	public ImportordersLabelgeneration() 
	{
		super();
	}
	/*
	 * select the orders from 'My Orders' page and click on 'create shipments' button
	 * on create shipments page click on 'Fetch Service' button, select the service and generate label
	 */
	@Test(enabled= false)
	public static void manualFlowExistingBrowser()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Krupa\\eclipse-workspace\\eShipz\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		//value 'after colan will change based on the port number provided on command prompt
		option.setExperimentalOption("debuggerAddress", "localhost:5555");
		WebDriver driver=new ChromeDriver(option);
		//home_pg.clickOnUnProcessedOpt();
		WebElement ordersTab = driver.findElement(By.xpath("//a[@data-activates='my_orders']"));
		WebElement shipped_option = driver.findElement(By.xpath("//a[@title='Shipped Orders Management']"));
		Actions act = new Actions(driver);
		act.moveToElement(ordersTab).perform();
		List<WebElement> link = driver.findElements(By.xpath("//ul[@id='my_orders']/li/a"));
		for(int i=0; i<link.size();i++)
		{
			String ele = link.get(i).getAttribute("title");
			System.out.println(ele);
			if(ele.contains("Cancelled"))
			{
				link.get(i).click();
				System.out.println("clicked on cancelled tab");
			}
		}
		//driver.get("https://qa-eshipz.herokuapp.com");
	}
	@Test(enabled=true)
	public static void manualFlow() throws InterruptedException, AWTException
	{
		//WebDriverManager.chromedriver().setup();
		home_pg = login_pg.eshipzLogin(pro.getProperty("username"), pro.getProperty("password"));
		String text = home_pg.verifyHomePage();
		Assert.assertEquals("Welcome", text, "Didn't land on Home page");
		orders_pg = home_pg.clickOnUnShippedOpt();
		Assert.assertEquals(orders_pg.getUnshippedTabName(), pro.getProperty("unshippedorders"), "Did not land on unshipped tab on Orders page");
		//pass the count of orders that need to be selected from orders page as an argument
		orders_pg.selectFewOrders(3);
		forwardCreateShip_pg = orders_pg.clickOnCreateshipments();
		Assert.assertEquals(forwardCreateShip_pg.verifyCreateShipmentPage(), pro.getProperty("createshipmentpage"), "Did not land on create-shipment page");	
		forwardCreateShip_pg.manualLabelCreation("[ Apex - BLUEDART - TEST_BANGLORE_111 ]");	
		forwardCreateShip_pg.clickOnShipmentsFrmCreateshipment();
		String parent_win = driver.getWindowHandle();
		Set<String> num_windows = driver.getWindowHandles();
		for(String win : num_windows)
		{
			if(!num_windows.equals(parent_win))
				driver.switchTo().window(win);
		}
		
		
	}
	@Test(enabled=false)
	public static void deBug() throws InterruptedException, AWTException
	{
		
		home_pg = login_pg.eshipzLogin(pro.getProperty("username"), pro.getProperty("password"));
		orders_pg = home_pg.clickOnUnShippedOpt();
		orders_pg.selectFewOrders(1);
		forwardCreateShip_pg = orders_pg.clickOnCreateshipments();
		forwardCreateShip_pg.clickOnShipmentsFrmCreateshipment();
	}

}
