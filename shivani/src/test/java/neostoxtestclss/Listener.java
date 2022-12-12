package neostoxtestclss;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {

	

public void onTestFailure(ITestResult result) {
	Reporter.log("testcase ids fail please have look again", true);

}
public void onTestSuccess(ITestResult result) {
	Reporter.log("testcase completed succesfully", true);

}
public void onTestSkipped(ITestResult result) {
	Reporter.log("testcase skipped please retry", true);

}

}
