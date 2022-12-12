package testngkeywordsstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependson {
	@Test
	  public void shiv()
	  {
	    Assert.fail();
		  Reporter.log("shiv is present", true);
	  }
	  @Test
	  public void mayu()
	  {
		  Reporter.log("mayu is present", true);
	  }
	  @Test(dependsOnMethods = {"shiv"})
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
