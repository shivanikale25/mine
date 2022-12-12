package pomstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	@FindBy(name = "userId") private WebElement userid;
	
	@FindBy(name="password") private WebElement password;
	
	@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement signin;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void useriduse(String un) throws InterruptedException{
		userid.sendKeys(un);
		Thread.sleep(1000);
	}
	public void passworduse(String pswd) throws InterruptedException
	{
		password.sendKeys(pswd);
		Thread.sleep(1000);
		
	}
	public void sign() throws InterruptedException
	{
		signin.click();
	}
	
}
