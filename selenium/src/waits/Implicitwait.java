package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Implicitwait {

	public static void main(String[] args) 
	{   System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		
		
	    WebElement wa = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		wa.click();
      
	}

}
