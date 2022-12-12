package testngkeywordsstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount = 4)
  public void repeat()
  {
	Reporter.log("login done", true);  
	  
  }
}
