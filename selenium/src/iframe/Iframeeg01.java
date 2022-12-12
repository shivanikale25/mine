package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeeg01 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://demoqa.com/frames");
		    Thread.sleep(1000);
		    
		   driver.switchTo().frame("frame1");
		   Thread.sleep(100);
		   String frame1 = driver.findElement(By.id("sampleHeading")).getText();
		   System.out.println("frame1 is "+frame1);
		   driver.switchTo().defaultContent();
		   driver.switchTo().frame("frame2");
		   Thread.sleep(1000);
		    String frame2=driver.findElement(By.id("sampleHeading")).getText();
		    System.out.println("frame2 is "+frame2);
		   
		    
	}

}
