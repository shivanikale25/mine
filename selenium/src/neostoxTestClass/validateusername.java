package neostoxTestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neoStoxBase.Base;
import neoStoxUtility.UtilityNew;
import neostoxpom.NeoStoxHomePage;
import neostoxpom.NeoStoxLoginPage;
import neostoxpom.NeoStoxPassPage;
import neostoxpom.NeoStoxPopUp;

@Listeners(neostoxpom.Listener.class)
public class validateusername  extends Base{
	NeoStoxLoginPage login;
	NeoStoxPassPage passcode;
	NeoStoxPopUp popuphand;
	NeoStoxHomePage homepage;
	
	@BeforeClass
	public void launchneostox() throws IOException
	{
		launchbrowser();
		login=new NeoStoxLoginPage(driver);
		passcode=new NeoStoxPassPage(driver);
		popuphand=new NeoStoxPopUp(driver);
		homepage=new NeoStoxHomePage(driver);
	}
	@BeforeMethod
	public void signintoneostox() throws IOException, InterruptedException
	{
		login.enterusername(UtilityNew.readdatafrompropertyfile("mobnum"));
		login.clickonsignin(driver);
		UtilityNew.wait(driver, 1000);
		passcode.enterpassword(UtilityNew.readdatafrompropertyfile("pass"), driver);
        Thread.sleep(1000);
		passcode.clickonsubmit();
		UtilityNew.wait(driver, 1000);
        popuphand.popuphandle(driver);
		UtilityNew.wait(driver, 1000);

	}
	@Test
    public void validateuserid() throws IOException
    {
		
		Assert.assertEquals(homepage.getusername(), UtilityNew.readdatafrompropertyfile("expusername"),"not matching testcase fail");
      Reporter.log("matching tc pass",true);
      UtilityNew.screenshot(driver, "userid validation");
    }
	@Test(priority = -1)
	public void getbalance()
	{
		homepage.getbalance();
		
	}
	@AfterMethod
	public void logoutfromneostox()
	{
		homepage.logoutdone(driver);
	}
	
	@AfterClass
	public void closebrow()
	{
		Reporter.log("closing browser", true);
		driver.close();
	}
	
	//globally declaration of each class
    //browser launched before class //intialisation 
	
	//login before method //calling 
    //in @test validate userid
	//logout after method
	//closed browser after class
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  
  
}
