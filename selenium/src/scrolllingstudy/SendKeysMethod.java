package scrolllingstudy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SendKeysMethod {
	
	public static void sendkeyuse(WebDriver driver,WebElement element)
	{
	
	 JavascriptExecutor j1 = (JavascriptExecutor)driver;
	   j1.executeScript("arguments[0].value='shivani@gmail.com';",element);
	}

}
