package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
//use of get method
driver.get("https://mail.google.com/mail/");
Thread.sleep(1200);//using to give some delay
//driver.get("https://vctcpune.com/");
//use of close method-->to close current tab present in browser which is opened by selenium
//driver.close();
//use of quit method-->to close all tabs present in browser which is opened by selenium
//driver.quit();

//use of maximize and minimize the browser

driver.manage().window().maximize();

Thread.sleep(1200);
driver.manage().window().minimize();
Thread.sleep(1200);
driver.findElement(By.xpath("//span[text()='Next']")).click();
driver.findElement(By.xpath("//span[text()='Next']")).click();
driver.close();

	}

}
