package neostoxpom;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {

	

@Override
public void onTestFailure(ITestResult result) {
	Reporter.log("testcase ids fail please have look again", true);

}
@Override
public void onTestSuccess(ITestResult result) {
	Reporter.log("testcase completed succesfully", true);

}
@Override
public void onTestSkipped(ITestResult result) {
	Reporter.log("testcase skipped please retry", true);

}

}
