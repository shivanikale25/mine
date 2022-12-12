package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
        
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(7000);
		
		driver.findElement(By.name("q")).sendKeys("iphone 11");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13']")).click();
		Thread.sleep(3000);
		
		List<WebElement> imgs = driver.findElements(By.tagName("img"));
		System.out.println(imgs.size());
	    
		
		
	}

}
