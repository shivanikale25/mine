package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshoteg01 {

	public static void main(String[] args) throws InterruptedException, IOException {
		    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://www.instagram.com/accounts/login/");
		    
		    String str=RandomString.make(2);
		    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    File destination= new File("C:\\selenium\\screenshot\\myscreenshot3"+str+".png");
		    FileHandler.copy(source, destination);
		    
	}

}
