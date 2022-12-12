package testngkeywordsstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
	@Test(enabled = true)
	  public void shiv()
	  {
		  Reporter.log("shiv is present", true);
	  }
	  @Test(enabled = false)
	  public void mayu()
	  {
		  Reporter.log("mayu is present", true);
	  }
	  @Test(timeOut = 1000)
	  public void prnv() throws InterruptedException
	  {
		  Thread.sleep(5000);
		  Reporter.log("prnv is present", true);
	  }
	  @Test(timeOut = 1000)
	  public void om() throws InterruptedException
	  {Thread.sleep(500);
		  Reporter.log("om is present", true);
	  }
	  
}
