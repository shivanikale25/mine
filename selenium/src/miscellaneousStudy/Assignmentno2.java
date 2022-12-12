package miscellaneousStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentno2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    
        //searching iphone 13
		driver.findElement(By.name("q")).sendKeys("iphone 13");
  	    Thread.sleep(500);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(6000);
		
        //getting the ratings of iphone 13 by dynamic way
		String ratings = driver.findElement(By.xpath("((//div[contains(@class,'col col-')])[1]//span)[4]")).getText();
		System.out.println("ratings are "+ratings);
  	    Thread.sleep(500);
        
		String starratings = driver.findElement(By.xpath("((//div[contains(@class,'col col-')])[1]//span)[1]")).getText();
		System.out.println("*ratings are "+starratings);
        
		
		
	}

}
