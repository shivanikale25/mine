package excelStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex02 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\selenium\\Book1.xlsx");
//		Workbook myworkbook = WorkbookFactory.create(myfile);
//		
//		Sheet mysheet = myworkbook.getSheet("Sheet1");
//		Row myrow = mysheet.getRow(0);
//		Cell mycell = myrow.getCell(0);
//		CellType mytype = mycell.getCellType();
//		System.out.println(mytype);
//		String myvalue = mycell.getStringCellValue();
//		System.out.println(myvalue);
//		
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String value = mysheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);

		
	}

}
