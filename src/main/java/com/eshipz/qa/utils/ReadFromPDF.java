package com.eshipz.qa.utils;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.testng.annotations.Test;

public class ReadFromPDF 
{
	@Test(enabled=false)
	public static void methodOne() throws IOException {
		try (PDDocument document = PDDocument.load(new File("C:/Users/Krupa/Downloads/EZ1465806.pdf"))) {

			document.getClass();

			if (!document.isEncrypted()) {

				PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				stripper.setSortByPosition(true);

				PDFTextStripper tStripper = new PDFTextStripper();

				String pdfFileInText = tStripper.getText(document);
				//System.out.println("Text:" + st);

				// split by whitespace
				String lines[] = pdfFileInText.split("\\r?\\n");
				for (String line : lines) {
					System.out.println(line);
				}

			}

		}

	}
	@Test(enabled=true)
	public static String[] methodTwo(String eznum) 
	//public static void methodTwo()
	{
		//add all fetched data to a collection which does not accept duplicate and null values
		String[] data= new String[6];

		try {
			//String eznum= "784050785027";
			//String eznum= "781115347645 (1)";
			//String eznum= "EZ3760572";
			//String eznum="EZ7832787";
			//String eznum="784138002078";
			String pdfFile = "C:/Users/Krupa/Downloads/"+eznum+".pdf";
			PDDocument doc = PDDocument.load(new File(pdfFile));
			String text = new PDFTextStripper().getText(doc);
			System.out.println("Text in PDF\n---------------------------------");
			// char r = text.charAt(1);
		//	System.out.println(text);
			String[] pp = text.split("\r\n");
			for(int i=0;i<pp.length;i++)
			{  
				System.out.println("size if i---->"+pp.length);
				pp[i]=pp[i].stripLeading();
				//Get signature option data from label
				if(pp[i].startsWith("ASR")||pp[i].startsWith("DSR")||pp[i].startsWith("ISR")||pp[i].startsWith("NSR"))
				{
					//String[] bb = pp[i-3].split(" ");
					String[] bb = pp[i].split(" ");
					data[0]=bb[0];
					//System.out.println("Signature Option---------"+bb[0]);
				}
				//Get "Duties Payment By - Identifies the method of payment for a service" data i.e., DEPT: BILL D/T on label
				if(pp[i].contains("DEPT"))
				{
					String[] kk= pp[i].split("DEPT:");
					if(kk[1].contains("BILL D/T:"))
					{
						kk= kk[1].split("BILL D/T:");
					}
					data[1]=kk[1].stripLeading();
					//System.out.println("Duties Payment By1---"+kk[1]);
				}
				//Get D/T from label
				if(pp[i].startsWith("D/T"))
				{
					String[] qq = pp[i].split(" ");
					data[2]=qq[1];
					//System.out.println("D/T---------"+qq[1]);			
				}
				//Get "Freight Payment By - Identifies the method of payment for a service" data i.e., BILL on label
				if(pp[i].startsWith("BILL", 0))
				{
					String[] nn = pp[i].split("BILL ");
					data[3]=nn[1];
					//System.out.println("Freight Payment By--"+nn[1]);
				}
				//Get T/C from label for International shipment
				if(pp[i].startsWith("T/C"))
				{
					String[] ss = pp[i].split(" ");
					data[4]=ss[1];
					//System.out.println("T/C---------"+ss[1]);			
				}
				//Get service name from label
				if(pp[i].equalsIgnoreCase("TRK# Form"))
				{
					data[5]=pp[i+1];
					//System.out.println("service---------"+pp[i+1]);
				}

			}
			//			for(int t=0;t<data.length;t++)
			//			{
			//				data[t]=data[t].stripLeading();
			//				System.out.println("DATA----------->"+data[t]);
			//			}

		} 
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Label not downloaded");
		}

		return data;
	}
}
