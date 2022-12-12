package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePge {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
    Thread.sleep(2000);
    WebElement sel = driver.findElement(By.xpath("//label[text()='Female']"));
    //System.out.println(sel.isSelected());
    sel.click();
    System.out.println(sel.isSelected());

    
	}

}
