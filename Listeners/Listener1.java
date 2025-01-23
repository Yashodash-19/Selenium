package Listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import selenium_assignments.Screenshot_Date_166;

public class Listener1 implements ITestListener
{
  static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test case Pass-L");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test case failed-L");
		TakesScreenshot ts=(TakesScreenshot) driver;
		  File src= ts.getScreenshotAs(OutputType.FILE);
		  File destn=new File("C:\\\\Users\\\\yasho\\\\eclipse-workspace\\\\Selenium\\\\Screenshot\\\\Fail"+Math.random()+".png");
		  try 
		  {
			FileHandler.copy(src,destn);
		} 
		  catch (IOException e) 
		  {
			
			e.printStackTrace();
		}
		ITestListener.super.onTestFailure(result);
	}

	
}
