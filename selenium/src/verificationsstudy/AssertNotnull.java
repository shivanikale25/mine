package verificationsstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotnull {
  @Test
  public void f() {
	  String str="shiv";
	  Assert.assertNotNull(str,"Value is null");
	  Reporter.log("TC5 is running", true);
  }
}
