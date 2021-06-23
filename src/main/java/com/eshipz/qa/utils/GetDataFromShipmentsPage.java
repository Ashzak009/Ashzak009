package com.eshipz.qa.utils;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;

import com.eshipz.qa.pages.ShipmentsPage;

public class GetDataFromShipmentsPage extends ShipmentsPage
{
	public static ArrayList<String> dataOfAShipment() throws EncryptedDocumentException, IOException
	{
		ArrayList<WebElement> elements= new ArrayList<WebElement>();
		ArrayList<String> order_data= new ArrayList<String>();
		
		elements.add(order_id);
		elements.add(shipment_purpose);		
		elements.add(product);
		elements.add(shipment_type_1);
		elements.add(service_option);
		elements.add(dimensions);
		elements.add(invoice_value);
		elements.add(declared_weight);
		
		elements.add(rec_name);
		elements.add(rec_company_name);
		elements.add(rec_add1);
		elements.add(rec_add2);
		elements.add(rec_add3);
		elements.add(rec_pincode);
		elements.add(rec_state);
		elements.add(rec_country);		
		elements.add(rec_ph_number);
		elements.add(rec_email);
		elements.add(rec_address_type);			
		elements.add(send_name);
		elements.add(send_company_name);
		elements.add(send_add1);
		elements.add(send_add2);
		elements.add(send_add3);
		elements.add(send_pincode);
		elements.add(send_state);
		elements.add(send_country);		
		elements.add(send_ph_number);
		elements.add(send_email);
		elements.add(send_address_type);		
		elements.add(rto_name);
		elements.add(rto_company_name);
		elements.add(rto_add1);
		elements.add(rto_add2);
		elements.add(rto_add3);
		elements.add(rto_pincode);
		elements.add(rto_state);
		elements.add(rto_country);
		elements.add(rto_ph_number);
		elements.add(rto_email);
		elements.add(rto_address_type);
		
				
		for(int i=0;i<elements.size();i++)
		{
			String val = elements.get(i).getText();
			order_data.add(val);
		}
//		System.out.println("-----------------------class:GetDataFromShipmentsPage, order_data--From shipments page           "+order_data);
		
		return order_data;
		
	}
}
