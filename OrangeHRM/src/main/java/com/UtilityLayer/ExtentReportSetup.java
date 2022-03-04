package com.UtilityLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseLayer.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportSetup extends BaseClass{
private static String datetime = new SimpleDateFormat("_ddMMyyy_HHmmss_").format(new Date());
public static ExtentSparkReporter spark;
public static ExtentReports extent;

	public static ExtentReports extentReportSetup()
	{
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\"+datetime+".html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		return extent;
	}
	
	public static String getFailedTestCaseScreenshot(String methodname)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"\\FailedTestScreenshot\\"+datetime+methodname+".png";
		File destination = new File(dest);
		try {
			FileUtils.copyFile(src, destination);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return dest;
	}
	
	public static String getPassedTestCaseScreenshot(String methodname)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"\\PassedTestScreenshot\\"+datetime+methodname+".png";
		File destination = new File(dest);
		try {
			FileUtils.copyFile(src, destination);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return dest;
	}
}
