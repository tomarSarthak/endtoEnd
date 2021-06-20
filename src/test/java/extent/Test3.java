package extent;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentdemo.Base;

public class Test3 extends Base{

	
	public WebDriver driver;

	 @Test
	  public void getfacebook()
	  {
		   // ExtentTest test= extent.createTest("IntialDemo");
		     driver=intializeDriver(); 
			driver.get("https://facebook.com");  
			driver.getTitle();
			Assert.assertEquals("Google", driver.getTitle());
			//extent.flush();   // to genrate report otherwise it will be in listening mode.
	  }
}
