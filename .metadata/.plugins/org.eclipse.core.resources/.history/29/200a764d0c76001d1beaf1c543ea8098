package neostoxpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityNew;

public class NeoStoxHomePage {
@FindBy (id = "lbl_username") private WebElement username;
@FindBy (id = "lbl_curbalancetop") private WebElement balance;
@FindBy(xpath = "//span[text()='Logout']") private WebElement logout;


public NeoStoxHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public String getusername()
{
	String actualusername = username.getText();
	Reporter.log("getting actualusername ", true);
	return actualusername;
	

}
public void getbalance()
{
	String actualbalance = balance.getText();
	Reporter.log("getting actualbalance "+actualbalance, true);

}
public void logoutdone(WebDriver driver)
{
	username.click();
	Reporter.log("clicking on username button ", true);
	UtilityNew.wait(driver, 1000);
	Reporter.log("clicking on logout button ", true);
	logout.click();

}

}

