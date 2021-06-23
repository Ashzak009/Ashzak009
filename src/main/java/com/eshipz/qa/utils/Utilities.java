package com.eshipz.qa.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

import com.eshipz.qa.base.BaseClass;
import com.eshipz.qa.pages.ForwardCreateShipmentPage;

public class Utilities extends BaseClass {

	public static long PAGE_LOAD_TIMEOUT= 30;
	public static long IMPLICIT_WAIT= 30;
	public static long DRIVER_TIMEOUT= 50;
	static ForwardCreateShipmentPage create_ship;
	//switch to frame 

	//take screenshot
	public static void screenShotLogic(String methodName) throws IOException
	{
		TakesScreenshot uu = (TakesScreenshot)driver;
		File sourceFile = uu.getScreenshotAs(OutputType.FILE);
		//create a folder by name screenshot
		File destinationFile =  new File("./screenshot/"+methodName+".jpg");
		FileUtils.copyFile(sourceFile, destinationFile);

	}

	public ArrayList<String> labelCreation(String carrier_name) throws InterruptedException
	{
		create_ship= new ForwardCreateShipmentPage();
		int total_no = create_ship.fetchservice.size();
		//String ez_no = null;
		ArrayList<String> ez_no = new ArrayList<String>();
		int j = 0;
		int l=0;
		for(int i=0;i<total_no;i++)
		{
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(create_ship.eachOrder.get(i)));
			try {
				create_ship.clickOnEachOrder(i);
			}

			catch(Exception e) {
				System.out.println("------order  "+i+"  is not available----------");
			}
			try {
				WebElement order = create_ship.fetchservice.get(i);
				if(order.isEnabled()==true)
				{
					order.click();

				}}
			catch(Exception e)
			{
				System.out.println("some mandatory field is empty in order with customer ref--->"+ForwardCreateShipmentPage.customerref.get(i).getAttribute("value"));
				break;//if fetch service button is disabled then further check is meaning less hence terminating
			}
			try {
				wait.until(ExpectedConditions.visibilityOf(create_ship.select_service.get(i)));
				System.out.println("----------------name of carrier----------"+carrier_name);
				boolean service = create_ship.select_service.get(i).isDisplayed();
				if(service==true)
				{		

					create_ship.selectService(i, carrier_name);
				}}
			catch(Exception e) {
				System.out.println("Required service is not available");
			}
			while(j<=i)
			{
				try {
					wait.until(ExpectedConditions.visibilityOf(create_ship.book_generate_label.get(j)));
					boolean bookNgenerateLabel_btn = create_ship.book_generate_label.get(j).isEnabled();
					if(bookNgenerateLabel_btn==true)
					{
						create_ship.ClickOnBooknGenerateLabel(j);
					}
				}
				catch(Exception e)
				{
					System.out.println("Book and Generate Label button is not enabled");
				}

				while(l<=i)
				{
					try {
						wait.until(ExpectedConditions.visibilityOfAllElements(create_ship.ez_number));
						boolean ez = create_ship.ez_number.get(l).isDisplayed();
						if(ez==true)
						{
							System.out.println("EZ NUMBER OF ORDER  "+i +create_ship.getEZnumber(l));
							ez_no.add(create_ship.getEZnumber(l));
							l++;
						}
					}
					catch(Exception e)
					{
						System.out.println("EZ number is not present");
						//If EZ number is not generated then will capture the error message and return the error message
						ez_no.add(create_ship.error_msg.get(j).getText());
						System.out.println("ERROR HAS OCCURED---------->  "+create_ship.error_msg.get(j).getText());
						j++;
					}
					break;
				}
				break;
			}
		}
		return ez_no;
	}

	public List<String> removeNullnEmpty(List<String> data)
	{		

		Iterator<String> i = data.iterator();
		while (i.hasNext())
		{
			String s = i.next();

			if (s == null || s.isEmpty())
			{
				i.remove();
			}
		}
		return data;
	}

	public List<String> clipoffdecimal(List<String> data1)
	{
		ArrayList<String> cliped_data = new ArrayList<String>();
		for(String onebyone: data1)
		{
			if(onebyone.contains("."))
			{
				String[] v = onebyone.split("[.]");
				String second = v[1];
				if(second.equals("0"))
				{
					onebyone=v[0];
				}
			}
			cliped_data.add(onebyone);
		}
		System.out.println("------------AFTER SPLIT------------"+cliped_data);
		return cliped_data;
	}
}
