package scrolllingstudy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phonepe.com/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		js.executeScript("window.scrollBy(1500,1000)");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(500,1000)");

		
		
		
		
		
		
		
	}

}
