package keyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOpr {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
  
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
  
     WebElement create = driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
     Actions act= new Actions(driver);
     act.click(create).perform(); 
     Thread.sleep(1000);
    
     WebElement day = driver.findElement(By.id("day"));
     act.click(day).perform();
     Thread.sleep(5000);
    
    act.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).build().perform();
    
//    act.sendKeys(Keys.ARROW_UP).perform();
//    Thread.sleep(1000);
//    act.sendKeys(Keys.ARROW_UP).perform();
//    Thread.sleep(1000);
//    act.sendKeys(Keys.ENTER).perform();
   
	}

}
