package scrolllingstudy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy {

	public static void main(String[] args) throws InterruptedException 
	{
    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.phonepe.com/");
    Thread.sleep(500);
    
   //default size of page
    Dimension defaultsize = driver.manage().window().getSize();
    System.out.println("defaultsize is "+defaultsize);
    
   //set new size
	Dimension d=new Dimension(1000, 400);	
	driver.manage().window().setSize(d);
    Dimension newsize = driver.manage().window().getSize();
    System.out.println("newsize is "+newsize);
    
    
   
	}

}
