package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ListEx {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(4000);
        System.out.println("++++++++++++++++++++++++for months++++++++++++++++++++++++");
        Select sdate=new Select(day);
        
        //by using list method
        List<WebElement> alldays = sdate.getOptions();

                System.out.println("++++++++++++++++++++++++for loop++++++++++++++++++++++++");
        for(int i=0;i<=alldays.size()-1;i++)
        {
        	System.out.println(alldays.get(i).getText());
        }
		
        System.out.println("++++++++++++++++++++++++for each++++++++++++++++++++++++");
        
        for(WebElement ad:alldays)
        {
        	System.out.println(ad.getText());
        }
        System.out.println("++++++++++++++++++++++++iterator++++++++++++++++++++++++");
        
        Iterator<WebElement> ad = alldays.iterator();
        while(ad.hasNext())
        {
        	System.out.println(ad.next().getText());
        	
        }
        System.out.println("++++++++++++++++++++++++listiterator++++++++++++++++++++++++");

        ListIterator<WebElement> li = alldays.listIterator();
        while(li.hasNext())
        {
        	System.out.println(li.next().getText());
        	
        }
        
       System.out.println("===========================================================================");
       System.out.println("++++++++++++++++++++++++for months++++++++++++++++++++++++");

         WebElement smonth = driver.findElement(By.id("month"));
         Select smo=new Select(smonth);
         
         List<WebElement> allmonth = smo.getOptions();
         System.out.println("++++++++++++++++++++++++for ++++++++++++++++++++++++");

         
         for(int i=0;i<=allmonth.size()-1;i++)
         {
        	 System.out.println(allmonth.get(i).getText());
         }
         System.out.println("++++++++++++++++++++++++for each++++++++++++++++++++++++");
 

		for(WebElement am:allmonth)
		{
			System.out.println(am.getText());
			
		}
		
        System.out.println("++++++++++++++++++++++++iterator++++++++++++++++++++++++");

        
        Iterator<WebElement> at = allmonth.iterator();
        while(at.hasNext())
        {
        	System.out.println(at.next().getText());
        }
        System.out.println("++++++++++++++++++++++++listiterator++++++++++++++++++++++++");

        
        ListIterator<WebElement> lt = allmonth.listIterator();
        while(lt.hasNext())
        {
        	System.out.println(lt.next().getText());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
