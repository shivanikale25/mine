package testngkeywordsstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable {
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
	  @Test
	  public void prnv()
	  {
		  Reporter.log("prnv is present", true);
	  }
	  @Test
	  public void om()
	  {
		  Reporter.log("om is present", true);
	  }
	  
}
