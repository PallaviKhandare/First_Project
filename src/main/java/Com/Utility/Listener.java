package Com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener extends Base_Class implements ITestListener {
	ExtentReports extent=ExtentReportGenerator.getReports();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		Library.test=extent.createTest(result.getTestClass().getTestName()+"=="+result.getMethod().getMethodName());
		extenttest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		Library.test.log(Status.PASS, "Test Case Pass");
		Library.test.addScreenCaptureFromBase64String(getCapture());
	}

	public void onTestFailure(ITestResult result) {
		Library.test.log(Status.FAIL, "Test Case Fail");
		Library.test.addScreenCaptureFromBase64String(getCapture());
		
	}

	public void onTestSkipped(ITestResult result) {
		Library.test.log(Status.SKIP, "Test Case Skip");
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
	}
	
	public static String getCapture() {
		TakesScreenshot ts=(TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.BASE64);
	}

	 
		

	}


