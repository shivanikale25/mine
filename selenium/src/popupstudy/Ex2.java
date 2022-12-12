package popupstudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) throws InterruptedException
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	     
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/alerts");
			Thread.sleep(1000);
		    driver.findElement(By.id("timerAlertButton")).click();
			Thread.sleep(5000);
            
			Alert alt=driver.switchTo().alert();
			
		    System.out.println(alt.getText());

			alt.accept();
			Thread.sleep(1000);

		
		
	}

}
