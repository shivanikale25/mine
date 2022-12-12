package groupstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing2 {
  @Test(groups = "regression")
  public void F() 
  {
	  Reporter.log("F tc running", true);
	  
  }
  @Test
  public void G() 
  {
	  Reporter.log("G tc running", true);
	  
  }
  @Test(groups = "regression")
  public void H() 
  {
	  Reporter.log("H tc running", true);
	  
  }
  @Test
  public void I() 
  {
	  Reporter.log("I tc running", true);
	  
  }
  @Test(groups = "sanity")
  public void J() 
  {
	  Reporter.log("J tc running", true);
	  
  }
}
