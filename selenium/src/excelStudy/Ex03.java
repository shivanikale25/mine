package excelStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex03 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("C:\\selenium\\Book1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String value = mysheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		System.out.println("============================");

		//for reading one row n more cell
		for(int i=0;i<=2;i++)
		{
			String value1 = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value1+" ");
		}
		System.out.println();
		System.out.println("============================");
		//reading more rows n one cell
		for(int i=0;i<=2;i++)
		{
			String value2 = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.print(value2+" ");

		}
		System.out.println();
		System.out.println("============================");
		
		
		
	//reading whole data from excel 
	//outer for loop-->for reading rows
		for(int i=0;i<=2;i++)
		{
			//inner for loop-->for reading cell
			for(int j=0;j<=2;j++)
			{
				String value3 = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value3+" ");
			}
			System.out.println();
			
			
		}
		
		System.out.println("============================");
		
	}

}
