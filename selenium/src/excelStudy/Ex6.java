package excelStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\selenium\\Book1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	
		//excel reading in dynamic way

		int lastrow = mysheet.getLastRowNum();
		System.out.println(lastrow);
		int lastcell = mysheet.getRow(0).getLastCellNum()-1;
		System.out.println(lastcell);
		
		for(int i=0;i<=lastrow;i++)
		{
			for(int j=0;j<=lastcell;j++)
			{
				System.out.print(mysheet.getRow(i).getCell(j).getCellType()+" ");
				Cell data = mysheet.getRow(i).getCell(j);
				CellType type = data.getCellType();
				
				if(type==CellType.STRING)
				{
					System.out.print(data.getStringCellValue()+" ");
				}
				else if(type==CellType.NUMERIC)
				{
					System.out.print(data.getNumericCellValue()+" ");
				}
				else if(type==CellType.BLANK)
				{
					System.out.print(data.getStringCellValue()+" ");
				}
				else if(type==CellType.BOOLEAN)
				{
					System.out.print(data.getBooleanCellValue()+" ");
				}
				//System.out.println();

			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		

	}

}
