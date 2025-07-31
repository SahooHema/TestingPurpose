package core;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {
	ExtentSparkReporter extentSparkReporter;
	public ExtentTest extentTest;
	public ExtentReports extentReports;

	@BeforeSuite(alwaysRun = true)
	public void config() {
		extentSparkReporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + "/src/test/resources/reports/" + "extentReport.html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);

		// configuration items to change the look and feel
		// add content, manage tests etc
		extentSparkReporter.config().setDocumentTitle("API Automation Report");
		extentSparkReporter.config().setReportName("GET Users");
		extentSparkReporter.config().setTheme(Theme.STANDARD);
		extentSparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}

	@AfterMethod(alwaysRun = true)
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(Status.PASS, "Test Case : " + result.getName() + " is passed ");
		} else if (result.getStatus() == ITestResult.FAILURE) {
			extentTest.log(Status.FAIL, "Test case :  " + result.getName() + " is failed ");
			extentTest.log(Status.FAIL, "Test case is failed due to:  " + result.getThrowable());
		} else {
			extentTest.log(Status.SKIP, "Test case is Skiped " + result.getName());
		}
	}

	@AfterSuite(alwaysRun = true)
	public void endReport() {
		extentReports.flush();
	}

}
