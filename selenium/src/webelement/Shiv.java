package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shiv {

	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://accounts.google.com/ServiceLogin?service=mail");
	   driver.navigate().to("https://www.dominos.co.in/");
	   Thread.sleep(1000);
	   driver.manage().window().maximize();
	   Thread.sleep(1000);
	   driver.manage().window().minimize();
	   Thread.sleep(1000);
	   driver.manage().window().maximize();
       Thread.sleep(1200);
	   driver.navigate().back();
	   Thread.sleep(1000);
	   driver.navigate().forward();
	   Thread.sleep(1000);
	   driver.navigate().back();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("shivanikale2502@gmail.com");
	   Thread.sleep(1200);
	   driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	   driver.close();
       
	   
	   
	}
}
