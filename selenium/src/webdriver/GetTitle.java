package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.dominos.co.in/");
		System.out.println(driver.getTitle());
		 String pizza=driver.getTitle();
		 System.out.println("dominos title is"+pizza);
		 
	}

}
