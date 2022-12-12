package pomstudy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generalisation.Screenshotex;

public class Fundspage 
{
 @FindBy(xpath = "((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]") private WebElement balance;
 
public Fundspage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void fundsvalidate(WebDriver driver) throws InterruptedException, IOException
{
	Thread.sleep(500);
	String availablefunds = balance.getText();
	System.out.println(availablefunds);
	Screenshotex.ss(driver, "funds1");
}



}
