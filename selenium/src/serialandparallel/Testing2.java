package serialandparallel;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing2 {
  @Test
  public void setsize() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		
		System.out.println(driver.manage().window().getSize());
	
		Dimension d=new Dimension(300, 1000);
		Thread.sleep(500);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
  }
}
