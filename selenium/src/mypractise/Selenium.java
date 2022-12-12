package mypractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
    
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.facebook.com/");
    Thread.sleep(500);
    driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.name("firstname")).sendKeys("shivani");
    Thread.sleep(500);
    driver.findElement(By.name("lastname")).sendKeys("kale");
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9970631267");
    driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Shiv@14325");
    
    WebElement day=driver.findElement(By.id("day"));
    
    Select sday=new Select(day);
    sday.selectByValue("5");
    day.click();
    
    List<WebElement> days = sday.getOptions();
    
    for(WebElement a:days)
    {
    	System.out.println(a.getText());
    }
    System.out.println("========================================================================="); 
    WebElement month = driver.findElement(By.id("month"));
    Select smonth=new Select(month);
    smonth.selectByVisibleText("Feb");
    month.click();
    List<WebElement> months = smonth.getOptions();

    for(WebElement b:months)
    {
   	System.out.println(b.getText());
    }
    System.out.println("========================================================================="); 
    
    WebElement year = driver.findElement(By.id("year"));
    
    Select syear=new Select(year);
    syear.selectByValue("1996");
    // year.click();
    List<WebElement> years = syear.getOptions();
    for(WebElement s:years)
    {
    	System.out.println(s.getText());
    }
    //driver.findElement(By.xpath("//label[text()='Female']")).click();
    
    
    
    
    
    
    
    
    
    
    
    
	}
    
	
	

}
