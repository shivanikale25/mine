package testngxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {
  @Test
  public void A() 
  {
	  Reporter.log("A tc running", true);
	  
  }
  @Test
  public void B() 
  {
	  Reporter.log("B tc running", true);
	  
  }
  @Test
  public void C() 
  {
	  Reporter.log("C tc running", true);
	  
  }
  @Test
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
