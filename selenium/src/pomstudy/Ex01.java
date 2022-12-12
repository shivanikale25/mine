package pomstudy;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex01 
{
	
	@FindBy(xpath = "ghhh") private WebElement login;
	
	public Ex01(WebDriver driver)
	{PageFactory.initElements(driver, this);
	
	
	}
	public void use()
	{
		login.click();
	}
}
