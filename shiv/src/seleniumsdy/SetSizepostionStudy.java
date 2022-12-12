package seleniumsdy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetSizepostionStudy {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.gecko.driver", "C:\\selenium\\Geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("https://www.facebook.com/");
       Thread.sleep(500);
      Dimension defaultsi = driver.manage().window().getSize();
      System.out.println(defaultsi);
      Dimension d=new Dimension(520, 720);
      driver.manage().window().setSize(d);
      
      System.out.println(driver.manage().window().getSize());
      
      
      
      
       System.out.println(driver.manage().window().getPosition());
       Point p=new Point(-5, 2);
       driver.manage().window().setPosition(p);
       System.out.println(driver.manage().window().getPosition());


	}

}
