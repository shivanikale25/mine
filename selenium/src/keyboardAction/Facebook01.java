package keyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook01 {

	public static void main(String[] args) throws InterruptedException 
	{
    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
    
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");

    WebElement create = driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
	Actions act=new Actions(driver);
	act.click(create).perform();
	Thread.sleep(3000);
	
    //WebElement name = driver.findElement(By.name("firstname"));
    act.keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("hivani").build().perform();
	Thread.sleep(1000);
	
	//act.sendKeys(Keys.TAB).sendKeys("kale").build().perform();
	
	WebElement last = driver.findElement(By.name("lastname"));
	act.click(last).sendKeys("kale").build().perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	WebElement sur = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//    act.click(sur).sendKeys("kale").build().perform();
//	Thread.sleep(1000);
//
//	WebElement mobno = driver.findElement(By.name("reg_email__"));
//	act.click(mobno).sendKeys("9970631267").perform();
//	Thread.sleep(1000);
//
//	WebElement pass = driver.findElement(By.name("reg_passwd__"));
//	act.click(pass).keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("hivani@123").build().perform();
//	Thread.sleep(1000);
//
//	WebElement day = driver.findElement(By.id("day"));
//	
//	for(int i=0;i<=4;i++)
//	{
//	act.click(day).sendKeys(Keys.ARROW_UP).perform();
//	Thread.sleep(500);
//
//	}
//    act.sendKeys(Keys.ENTER).perform();
//	
	
	
	
	
	
	
	}

}
