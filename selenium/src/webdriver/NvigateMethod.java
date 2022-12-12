package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NvigateMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.nobroker.in/");
		Thread.sleep(1200);
		driver.navigate().to("https://housing.com/");
        Thread.sleep(1200);
        driver.navigate().to("https://www.mahindra.com/auto");
       Thread.sleep(1200);
        driver.navigate().forward();
        Thread.sleep(1200);
        driver.navigate().back();
        Thread.sleep(1200);
        driver.navigate().refresh();
	}

}
