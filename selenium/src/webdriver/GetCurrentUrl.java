package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.dominos.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String currenturl = driver.getCurrentUrl();
		Thread.sleep(1200);
		driver.close();
		System.out.println("current url is "+currenturl);
	}

}
