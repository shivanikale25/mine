package neoStoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class NeoStoxLoginPage {

	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement  username;
	
	@FindBy(id = "lnk_signup1") private WebElement signin;
	
	public NeoStoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername(String mobi)
	{
		username.sendKeys(mobi);
		Reporter.log("entering mobile number ", true);
	}
	public void clickonsignin(WebDriver driver) throws InterruptedException
	{	
      Thread.sleep(1000);
		signin.click();
		Reporter.log("clicking on signinbutton ", true);

	}
	
}
