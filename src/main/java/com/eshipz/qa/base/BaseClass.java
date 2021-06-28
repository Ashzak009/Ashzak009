package com.eshipz.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eshipz.qa.utils.Utilities;
import com.eshipz.qa.utils.WebEventListener;

public class BaseClass {

	public static WebDriver driver;
	public static Properties pro;
	public EventFiringWebDriver event_driver;
	public WebEventListener eventListener;
//	protected WebDriverWait wait = new WebDriverWait(driver, Utilities.DRIVER_TIMEOUT);
	public BaseClass()
	{
		try
		{
			pro= new Properties();
			FileInputStream prop_file= new FileInputStream("C:\\Users\\Krupa\\eclipse-workspace\\eShipz\\src\\main\\java\\com\\eshipz\\qa\\config\\config.properties");
			pro.load(prop_file);			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void launchApp()
	{
		String browserName = pro.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\Krupa\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krupa\\eclipse-workspace\\eShipz\\Drivers\\chromedriver.exe");
			//WebDriverManager.chromedriver();
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Krupa\\eclipse-workspace\\eShipz\\Drivers\\geckodriver.exe");
			//WebDriverManager.firefoxdriver();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Krupa\\eclipse-workspace\\eShipz\\Drivers\\IEDriverServer.exe");
			//WebDriverManager.iedriver();
			driver= new InternetExplorerDriver();
		}
		
		event_driver = new EventFiringWebDriver(driver);
		// Create object of EventListnerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		event_driver.register(eventListener);
		driver = event_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utilities.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utilities.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));
		
	}
}
