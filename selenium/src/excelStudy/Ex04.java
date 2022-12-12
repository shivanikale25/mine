package excelStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex04 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("C:\\selenium\\Book1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");

		int lastrowno = mysheet.getLastRowNum();
		
		System.out.println(lastrowno);
		int totalrows = lastrowno+1;
		
		System.out.println(totalrows);
		
		
		
		
		
		
		
		
		
	}

}
