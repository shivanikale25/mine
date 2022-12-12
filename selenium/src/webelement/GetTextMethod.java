package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.discoveryplus.in/");
    Thread.sleep(5000);
    WebElement element= driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
    
    System.out.println(element.getText());
    element.click();
    
     WebElement get = driver.findElement(By.xpath("//button[text()='Get OTP']"));
     boolean isenable= get.isEnabled();
     System.out.println(isenable);
	}

}
 