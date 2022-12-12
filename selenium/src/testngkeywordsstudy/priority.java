package testngkeywordsstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
  @Test(priority = -5)
  public void shiv()
  {
	  Reporter.log("shiv is present", true);
  }
  @Test(priority = -4)
  public void mayu()
  {
	  Reporter.log("mayu is present", true);
  }
  @Test(priority = 1)
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

