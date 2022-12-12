package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutltiselectionDropdowneg {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/select-menu");
    Thread.sleep(2000);
    WebElement mutltiselection = driver.findElement(By.name("cars"));
    Select smultiple=new Select(mutltiselection);
    System.out.println(smultiple.isMultiple());
    smultiple.selectByValue("saab");
    
    smultiple.selectByValue("opel");
    smultiple.selectByIndex(0);

    Thread.sleep(1000);
    smultiple.deselectAll();//only for multiple selections
    smultiple.deselectByIndex(0);
    smultiple.deselectByIndex(2);
    
    
	}

}
