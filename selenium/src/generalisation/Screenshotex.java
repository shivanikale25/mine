package generalisation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotex 
{

	public static void ss(WebDriver driver,String val) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File destination= new File("C:\\selenium\\screenshot\\"+val+".jpeg");
	   
	    FileHandler.copy(src, destination);
	}
	
	
}
