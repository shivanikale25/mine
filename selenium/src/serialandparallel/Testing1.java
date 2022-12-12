package serialandparallel;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing1 {
  @Test
  public void setposition() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://paytm.com/");
	  
	  Point p=new Point(180, 190);
	  
	  driver.manage().window().setPosition(p);
	  Point newPosition = driver.manage().window().getPosition();
	  System.out.println("newPosition is "+newPosition);
	  
	  
  }
}