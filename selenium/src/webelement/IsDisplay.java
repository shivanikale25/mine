package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://vctcpune.com/selenium/practice.html");
    Thread.sleep(100);
    WebElement textbox = driver.findElement(By.id("displayed-text"));
    WebElement hide = driver.findElement(By.id("hide-textbox"));
    hide.click();
    System.out.println(textbox.isDisplayed());
    //textbox.sendKeys("hi pranav");

    WebElement textbox1 = driver.findElement(By.xpath("//input[@placeholder='select your district']"));
    System.out.println(textbox1.isDisplayed());
	}

}
