package scrolllingstudy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex02 {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phonepe.com/");
		Thread.sleep(500);
		
		JavascriptExecutor j1 = (JavascriptExecutor)driver;
	    j1.executeScript("window.scrollBy(1000,1000)");

		
	}

}
