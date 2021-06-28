package com.eshipz.qa.utils;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;

import com.eshipz.qa.pages.DeliveryWarehouseEditPage;
import com.eshipz.qa.pages.ForwardCreateShipmentPage;
import com.eshipz.qa.pages.PickupWarehouseEditPage;
import com.eshipz.qa.pages.RtoWarehouseEditPage;

public class GetDataFromWarehouses 
{
	public class DataFromPickupWarehouse extends PickupWarehouseEditPage
	{
		public ArrayList<String> pickupWarehouseData() 
		{
			ArrayList<WebElement> pickup= new ArrayList<WebElement>();
			pickup.add(pic_name_field);
			pickup.add(pic_company_name_field);
			pickup.add(pic_address_line1_field);
			pickup.add(pic_address_line2_field);
			pickup.add(pic_address_line3_field);
			pickup.add(pic_city_field);
			pickup.add(pic_country_dropdown);
			pickup.add(pic_state_field);
			pickup.add(pic_pincode_field);
			pickup.add(pic_phone_field);
			pickup.add(pic_email_field);
			pickup.add(pic_address_type_dropdown);
			pickup.add(pic_taxid_gstin_field);
			ArrayList<String> data = getValueFunction(pickup);
			return data;
		}
	}
	public class DataFromDeliveryWarehouse extends DeliveryWarehouseEditPage
	{
		public ArrayList<String> deliveryWarehouseData() 
		{	
			ArrayList<WebElement> del= new ArrayList<WebElement>();
			del.add(del_name_field);
			del.add(del_company_name_field);
			del.add(del_address_line1_field);
			del.add(del_address_line2_field);
			del.add(del_address_line3_field);
			del.add(del_city_field);
			del.add(del_country_dropdown);
			del.add(del_state_field);
			del.add(del_pincode_field);
			del.add(del_phone_field);
			del.add(del_email_field);
			del.add(del_address_type_dropdown);
			del.add(del_taxid_gstin_field);
			ArrayList<String> data = getValueFunction(del);
			return data;
		}
	}

	public class DataFromRtoWarehouse extends RtoWarehouseEditPage
	{
		public ArrayList<String> rtoWarehouseData() 
		{
			ArrayList<WebElement> rto= new ArrayList<WebElement>();
			rto.add(rto_name_field);
			rto.add(rto_company_name_field);
			rto.add(rto_address_line1_field);
			rto.add(rto_address_line2_field);
			rto.add(rto_address_line3_field);
			rto.add(rto_city_field);
			rto.add(rto_country_dropdown);
			rto.add(rto_state_field);
			rto.add(rto_pincode_field);
			rto.add(rto_phone_field);
			rto.add(rto_email_field);
			rto.add(rto_address_type_dropdown);
			rto.add(rto_taxid_gstin_field);
			ArrayList<String> data = getValueFunction(rto);
			return data;
		}
	}
	
	

	public static ArrayList<String> getValueFunction(ArrayList<WebElement> ele)
	{
		String a[]= new String[4];
		ArrayList<String> valueOfEle = new ArrayList<String>();
		for(int i=0;i<ele.size();i++)
		{
			String k = ele.get(i).getAttribute("value");
			while(i>0 && i<5)
			{
				k= ele.get(i).getAttribute("value");
				a[i-1]=k;
				System.out.println("ARRAY ELEMENTS ----->   "+a[i-1]);
				String delimiter = " ";
				String result = String.join(delimiter,a);
				System.out.println("PRINTING RESULT------->"+result);
				//If address lines are empty then white spaces will be appended at the end so removing the white space
				while(result.endsWith(" "))
				{
					int len = result.length();
					result= result.substring(0, len-1);
				}
				i++;
				k=result;
			}	
			valueOfEle.add(k);	
		}
		return valueOfEle;
	}
	
	
}
