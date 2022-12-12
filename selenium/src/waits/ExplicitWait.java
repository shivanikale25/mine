package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
          System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("https://vctcpune.com/");
          WebElement sign = driver.findElement(By.xpath("//a[text()='Click to Start Selenium Practice Now']"));
          
        WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(50000));
        w.until(ExpectedConditions.visibilityOf(sign));
        sign.click();
          
		
		
		
	}

}
