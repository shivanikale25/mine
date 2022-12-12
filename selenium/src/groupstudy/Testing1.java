package groupstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {
  @Test(groups = "regression")
  public void A() 
  {
	  Reporter.log("A tc running", true);
	  
  }
  @Test(groups = "sanity")
  public void B() 
  {
	  Reporter.log("B tc running", true);
	  
  }
  @Test
  public void C() 
  {
	  Reporter.log("C tc running", true);
	  
  }
  @Test(groups = "sanity")
  public void D() 
  {
	  Reporter.log("D tc running", true);
	  
  }
  @Test
  public void E() 
  {
	  Reporter.log("E tc running", true);
	  
  }
}
