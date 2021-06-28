package com.eshipz.qa.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

import org.openqa.selenium.WebElement;

import com.eshipz.qa.pages.ForwardCreateShipmentPage;

public class GetDataFromCreateShipment extends ForwardCreateShipmentPage{


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
		columnName.add("Shipping_Method");
		columnName.add("Customer_ref");
		columnName.add("Pickup_Warehouse_id");
		columnName.add("Delivery_Warehouse_id");
		columnName.add("RTO_Warehouse_id");
		//Airwaybill number
		columnName.add("Waybill");
		columnName.add("Invoice_number");
		columnName.add("Courier_purpose");
		columnName.add("Parcel_content");
		columnName.add("Shipment_type");
		columnName.add("Payment_type");
		columnName.add("COD_amount");
		columnName.add("COD_currency");
		columnName.add("Length");
		columnName.add("Width");
		columnName.add("Height");
		columnName.add("Value");
		columnName.add("Shipment_value_currency");
		columnName.add("Weight");
		//For amount greater than 50000
		columnName.add("eWaybill_number");
		columnName.add("Receiver_name");
		columnName.add("Receiver_company_name");
		columnName.add("Receiver_address1");
		columnName.add("Receiver_address2");
		columnName.add("Receiver_address3");
		columnName.add("Receiver_city");
		columnName.add("Receiver_pincode");
		columnName.add("Receiver_state");
		columnName.add("Receiver_country");
		columnName.add("Receiver_phone");
		columnName.add("Receiver_email");
		columnName.add("Receiver_address_type");
		columnName.add("Sender_name");
		columnName.add("Sender_company_name");
		columnName.add("Sender_address1");
		columnName.add("Sender_address2");
		columnName.add("Sender_address3");
		columnName.add("Sender_city");
		columnName.add("Sender_pincode");
		columnName.add("Sender_state");
		columnName.add("Sender_country");
		columnName.add("Sender_phone");
		columnName.add("Sender_email");
		columnName.add("Sender_address_type");
		columnName.add("RTO_name");
		columnName.add("RTO_company_name");
		columnName.add("RTO_address1");
		columnName.add("RTO_address2");
		columnName.add("RTO_address3");
		columnName.add("RTO_city");
		columnName.add("RTO_pincode");
		columnName.add("RTO_state");
		columnName.add("RTO_country");
		columnName.add("RTO_phone");
		columnName.add("RTO_email");
		columnName.add("RTO_address_type");
		return columnName;
	}

	//public void body(int total_orders )
	public void writeToFile(int total_orders )
	{
		/* get the column name from addingColumns method
		 * get the data from eachElementsInCreateShipmentPage method
		 * write column name to the sheet
		 * and get attribute value for each bunch of data and iterate each bunch
		 * then write it over a sheet
		 * */
		String sheet_name = "Sheet2";
		String upload_file_path = pro.getProperty("writedata");
		Xls_Reader reader = new Xls_Reader(upload_file_path);
		reader.addSheet(sheet_name);

		ArrayList<String> countOfColumns = GetDataFromCreateShipment.addingColumns();
		int total_col = countOfColumns.size();
		int y=0;
		String data = null;
		int i=0;
		//	String sheet_name = "Sheet2";
		for(List<WebElement> eachOrder:eachElementsInCreateShipmentPage())
		{
			while(y<total_col)//y represents number of columns
			{
				String col = countOfColumns.get(y);//column name
				System.out.println("column name: "+col);
				reader.addColumn(sheet_name, col);
				ArrayList<String> data_from_requiredcolimn = GetDataFromCreateShipment.getAttributeValue(eachOrder);
				Iterator<String> it = data_from_requiredcolimn.iterator();
				int max_elements = data_from_requiredcolimn.size();
				System.out.println(col);
				System.out.println("-------MAX ELE----------"+max_elements);
				System.out.println("maximum elements of each array which will be written into column "+max_elements);
				try {
					for( i=0;i<=max_elements;i++)//i represents row number
					{
						data = data_from_requiredcolimn.get(i);//this line increments the data of the array
						try {
							if(data.contains(":")==true)
							{
								data = data.substring(7);
							} 
							System.out.println("data   "+data);
							reader.setCellData(sheet_name,col,i+2,data);
							int count=0;
							System.out.println("-------------------COUNT----------"+count);
							System.out.println("------TOTAL ORDERS-----------"+total_orders);
							System.out.println(count<total_orders);

							while(col.equalsIgnoreCase("Payment_type") && count<total_orders)
							{
								System.out.println("---------------ENTERED PAYMENT WHILE------------");
								if(reader.getCellData(sheet_name, "Courier_purpose", i+2).equalsIgnoreCase("commercial") &&  reader.getCellData(sheet_name, "Shipment_type", i+2).equalsIgnoreCase("parcel")&& it.hasNext())
								{
									System.out.println("---------------ENTERED PAYMENT------------");
									data= it.next();
									if(data.contains(":")==true)
									{
										data = data.substring(7);
									} 
									System.out.println("inside if--when payment type is pre or cod  -->  "+data);
									reader.setCellData(sheet_name, "Payment_type", i+2, data);
								}

								else// if(reader.getCellData(sheet_name, "Courier_purpose", j))
								{
									System.out.println("------------count of i------"+i+2);
									reader.setCellData(sheet_name,"Payment_type",i+2,"Prepaid");
								}
								i++;
								count++;
							}
							while(col=="COD_amount" && count<total_orders)
							{
								if(reader.getCellData(sheet_name, "Payment_type", i+2).equalsIgnoreCase("cod")&& it.hasNext())
								{
									data= it.next();
									System.out.println("inside if --> "+data);
									reader.setCellData(sheet_name,"COD_amount",i+2,data);

								}
								else
								{
									reader.setCellData(sheet_name,"COD_amount",i+2,"");
								}
								i++;
								count++;
							}
							while(col=="COD_currency" && count<total_orders)
							{
								if(reader.getCellData(sheet_name, "Payment_type", i+2).equalsIgnoreCase("cod")&& it.hasNext())
								{
									data= it.next();
									System.out.println("inside if --> "+data);
									reader.setCellData(sheet_name,"COD_currency",i+2,data);

								}
								else
								{
									reader.setCellData(sheet_name,"COD_currency",i+2,"");
								}
								i++;
								count++;
							}

							while(col=="eWaybill_number" && count<total_orders)
							{	
								try {
									if(Integer.parseInt(reader.getCellData(sheet_name, "Value", i+2))>=50000 && it.hasNext())
									{
										data= it.next();
										System.out.println("inside if --> "+data);
										reader.setCellData(sheet_name,"eWaybill_number",i+2,data);

									}
									else
									{
										reader.setCellData(sheet_name,"eWaybill_number",i+2,"");
									}
								}
								catch(NumberFormatException q)
								{
									if(Float.parseFloat(reader.getCellData(sheet_name, "Value", i+2))>=50000 && it.hasNext())
									{
										data= it.next();
										System.out.println("inside if --> "+data);
										reader.setCellData(sheet_name,"eWaybill_number",i+2,data);

									}
									else
									{
										reader.setCellData(sheet_name,"eWaybill_number",i+2,"");
									}

								}
								i++;
								count++;
							}

							while(col=="RTO_name"||col=="RTO_company_name"||col=="RTO_address1"||col=="RTO_address2"||col=="RTO_address3"||col=="RTO_city"||col=="RTO_pincode"||col=="RTO_state"||col=="RTO_country"||col=="RTO_phone"||col=="RTO_email"||col=="RTO_address_type")
							{
								if(count>=total_orders)
									break;
								//data= it.next().substring(7);

								if(reader.getCellData(sheet_name, "RTO_Warehouse_id", i+2).equalsIgnoreCase("other"))
								{
									switch(col)
									{
									case "RTO_name":
										data= it.next();
										System.out.println("PRINTING RTO   -------> "+data);
										reader.setCellData(sheet_name,"RTO_name",i+2,data);
										break;
									case "RTO_company_name":
										data= it.next();
										System.out.println("PRINTING RTO   -------> "+data);
										reader.setCellData(sheet_name,"RTO_company_name",i+2,data);
										break;
									case "RTO_address1":
										data= it.next();
										System.out.println("PRINTING RTO   -------> "+data);
										reader.setCellData(sheet_name,"RTO_address1",i+2,data);
										break;
									case "RTO_address2":
										data= it.next();
										System.out.println("PRINTING RTO   -------> "+data);
										reader.setCellData(sheet_name,"RTO_address2",i+2,data);
										break;
									case "RTO_address3":
										data= it.next();
										System.out.println("PRINTING RTO   -------> "+data);
										reader.setCellData(sheet_name,"RTO_address3",i+2,data);
										break;
									case "RTO_city":
										data= it.next();
										System.out.println("PRINTING RTO   -------> "+data);
										reader.setCellData(sheet_name,"RTO_city",i+2,data);
										break;
									case "RTO_pincode":
										data= it.next();
										System.out.println("PRINTING RTO   -------> "+data);
										reader.setCellData(sheet_name,"RTO_pincode",i+2,data);
										break;
									case "RTO_state":
										data= it.next();
										reader.setCellData(sheet_name,"RTO_state",i+2,data);
										break;
									case "RTO_country":
										data= it.next().substring(7);
										System.out.println("PRINTING RTO   -------> "+data);
										reader.setCellData(sheet_name,"RTO_country",i+2,data);
										break;
									case "RTO_phone":
										data= it.next();
										System.out.println("PRINTING RTO   -------> "+data);
										reader.setCellData(sheet_name,"RTO_phone",i+2,data);
										break;
									case "RTO_email":
										data= it.next();
										System.out.println("PRINTING RTO   -------> "+data);
										reader.setCellData(sheet_name,"RTO_email",i+2,data);
										break;
									case "RTO_address_type":
										data= it.next().substring(7);
										System.out.println("PRINTING RTO   -------> "+data);
										reader.setCellData(sheet_name,"RTO_address_type",i+2,data);
										break;


									}
								}
								i++;
								count++;
							}
						}
						catch(NullPointerException e)
						{
							System.out.println("Caught NullPointerException"); 
						}

					}
				}
				catch(IndexOutOfBoundsException P)
				{
					System.out.println("caught IndexOutOfBoundsException");
					int count=0;
					while(col.equalsIgnoreCase("Payment_type") && count<total_orders)
					{
						System.out.println("---------------ENTERED PAYMENT WHILE------------");
						if(reader.getCellData(sheet_name, "Courier_purpose", i+2).equalsIgnoreCase("commercial") &&  reader.getCellData(sheet_name, "Shipment_type", i+2).equalsIgnoreCase("parcel")&& it.hasNext())
						{
							System.out.println("---------------ENTERED PAYMENT------------");
							data= it.next();
							if(data.contains(":")==true)
							{
								data = data.substring(7);
							} 
							System.out.println("inside if--when payment type is pre or cod  -->  "+data);
							reader.setCellData(sheet_name, "Payment_type", i+2, data);
						}

						else// if(reader.getCellData(sheet_name, "Courier_purpose", j))
						{
							System.out.println("------------count of i------"+i+2);
							reader.setCellData(sheet_name,"Payment_type",i+2,"Prepaid");
						}
						i++;
						count++;
					}
				}
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
