package testngAnnotationsstudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationstudy {
  @Test
  public void googletest()
  {
	  Reporter.log("google test done", true);
  }
  @Test
  public void redifftest()
  {
	  Reporter.log("rediffmail test done", true);
  }
  @BeforeMethod
  public void launchbrowser()
  {
	  Reporter.log("browser launch before method", true);
  }
  @AfterMethod
  public void closedbrowser()
  {
	  Reporter.log("browser closed after method", true);
  }
}
