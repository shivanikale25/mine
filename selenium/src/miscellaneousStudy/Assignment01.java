package miscellaneousStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("bmw");
		Thread.sleep(1000);
		//findout the list of all suggested elements
		List<WebElement> lis = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(WebElement s:lis)
		{
		System.out.println(s.getText());
			
		String car="bmw car";
		if(car.equals(s.getText()))
			{
				s.click();
				driver.findElement(By.xpath("//a[text()='Images']")).click();
				Thread.sleep(1000);
				//findout the count of imgs
				List<WebElement> count = driver.findElements(By.tagName("img"));
				System.out.println(count.size());
				break;
			}
			
		}
		
		
		
	}

}
