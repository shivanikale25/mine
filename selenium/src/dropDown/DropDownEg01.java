package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg01 {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://vctcpune.com/selenium/practice.html");
   Thread.sleep(500);
   WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
   Select dr=new Select(dropdown);
   dr.selectByVisibleText("Option3");
   Thread.sleep(500);
   
	}

}
