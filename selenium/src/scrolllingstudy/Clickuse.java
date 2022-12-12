package scrolllingstudy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clickuse {

public static void clickuse(WebDriver driver,WebElement element)
		{JavascriptExecutor j1 = (JavascriptExecutor)driver;
		 j1.executeScript("arguments[0].click()",element);
		
	}

}
