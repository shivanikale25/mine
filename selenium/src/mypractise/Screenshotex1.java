package mypractise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotex1 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
			
		driver.get("https://online.kfc.co.in/");
		Thread.sleep(1000);
		
		File loc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\selenium\\screenshot\\burger.png");
		FileHandler.copy(loc, dest);
		
		
		
		
		
		
		
		
		

	}

}
