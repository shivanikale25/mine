package testngstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class My1sttestngclass {
  @Test
  public void upstoxlogin() {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://login-v2.upstox.com/");
	  Reporter.log("upstox login done", true);
  }
  @Test
  public void googlelogin()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();

	  driver.get("https://www.google.com/");
	  Reporter.log("google login done", true);
  
  }
}
