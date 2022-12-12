package actionsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
    
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.guru99.com/test/drag_drop.html");
    
    WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
    
    WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
    
    Actions act=new Actions(driver);
    
    act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
    
    
    
	}

}
