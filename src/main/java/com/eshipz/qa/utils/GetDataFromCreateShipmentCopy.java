package com.eshipz.qa.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.eshipz.qa.pages.ForwardCreateShipmentPage;

public class GetDataFromCreateShipmentCopy extends ForwardCreateShipmentPage{


	/*This method represents the data of each element from create shipment page*/
	public static ArrayList<List<WebElement>> eachElementsInCreateShipmentPage()
	{
		ArrayList<List<WebElement>> eachEle = new ArrayList<List<WebElement>>();
		eachEle.add(customerref_tag);
		eachEle.add(customerref);
		eachEle.add(selectshipperaddress_dropdown);
		eachEle.add(selectreceiveraddress_dropdown);
		eachEle.add(selectRtoaddress_dropdown);			
		//Airwaybill number
		eachEle.add(waybillno);
		eachEle.add(invoiceno);
		eachEle.add(courierpurpose);
		eachEle.add(parceldescription);
		eachEle.add(shipmenttype);
		eachEle.add(paymenttype);
		eachEle.add(cod);
		eachEle.add(codcurrency);		
		eachEle.add(length);
		eachEle.add(width);
		eachEle.add(height);
		eachEle.add(value);
		eachEle.add(valuecurrency);
		eachEle.add(weight);
		//For amount greater than 50000
		eachEle.add(e_waybillno);
		eachEle.add(rec_name);		
		eachEle.add(rec_companyname);
		eachEle.add(rec_address1);
		eachEle.add(rec_address2);
		eachEle.add(rec_address3);
		eachEle.add(rec_city);
		eachEle.add(rec_pincode);
		eachEle.add(rec_state);
		eachEle.add(rec_country);		
		eachEle.add(rec_phone);
		eachEle.add(rec_email);
		eachEle.add(rec_addresstype);
		eachEle.add(sendername);		
		eachEle.add(sendercompany);
		eachEle.add(sen_address1);
		eachEle.add(sen_address2);
		eachEle.add(sen_address3);
		eachEle.add(sen_city);
		eachEle.add(sen_pincode);
		eachEle.add(sen_state);
		eachEle.add(sen_country);		
		eachEle.add(sen_phone);
		eachEle.add(sen_email);
		eachEle.add(sen_addresstype);
		eachEle.add(rto_name);		
		eachEle.add(rto_company);
		eachEle.add(rto_address1);
		eachEle.add(rto_address2);
		eachEle.add(rto_address3);
		eachEle.add(rto_city);
		eachEle.add(rto_pincode);
		eachEle.add(rto_state);
		eachEle.add(rto_country);		
		eachEle.add(rto_phone);
		eachEle.add(rto_email);
		eachEle.add(rto_addresstype);	
		return eachEle;
	}

	/*This is used to create the columns in the excel file */
	public static ArrayList<String> addingColumns()
	{
		ArrayList<String> columnName = new ArrayList<String>();
		columnName.add("Shipment_method");
		columnName.add("customerref");
		columnName.add("selectSenderWarehouse");
		columnName.add("selectReceiverWarehouse");
		columnName.add("selectRtoWarehouse");
		//Airwaybill number
		columnName.add("waybillno");
		columnName.add("invoiceno");
		columnName.add("courierpurpose");
		columnName.add("parceldescription");
		columnName.add("shipmenttype");
		columnName.add("paymenttype");
		columnName.add("cod");
		columnName.add("codcurrency");
		columnName.add("Length");
		columnName.add("Width");
		columnName.add("Height");
		columnName.add("value");
		columnName.add("valuecurrency");
		columnName.add("weight");
		//For amount greater than 50000
		columnName.add("e_waybillno");
		columnName.add("rec_name");
		columnName.add("rec_companyname");
		columnName.add("rec_address1");
		columnName.add("rec_address2");
		columnName.add("rec_add   ress3");
		columnName.add("rec_city");
		columnName.add("rec_pincode");
		columnName.add("rec_state");
		columnName.add("rec_country");
		columnName.add("rec_phone");
		columnName.add("rec_email");
		columnName.add("rec_addresstype");
		columnName.add("sendername");
		columnName.add("sendercompany");
		columnName.add("sen_address1");
		columnName.add("sen_address2");
		columnName.add("sen_address3");
		columnName.add("sen_city");
		columnName.add("sen_pincode");
		columnName.add("sen_state");
		columnName.add("sen_country");
		columnName.add("sen_phone");
		columnName.add("sen_email");
		columnName.add("sen_addresstype");
		columnName.add("rto_name");
		columnName.add("rto_company");
		columnName.add("rto_address1");
		columnName.add("rto_address2");
		columnName.add("rto_address3");
		columnName.add("rto_city");
		columnName.add("rto_pincode");
		columnName.add("rto_state");
		columnName.add("rto_country");
		columnName.add("rto_phone");
		columnName.add("rto_email");
		columnName.add("rto_addresstype");
		return columnName;
	}

	public void body()
	{
		/* get the column name from addingColumns method
		 * get the data from eachElementsInCreateShipmentPage method
		 * write column name to the sheet
		 * and get attribute value for each bunch of data and iterate each bunch
		 * then write it over a sheet
		 * */
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Windows\\eclipse-workspace\\EshipzProject\\ObjectRepo\\src\\main\\java\\com\\eshipz\\qa\\testdata\\NEW_data.xlsx");
		//	reader.addSheet("sheet_name");

		ArrayList<String> countOfColumns = GetDataFromCreateShipmentCopy.addingColumns();
		int total_col = countOfColumns.size();
		int y=0;
		String data = null;
		int i;
		String sheet_name = "Sheet1";
		for(List<WebElement> eachOrder:eachElementsInCreateShipmentPage())
		{
			while(y<total_col)//y represents number of columns
			{
				String col = countOfColumns.get(y);
				System.out.println("column name: "+col);
				reader.addColumn(sheet_name, col);
				ArrayList<String> data_from_requiredcolimn = GetDataFromCreateShipmentCopy.getAttributeValue(eachOrder);
				int max_elements = data_from_requiredcolimn.size();
				System.out.println("max_elements "+max_elements);

				for( i=2;i<=max_elements+1;i++)//i represents row number
				{
					data = data_from_requiredcolimn.get(i-2);//this line increments the data of the array
					//System.out.println("----------------"+data+"-------------");

					try {
						if(data.contains(":")==true)
						{
							data = data.substring(7);
						} 
						System.out.println("data   "+data);
						reader.setCellData(sheet_name,col,i,data);
					//	int r=i;
/*						while(data.equalsIgnoreCase("prepaid")||data.equalsIgnoreCase("cod"))
						{
							boolean write_2_payment_1 = reader.getCellData(sheet_name, "courierpurpose", i).equalsIgnoreCase("commercial");
							boolean write_2_payment_2 = reader.getCellData(sheet_name, "shipmenttype", i).equalsIgnoreCase("parcel");
							if(write_2_payment_1==true && write_2_payment_2==true)
							{
								reader.setCellData(sheet_name, "paymenttype", i, data);
							}
							r++;
						}     */
						
						
						
						
						
						
						
					}
					catch(NullPointerException e)
					{
						System.out.println("Caught NullPointerException"); 
					}
				}
				
				
				while(col=="paymenttype")
				{
					if(data.equalsIgnoreCase("prepaid")||data.equalsIgnoreCase("cod"))
					{
						//boolean write_2_payment_1 = reader.getCellData(sheet_name, "courierpurpose", i).equalsIgnoreCase("commercial");
					//	boolean write_2_payment_2 = reader.getCellData(sheet_name, "shipmenttype", i).equalsIgnoreCase("parcel");
						if(reader.getCellData(sheet_name, "courierpurpose", i).equalsIgnoreCase("commercial") &&  reader.getCellData(sheet_name, "shipmenttype", i).equalsIgnoreCase("parcel"))
						{
							reader.setCellData(sheet_name, "paymenttype", i, data);
						}
						i++;
					}
					else {
						
					}
				}
				
				
/*				try {
					while(col=="paymenttype"&& reader.getCellData(sheet_name, "courierpurpose", i).equalsIgnoreCase("personal")|| reader.getCellData("sheet_name", "shipmenttype", i).equalsIgnoreCase("document"))
					{

						System.out.println("---------------------------------------inside if loop  --->   "+data);
						reader.setCellData(sheet_name,"paymenttype",i,"Prepaid");
						i++;

					}
				}
				catch(Exception e)
				{
					System.out.println("Caught NullPointerException"  +i);
				}    */



				break;
			}
			y++;
		}                                                  
		System.out.println("END OF WRITING DATA IN EXCEL");
	}

	public static ArrayList<String> getAttributeValue(List<WebElement> five_six)
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
