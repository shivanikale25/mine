package scrolllingstudy;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class SetPositionuse {
	public static void setpos(WebDriver driver)
	{
		Point p=new Point(500, 200);
		driver.manage().window().setPosition(p);
	}

}
