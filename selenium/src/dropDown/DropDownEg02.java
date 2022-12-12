package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/");
		   Thread.sleep(1000);
		   
		   driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		   Thread.sleep(5000);
		   
		   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("shivani");
		   Thread.sleep(500);
		   
		   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kale");
		   Thread.sleep(500);
		   
		   driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("shivanikale1");
		   Thread.sleep(500);
		   
		   driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("kale12");
		   Thread.sleep(500);
		   
		   driver.findElement(By.xpath("//label[text()='Female']")).click();
		   Thread.sleep(1000);


		   
		   WebElement days=driver.findElement(By.id("day"));
		   Select date=new Select(days);
		   date.selectByVisibleText("25");
		   
		   WebElement months=driver.findElement(By.id("month"));
		   Select smonth=new Select(months);
		   smonth.selectByValue("2");
		   
		   WebElement years= driver.findElement(By.id("year"));
		   Select eyear=new Select(years);
		   eyear.selectByVisibleText("1996");
		   
		  for(int i=0;i<=6;i++)
		  {
			  Thread.sleep(500);
			  smonth.selectByIndex(i);
		  }
		   
		  for(int i=6;i>=0;i--)
		  {
			  Thread.sleep(500);
			  smonth.selectByIndex(i);
		  }
		 System.out.println(smonth.isMultiple());
		 System.out.println(smonth.getFirstSelectedOption().getText());
		 
		   
		   
	}

}
