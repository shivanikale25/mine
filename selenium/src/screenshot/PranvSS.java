package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PranvSS {

	public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://meet.google.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'साइन इन करना')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("identifier")).sendKeys("shivanikale2502@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
//		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		File dest=new File("C:\\selenium\\screenshot\\pranavSs.jpg");
//		FileHandler.copy(src, dest);
//		
		

		
	}

}
