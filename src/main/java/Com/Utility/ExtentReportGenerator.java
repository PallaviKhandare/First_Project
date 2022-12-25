package Com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	public static ExtentReports getReports() {
		
		String filepath="C:\\Workspace\\First_Project\\Reports";
		
		//
		ExtentSparkReporter reporter=new ExtentSparkReporter(filepath);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("First Project Report");
		reporter.config().setTheme(Theme.DARK);
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "First Project");
		extent.setSystemInfo("Module Name","XYZ");
		extent.setSystemInfo("Automation","Selenium WebDriver");
		extent.setSystemInfo("QA", "ABC");
		return extent;
	}

}
