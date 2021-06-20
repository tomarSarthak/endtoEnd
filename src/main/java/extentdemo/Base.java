package extentdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {

	public WebDriver driver;
	public WebDriver intializeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");
		driver =new ChromeDriver();
		return driver;
	}
	
	
	public String getScreenshotPath(String testcasename,WebDriver driver) throws IOException
	{
		TakesScreenshot tc = (TakesScreenshot)driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
	    String dest=System.getProperty("user.dir")+"\\report\\"+testcasename +".png";
	    File destFile=new File(dest);
		FileUtils.copyFile(src, destFile);
	    return dest;
		
	}
	
}
