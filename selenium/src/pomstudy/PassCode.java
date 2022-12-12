package pomstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassCode {
	
	
	@FindBy(xpath ="//input[@type='text']") private WebElement passcode;
	
	public PassCode(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void passcode1(String pass) throws InterruptedException
	{
		passcode.sendKeys(pass);
	}

}
