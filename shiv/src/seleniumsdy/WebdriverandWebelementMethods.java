package seleniumsdy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverandWebelementMethods {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(500);

		String s = driver.findElement(By.xpath("//div[text()='Sign Up']")).getText();
		
		System.out.println(s);
		boolean h = driver.findElement(By.name("sex")).isSelected();
		System.out.println(h);
		boolean i = driver.findElement(By.name("websubmit")).isEnabled();
		System.out.println(i);
		
	}

}
