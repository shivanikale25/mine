package excelStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\selenium\\Book1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	
//		System.out.println("last row number "+mysheet.getLastRowNum());
//		int totalrows = mysheet.getLastRowNum();
//        System.out.println("total rows "+(totalrows+1));
//        
//        short lastcell = mysheet.getRow(0).getLastCellNum();
//        System.out.println("last cell number "+lastcell);
//        System.out.println("total cell "+(lastcell-1));

        //excel reading in static way
        //outer for loop for rows
        System.out.println("++++++++++++++++++++excel reading in static way++++++++++++++++++++++++");

        for(int i=0;i<=6;i++)
        {
        	//outer for loop for cell
        	for(int j=0;j<=2;j++)
        	{
        		System.out.print(mysheet.getRow(i).getCell(j).getCellType()+" ");
        	}
        	System.out.println();
        }
        
        System.out.println("++++++++++++++++++++excel reading in dynamic way++++++++++++++++++++++++");
        //excel reading in dynamic way

        int lastrow = mysheet.getLastRowNum();
        int lastcell = mysheet.getRow(0).getLastCellNum()-1;
        
        for(int a=0;a<=lastrow;a++)
        {
        	for(int b=0;b<=lastcell;b++)
        	{
        		System.out.print(mysheet.getRow(a).getCell(b).getCellType()+" ");
        	}
        	System.out.println();

        }
        
        
        
        
        
        
        
	}

}
