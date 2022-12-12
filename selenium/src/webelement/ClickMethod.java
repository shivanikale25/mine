package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.snapchat.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("shivk14325");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("SHIVANI@25");
		Thread.sleep(1200);
		driver.findElement(By.xpath("//button[@id='home_children_button']")).click();
        driver.close();
		
	
		
	}

}