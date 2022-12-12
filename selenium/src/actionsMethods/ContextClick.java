package actionsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement click = driver.findElement(By.xpath("//span[text()='right click me']"));
	    Thread.sleep(1000);

		Actions act=new Actions(driver);
		
		//1 st way
//		act.moveToElement(click).perform();
//		act.contextClick().perform();
		
		//2nd way
//		act.moveToElement(click).contextClick().build().perform();
		
		//3rd way
	//	act.contextClick(click).perform();
		
		act.contextClick(click).click().perform();
	}

}
