package verificationsstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void TC5() 
  
  {
 String str=null;
 Assert.assertNull(str,"Value is not null");
 Reporter.log("TC5 is running", true);
  
}
}
