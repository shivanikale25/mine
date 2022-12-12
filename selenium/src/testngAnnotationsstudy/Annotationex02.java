package testngAnnotationsstudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Annotationex02 {
  @Test
  public void facebook() {
	  Reporter.log("userlogin done", true);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  Reporter.log("launch facebook ", true);

  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("facebook login done", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("facebook logout done", true);

  }

  

  @AfterClass
  public void afterClass() {
	  Reporter.log("facebook closed", true);

  }

}
