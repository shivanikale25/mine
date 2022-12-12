package crossbrowsertestinguse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
	}

}
