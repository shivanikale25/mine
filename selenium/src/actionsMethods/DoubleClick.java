package actionsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    Thread.sleep(1000);
	    WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    
	    Actions act=new Actions(driver);
	    
	    //1 st way
//	    act.moveToElement(doubleclick).perform();
//	    act.doubleClick().perform();
//	    
//	    //2nd way
//	   act.moveToElement(doubleclick).doubleClick().build().perform();
//	    
	    //3rd way
	    act.doubleClick(doubleclick).perform();
	    
	}

}
