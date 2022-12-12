package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://mail.google.com/mail/");
       driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();
       driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
