package verificationsstudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFalse {
  
  @Test
	 public void TC3() 
	 
	 {
	//boolean output= Title.isSelected();
	//boolean output= Title.isEnabled();
	//boolean output= Title.isMultiple();
	 //boolean output= Title.isDisplayed();
	 boolean Result=true;
	 
	 Assert.assertFalse(Result, "Result is true");
	 Reporter.log("TC3 is running", true);
	 }
  }
