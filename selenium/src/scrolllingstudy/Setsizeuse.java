package scrolllingstudy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Setsizeuse {

	public static void setel(WebDriver driver)
	{
		
		Dimension d=new Dimension(1000, 400);	
		driver.manage().window().setSize(d);
	
	}

	

}
