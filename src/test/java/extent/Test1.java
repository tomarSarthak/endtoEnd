package extent;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import extentdemo.Base;

public class Test1 extends Base{
	
	
	public  WebDriver driver;

	 @Test
	  public void getgoogle()
	  {
		   // ExtentTest test= extent.createTest("IntialDemo");
		     driver=intializeDriver(); 
			driver.get("https://google.com");  
			driver.getTitle();
			System.out.println("i have added ");
			//extent.flush();   // to genrate report otherwise it will be in listening mode.
	  }

}
