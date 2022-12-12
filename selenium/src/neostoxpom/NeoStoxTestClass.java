package neostoxpom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import neoStoxUtility.UtilityNew;

public class NeoStoxTestClass {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
       
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://neostox.com/sign-in");	
		UtilityNew.wait(driver, 1000);

		NeoStoxLoginPage login=new NeoStoxLoginPage(driver);
		login.enterusername(UtilityNew.readdatafrompropertyfile("mobnum"));
		login.clickonsignin(driver);
		UtilityNew.wait(driver, 2000);
		
		NeoStoxPassPage pass1=new NeoStoxPassPage(driver);
		pass1.enterpassword(UtilityNew.readdatafrompropertyfile("pass"), driver);
		pass1.clickonsubmit();
		UtilityNew.wait(driver, 2000);

		NeoStoxPopUp popup=new NeoStoxPopUp(driver);
		popup.popuphandle(driver);
		UtilityNew.wait(driver, 2000);

		NeoStoxHomePage home=new NeoStoxHomePage(driver);
		String actualusername = home.getusername();
		String expusername = UtilityNew.readdatafrompropertyfile("expusername");
		
		if(actualusername.equals(expusername))
		{
			System.out.println("actualusername is matching with expected username so test case pass" );
		}
		else
		{
			System.out.println("actualusername is not  matching with expected username test case fail" );
		}
		
		home.getbalance();
		UtilityNew.wait(driver, 1000);

		home.logoutdone(driver);
		UtilityNew.wait(driver, 1000);

		driver.close();
	}

}
