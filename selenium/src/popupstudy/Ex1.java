package popupstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) throws InterruptedException
	{
     System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
     
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
