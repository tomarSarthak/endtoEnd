package extentdemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtenReportGenerator {

	static ExtentReports  extent;
	@Test
	public static  ExtentReports extentgenerator()
	{
		String path= System.getProperty("user.dir")+"\\report\\index.html";
		ExtentSparkReporter ER=new ExtentSparkReporter(path);
		ER.config().setReportName("WebAutomationResult");
		ER.config().setDocumentTitle("TestResult");
		
		extent=new ExtentReports();
		extent.attachReporter(ER);
		extent.setSystemInfo("Tester", "Sarthak");
		
		return extent;
	}
}
