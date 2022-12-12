package neoStoxBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.UtilityNew;

public class Base {
	public WebDriver driver;

	public void launchbrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
		Reporter.log("launching browser ", true);
	 driver.get(UtilityNew.readdatafrompropertyfile("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	
	
	System.out.println();
	
	}
}
