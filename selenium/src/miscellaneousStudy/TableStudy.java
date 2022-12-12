package miscellaneousStudy;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableStudy {

	public static void main(String[] args) throws InterruptedException
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 Thread.sleep(1000);
		 //finding number of rows present in table
		 List<WebElement> rowscount = driver.findElements(By.xpath("//table[@id='product']//tr"));
		 System.out.println("number of rows "+rowscount.size());
		 //finding number of columns present in table

		 List<WebElement> columncount = driver.findElements(By.xpath("//table[@id='product']//tr//th"));
		 System.out.println("number of columns "+columncount.size());
		 //finding data present in table
		 List<WebElement> tabledata = driver.findElements(By.xpath("//table[@id='product']//tr"));
		 
		 Iterator<WebElement> td = tabledata.iterator();
		 while(td.hasNext())
		  {
			System.out.println(td.next().getText());
		  }
		
		
		
		
		
		
		
		
		
		
	}

}
