package neoStoxUtility;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility {

    //excel
	//screenshot
	//scrolling
	//wait
	
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\selenium\\practise excel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		String value = mysheet.getRow(0).getCell(0).getStringCellValue();
	    return value;
	}
	public static void screenshot(WebDriver driver,String TCname) throws IOException
	{
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File dest=new File("C:\\selenium\\screenshot\\"+TCname+".png");
	FileHandler.copy(src, dest);
	}
	public static void wait(WebDriver driver,int waittime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	public static void scrollintoview(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollintoview()",element);
	}
}
