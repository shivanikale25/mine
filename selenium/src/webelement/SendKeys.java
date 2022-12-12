package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException  {
    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/login/");
    driver.manage().window().minimize();
    Thread.sleep(1200);
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chalsepranav11@gmail.com");
    Thread.sleep(1200);
    driver.findElement(By.xpath("//input[@id='email']")).clear();
    Thread.sleep(1200);
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9011973964");
    Thread.sleep(1200);
    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("shivaji@11");
    Thread.sleep(1200);
    driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
    Thread.sleep(12000);
    driver.findElement(By.xpath("//span[text()='Chalse Pranav']")).click();
    
    
	}

}
