package pomstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loggin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://neostox.com/sign-in");	
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("9011973964");
		Thread.sleep(1000);
		driver.findElement(By.id("lnk_signup1")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("2665");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		Thread.sleep(1000);

	}

}
