package chromeoptionsuse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex01 {

	public static void main(String[] args) 
	{
         
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	    ChromeOptions opt=new ChromeOptions();
	    //opt.addArguments("disable-notifications");
	    opt.addArguments("disable-infobars");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.justdial.com/");
		String title = driver.getTitle();
	System.out.println("the page title is "+title);	
	String text = driver.findElement(By.xpath("//span[text()='Shop Online']")).getText();
	System.out.println(text);
	}

}
