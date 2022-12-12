package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://demoqa.com/nestedframes");
		    driver.manage().window().maximize();
		    Thread.sleep(500);
		    
		    driver.switchTo().frame("frame1");
		    Thread.sleep(500);
		    
		    String parent = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		    System.out.println("parent frame text is "+parent);
		    
		    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		    Thread.sleep(500);
		    
		    String child = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		    System.out.println("child frame text is "+child);
		    Thread.sleep(500);

		    driver.switchTo().defaultContent();
		    Thread.sleep(500);

		    String mainpgtext = driver.findElement(By.xpath("//div[text()='Nested Frames']")).getText();
		    System.out.println("text of mainpg is "+mainpgtext);
		    
		    
	}

}
