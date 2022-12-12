package verificationsstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEquals {
  @Test
  public void f() {

	  {
	  String ExpectedResult="VCTCpune";
	  String ActualResult="VCTC";
	  
	  Assert.assertNotEquals(ActualResult, ExpectedResult,"Result is matching");
	  
	  Reporter.log("TC1 is running", true);
	  }
  }
}
