package scrolllingstudy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import generalisation.Screenshotex;

public class Assignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		    
		   Thread.sleep(1000);
		   WebElement username = driver.findElement(By.id("email"));
	       SendKeysMethod.sendkeyuse(driver, username );
	       
	       WebElement loc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	       Clickuse.clickuse(driver, loc);
	       
	       Screenshotex.ss(driver, "pune");
	       
	       Setsizeuse.setel(driver);
	       SetPositionuse.setpos(driver);
	}

}
