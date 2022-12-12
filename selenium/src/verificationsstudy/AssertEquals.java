package verificationsstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals {
  
  @Test
  public void TC1() 
  
  {
  String ExpectedResult="VCTCp";
  String ActualResult="VCTC";
  
  Assert.assertEquals(ActualResult, ExpectedResult,"Result is not matching");
  
  Reporter.log("TC1 is running", true);
  }
  @Test
 public void TC2() 
  
  {
  String ExpectedResult="VCTC";
  String ActualResult="VCTC";
  
  Assert.assertEquals(ActualResult, ExpectedResult,"Result is not matching");
  
  Reporter.log("TC1 is running", true);
  }
}

