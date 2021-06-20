package extent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import extentdemo.Base;



public class extentDemo extends Base {
	WebDriver driver;	
	
	
	 @Test
	  public void initialize()
	  {
		   // ExtentTest test= extent.createTest("IntialDemo");
		    driver=intializeDriver(); 
			driver.get("http://cbt.dilipoakacademy.com/dev/#/login");  
			driver.getTitle();
			//extent.flush();   // to genrate report otherwise it will be in listening mode.
	  }
	

}
