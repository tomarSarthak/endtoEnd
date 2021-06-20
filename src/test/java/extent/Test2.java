package extent;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import extentdemo.Base;

public class Test2 extends Base{

	 public WebDriver driver;

	 @Test
	  public void getgmail()
	  {
		   // ExtentTest test= extent.createTest("IntialDemo");
		     driver=intializeDriver(); 
			driver.get("https://gmail.com");  
			driver.getTitle();
			//extent.flush();   // to genrate report otherwise it will be in listening mode.
	  }
}
