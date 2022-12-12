package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://vctcpune.com/selenium/practice.html");
     driver.manage().window().maximize();
     Thread.sleep(2000);
     WebElement checkbox = driver.findElement(By.name("checkBoxOption1"));
     System.out.println(checkbox.isSelected());
     checkbox.click();
     System.out.println(checkbox.isSelected());

     
	}

}
