package neostoxpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityNew;

public class NeoStoxPopUp {
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement okbutton;
	@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement closebutton;
	
	public NeoStoxPopUp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void popuphandle(WebDriver driver)

	{
		if(okbutton.isDisplayed())
		{
			okbutton.click();
			Reporter.log("clicking on ok button ", true);
			closebutton.click();
			Reporter.log("clicking on close button ", true);
			
		}
		else
		{
			Reporter.log("popup not visible go ahead ", true);

		}

	}
}
