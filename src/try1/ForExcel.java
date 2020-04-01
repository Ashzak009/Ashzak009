package try1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ForExcel {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
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

}
