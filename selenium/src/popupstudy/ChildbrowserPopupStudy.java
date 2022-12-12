package popupstudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildbrowserPopupStudy {

	public static void main(String[] args) throws InterruptedException {

	    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
			
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		//finding main page id
		String mainpg = driver.getWindowHandle();
		System.out.println(mainpg);
		//finding webelement
        driver.findElement(By.name("NewWindow")).click();
        //store the reference variable to get all id's using getwindowhandles
        Set<String> allpg = driver.getWindowHandles();
        System.out.println("===================for each loop==================");
		for(String a:allpg)
		{
			System.out.println(a);
		}
		System.out.println("===================for iterator==================");
		Iterator<String> it = allpg.iterator();
		String mainpg1 = it.next();
		Thread.sleep(2000);
        System.out.println(mainpg1);
		String cp = it.next();
		//System.out.println(cp) 
		//switching to child page
		driver.switchTo().window(cp);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Home'])[1]")).click();
        driver.close();
		
		driver.switchTo().window(mainpg1);
		Thread.sleep(500);
		
		driver.findElement(By.name("NewTab")).click();
		Thread.sleep(2000);

	Set<String> tab = driver.getWindowHandles();
	
      Iterator<String> tt = tab.iterator();		
      String nt = tt.next();
      String nwt = tt.next();
      //switching to new tab
      driver.switchTo().window(nwt);
	 Thread.sleep(7000);
     driver.findElement(By.xpath("(//span[text()='HOME'])[1]")).click();
      
      
		
		
		
		
		
		
		
		
		
		
		
	}

}
