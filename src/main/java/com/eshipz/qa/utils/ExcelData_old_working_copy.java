package com.eshipz.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData_old_working_copy {

	static ArrayList<String> el;
	static Row row_text;
	static Cell colmn;


	public static ArrayList<String> readingFromExcel(String sheetName, String excel_file_path) throws EncryptedDocumentException, IOException, NullPointerException
	{
		FileInputStream excel = new FileInputStream(excel_file_path);
		Workbook open = WorkbookFactory.create(excel);
		Sheet page = open.getSheet(sheetName);
		el= new ArrayList<String>();
		int lastRow = page.getLastRowNum();
		System.out.println("last row**********"+lastRow);
		String col_name="";
		/*wrap consists of column numbers whose data will be wraped into single index number i.e., sender, receiver and return company, all three address lines,
		 * if changes are done on excel file, on script verify whether column numbers are correct */
		//	int wrap[]= {21,22,23,24,33,34,35,36,45,46,47,48};		
		int wrap[]= new int[12];
		//	int country[]= {28,40,52};
		int country[]= new int[3];
		String def_sen_r_rec_warehs="other";
		String default_country= "India";
		String default_currency="INR";
		String default_payment_ty= "Prepaid";
		String default_rec_add_ty= "Residential";
		String def_sen_r_rto_add_ty="Business";
		String courier = "";
		String shipment_ty = "";
		String payment = "";
		row_text = page.getRow(0);
		int i=0;
		int j=0;
		int cou=0;	
		int country_count=0;
		int payment_index = 0;
		int currency_f_cod = 0;
		int currency_f_val=0;
		int rec_address_ty_index=0;
		int courier_purpose_indx=0;
		int shipment_ty_index=0;
		int len_index=0;
		int width_index=0;
		int height_index=0;
		int weight_index=0;
		int sen_r_rto_address_ty_index[]= new int[2];
		int pickup_wrhs_index=0;
		int rec_wrhs_index=0;
		while(i<row_text.getLastCellNum())
		{
			colmn = row_text.getCell(i);
			col_name = colmn.getStringCellValue();
			//get index of company name and address lines to store in a array which helps to wrap them into one index  	
			if(col_name.equals("Receiver_company_name")||col_name.equals("Receiver_address1")||col_name.equals("Receiver_address2")||col_name.equals("Receiver_address3")||col_name.equals("Sender_company_name")||col_name.equals("Sender_address1")||col_name.equals("Sender_address2")||col_name.equals("Sender_address3")||col_name.equals("RTO_company_name")||col_name.equals("RTO_address1")||col_name.equals("RTO_address2")||col_name.equals("RTO_address3"))
			{

				wrap[j]=colmn.getColumnIndex();
				j++;
			}
			//get indexes of country to store in an array which helps to add default country when country is not present in file
			if(col_name.equals("Receiver_country")||col_name.equals("Sender_country")||col_name.equals("RTO_country"))
			{
				country[country_count]=colmn.getColumnIndex();
				country_count++;
			}

			if(col_name.equals("Receiver_address_type"))
				rec_address_ty_index= colmn.getColumnIndex();

			if(col_name.equals("Sender_address_type")||col_name.equals("RTO_address_type"))
			{
				sen_r_rto_address_ty_index[cou]=colmn.getColumnIndex();
				System.out.println(sen_r_rto_address_ty_index[cou]);
				cou++;
			}

			if(col_name.equals("Payment_type"))
				payment_index=colmn.getColumnIndex();


			if(col_name.equals("COD_currency"))
				currency_f_cod=colmn.getColumnIndex();

			if(col_name.equals("Shipment_value_currency"))
				currency_f_val=colmn.getColumnIndex();


			if(col_name.equals("Courier_purpose"))
				courier_purpose_indx=colmn.getColumnIndex();


			if(col_name.equals("Shipment_type"))
				shipment_ty_index=colmn.getColumnIndex();
			
			if(col_name.equals("Length"))
				len_index= colmn.getColumnIndex();
			if(col_name.equals("Width"))
				width_index= colmn.getColumnIndex();
			if(col_name.equals("Height"))
				height_index= colmn.getColumnIndex();
			if(col_name.equals("Weight"))
				weight_index= colmn.getColumnIndex();
		
			if(col_name.equals("Pickup_Warehouse_id"))
				pickup_wrhs_index= colmn.getColumnIndex();
			
			if(col_name.equals("Delivery_Warehouse_id"))
				rec_wrhs_index=colmn.getColumnIndex();
			i++;
		}
		for(i=1;i<=lastRow; i++) 
		{
			row_text = page.getRow(i);
			short lastCol = row_text.getLastCellNum();
			System.out.println("LAST COLUMN   --->  "+lastCol);
			cou=0;
			country_count=0;
			int add_ty_count = 0;
			String result = "";

			for(j=0;j<=lastCol;j++)//represents column number
			{
				int size=0;
				String a1[] = new String[4] ;
				try {
					Cell colmn = row_text.getCell(j);
					col_name = colmn.toString();
					col_name=col_name.toLowerCase();
					if(j==courier_purpose_indx)
						courier=col_name;
					if(j==shipment_ty_index)
						shipment_ty=col_name;
					if(j==payment_index)
						payment=col_name;
					//wrap company name, all address lines and add to arraylist
					if(cou<wrap.length && j==wrap[cou])
					{
						while(size<=3)
						{
							colmn = row_text.getCell(j);
							col_name = colmn.toString();
							System.out.println(col_name);
							a1[size]=col_name;
							j++;
							size++;
							cou++;
							if(size>=4)
								j--;
						}
						String delimiter = " ";
						result = String.join(delimiter, a1);
						result= result.replace(",", "");
						//System.out.println("--------------------result-------------------------"+result);
						while(result.endsWith(" "))
						{
							int len = result.length();
							result= result.substring(0, len-1);
						}
						System.out.println("address concatinated --> "+result);
						el.add(result);
					}
					else if(country_count<country.length && j==country[country_count])
					{
						if(col_name=="")
							el.add(default_country.toLowerCase());
						else
							el.add(col_name);
						country_count++;		
					}

					else if(j==rec_address_ty_index&& col_name=="")						
						System.out.println(el.add(default_rec_add_ty.toLowerCase()));				


					else if(add_ty_count< sen_r_rto_address_ty_index.length &&j==sen_r_rto_address_ty_index[add_ty_count])
					{		
						if(col_name=="")	
							System.out.println(el.add(def_sen_r_rto_add_ty.toLowerCase()));
						else
							System.out.println(el.add(col_name));
						System.out.println(add_ty_count++);

					}

					//		else if(j==payment_index && col_name=="")
					//		el.add(default_payment_ty.toLowerCase());

						//			else if(j==payment_index && col_name.equals("?"))
							//			el.add("");


					else if(j==currency_f_cod && col_name=="" && payment.equalsIgnoreCase("cod"))
						el.add(default_currency.toLowerCase());


					else if(j==currency_f_val && col_name=="")					
						el.add(default_currency.toLowerCase());

					else
					{
						el.add(col_name);
						System.out.println("ROW----"+i+"     "+"COLUMN....."+j+"      "+col_name);
					}
				}
				catch(NullPointerException e)
				{
					System.out.println("Caught NullPointerException");
					if(j==courier_purpose_indx)
						courier=col_name;
					if(j==shipment_ty_index)
						shipment_ty=col_name;
					if(j==payment_index)
						payment=col_name;
					if(cou<wrap.length-1 && j==wrap[cou] && size<=3)
					{
						String delimiter = " ";
						result = String.join(delimiter, a1);
						result=result.replaceAll("null", "");
						result=result.replace(",", "");
						while(result.endsWith(" "))
						{
							int len = result.length();
							result= result.substring(0, len-1);
						}
						System.out.println("address concatinated --> "+result);
						el.add(result);
						cou++;
					}
					if(country_count<3 && j==country[country_count])
					{

						el.add(default_country.toLowerCase());
						country_count++;
						System.out.println(country_count);
					}

					if(j==rec_address_ty_index)
						System.out.println(el.add(default_rec_add_ty.toLowerCase()));



					if(add_ty_count< sen_r_rto_address_ty_index.length &&j==sen_r_rto_address_ty_index[add_ty_count])
					{
						el.add(def_sen_r_rto_add_ty.toLowerCase());
						add_ty_count++;
					}

					if(j==payment_index)
					{
						if(courier.equals("commercial")&& shipment_ty.equals("parcel"))
							el.add("");
						else 
							el.add(default_payment_ty.toLowerCase());
					}


					if(j==currency_f_cod && payment.equalsIgnoreCase("cod"))					
						el.add(default_currency.toLowerCase());


					if(j==currency_f_val)
						el.add(default_currency.toLowerCase());
					
					if(j==len_index ||j==width_index||j==height_index||j==weight_index)
					{
						el.add("0");
					}
					if(j==pickup_wrhs_index||j==rec_wrhs_index)
					{
						el.add(def_sen_r_rec_warehs);
					}

				}
				catch(ArrayIndexOutOfBoundsException w)
				{
					System.out.println("Caught an ArrayIndexOutOfBoundsException");	
					if(cou<wrap.length-1 && j==wrap[cou] && size<=3)
					{
						String delimiter = " ";
						result = String.join(delimiter, a1);
						result=result.replace(",", "");
						while(result.endsWith(" "))
						{
							int len = result.length();
							result= result.substring(0, len-1);
						}
						System.out.println("address concatinated --> "+result);
						el.add(result);
						cou++;
					}
				}
			}
		}
		System.out.println(el);	
		return el;
	}



	public static ArrayList<String> getRequiredRowDataFromExcel(String sheetName, String excel_file_path, int rownum) throws EncryptedDocumentException, IOException
	{
		el= new ArrayList<String>();
		FileInputStream excel = new FileInputStream(excel_file_path);
		Workbook open = WorkbookFactory.create(excel);
		Sheet page = open.getSheet(sheetName);
		Row r = page.getRow(rownum);
		short totalcell = r.getLastCellNum();
		for(int i=0;i<=totalcell;i++)
		{
			boolean flag= false;
			//array consists of column numbers which are not required
			int ar[]={2,3,4,5,6,12,17,19,25,37,49};
			for(int j=0;j<ar.length;j++)
			{
				if(i==ar[j])
				{
					flag=true;
				}
			}
			if(flag==false) 
			{
				try {
					Cell jj = r.getCell(i);
					String yy = jj.toString();
					el.add(yy);
				}
				catch(NullPointerException e)
				{
					System.out.println("Caught NullPointerException"); 

				}
			}
		}
		//		System.out.println("class: ExcelData, data from excel row     "+el);
		return el;
	}


	public static ArrayList<String> newreadingFromExcel(String sheetName, String excel_file_path) throws EncryptedDocumentException, IOException 
	{
		//String ptr = null; 
		//	String excel_file_path ="C:\\Users\\Windows\\eclipse-workspace\\EshipzObjRep\\ObjRepo1\\src\\try1\\NEW_data.xlsx";


		FileInputStream excel = new FileInputStream(excel_file_path);
		Workbook open = WorkbookFactory.create(excel);
		Sheet page = open.getSheet(sheetName);
		el= new ArrayList<String>();

		int lastRow = page.getLastRowNum();
		System.out.println("last row**********"+lastRow);
		String col_name="";
		int wrap[]= new int[12];
		row_text = page.getRow(0);
		int i=0;
		int j=0;
		
		System.out.println(row_text.getLastCellNum());
		int payment_index=0;
		while(i<row_text.getLastCellNum())
		{
			colmn = row_text.getCell(i);
			col_name = colmn.getStringCellValue();

			//get index of company name and address lines to store in a array which helps to wrap them into one index  	
			if(col_name.equals("Receiver_company_name")||col_name.equals("Receiver_address1")||col_name.equals("Receiver_address2")||col_name.equals("Receiver_address3")||col_name.equals("Sender_company_name")||col_name.equals("Sender_address1")||col_name.equals("Sender_address2")||col_name.equals("Sender_address3")||col_name.equals("RTO_company_name")||col_name.equals("RTO_address1")||col_name.equals("RTO_address2")||col_name.equals("RTO_address3"))
			{
				wrap[j]=colmn.getColumnIndex();
				j++;
			}
			if(col_name.equals("Payment_type"))
				payment_index=colmn.getColumnIndex();
			
			
			i++;
		}
		for(i=1;i<=lastRow; i++) 
		{
			Row row_text = page.getRow(i);
			short lastCol = row_text.getLastCellNum();
			int cou=0;
			String result = "";
			for(j=1;j<lastCol;j++)
			{
				int size=0;
				String a1[] = new String[4] ;
				try {
					if(cou<wrap.length && j==wrap[cou])
					{
						while(size<=3)
						{
							colmn = row_text.getCell(j);
							col_name = colmn.toString();
							col_name=col_name.toLowerCase();
							System.out.println(col_name);
							a1[size]=col_name;
							j++;
							size++;
							cou++;
							if(size>=4)
								j--;
						}
						String delimiter = " ";
						result = String.join(delimiter, a1);
						result= result.replace(",", "");
						while(result.endsWith(" "))
						{
							int len = result.length();
							result= result.substring(0, len-1);
						}
						System.out.println("address concatinated --> "+result);
						el.add(result);
					}

					else if(j==payment_index && col_name.equals("?"))
						el.add("");

					else{
						colmn = row_text.getCell(j);
						col_name = colmn.toString();
						col_name=col_name.toLowerCase();
						el.add(col_name);
						System.out.println("COLUMN....."+j+"      "+col_name);
					}
				}
				catch(NullPointerException e1)
				{
					System.out.println("Caught NullPointerException"); 
					
					//ExcelData.myMethod(j);
				}
			}
		}

		System.out.println(el);	
		return el;
	}

}
