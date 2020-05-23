package try1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.ForwardCreateShipmentPage;

public class ForExcel {

	static FileOutputStream fout;
	
	public static void readingFromExcel() throws EncryptedDocumentException, IOException 
	{
		//String ptr = null; 
		String excel_file_path ="./TestData1.xlsx";


		FileInputStream excel = new FileInputStream(excel_file_path);
		Workbook open = WorkbookFactory.create(excel);
		Sheet page = open.getSheet("Sheet1");
		ArrayList<String> e= new ArrayList<String>();
		/*	int lastRow = page.getLastRowNum();
		for(int i=1;i<=lastRow; i++) 
		{*/
		Row row_text = page.getRow(1);
		short lastCol = row_text.getLastCellNum();
		for(int j=1;j<lastCol;j++)
		{
			Cell colmn = row_text.getCell(j);
			String col_name = colmn.toString();
			e.add(col_name);
			//System.out.println("COLUMN....."+j+"      "+col_name);

		}
		//	}
		System.out.println(e);	

	}
	
	public static void writingToExcel() throws IOException
	{
		
		
		
			int column_count=0;
			File src_file = new File("./writingToExcel.xlsx");
			FileInputStream fis = new FileInputStream(src_file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			
			
			ArrayList<List<WebElement>> feww = ForMultipleElementsDifferentImplementation.eachElementsInCreateShipmentPage();
			int totalele = feww.size();
			System.out.println(totalele);
			for(List<WebElement> one11:feww)
			{
			
			ArrayList<String> data_from_requiredcolimn = ForMultipleElementsDifferentImplementation.method2(one11);
			int max_elements = data_from_requiredcolimn.size();
			
			
			
			
			
			 int y=0;
			
			for(int j=0;j<=max_elements;j++)
			{
				Cell cell = sheet.createRow(j).createCell(column_count);
				
				//for(int y=0;y<=max_elements;y++)
				while(y<max_elements)
				{
					String data = data_from_requiredcolimn.get(y);
					 cell.setCellValue(data);
					 break;
				}
				System.out.println("value of y   "+y++);
				fout = new FileOutputStream(src_file);
				//workbook.write(fout);
			}
			
			column_count++;
			workbook.write(fout);
			fout.close();
			}
			
		
		System.out.println("END OF WRITING DATA IN EXCEL");
	}

}
