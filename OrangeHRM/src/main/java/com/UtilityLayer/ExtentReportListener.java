package com.UtilityLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentReportListener extends ExtentReportSetup implements ITestListener{
public static ExtentTest extentTest;
	public void onStart(ITestContext context) {
		extent = ExtentReportSetup.extentReportSetup();
		System.out.println("Report started");
	}
	
	public void onTestStart(ITestResult result){
		extentTest = extent.createTest(result.getMethod().getMethodName());
		System.out.println("Test case name is "+result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result){
		extentTest.log(Status.PASS, "Test is passed : "+result.getMethod().getMethodName());
		extentTest.addScreenCaptureFromPath(ExtentReportSetup.getPassedTestCaseScreenshot(result.getMethod().getMethodName()));
	}
	
	public void onTestFailure(ITestResult result){
		extentTest.log(Status.FAIL, "Test is failed : "+result.getMethod().getMethodName());
		extentTest.addScreenCaptureFromPath(ExtentReportSetup.getFailedTestCaseScreenshot(result.getMethod().getMethodName()));
	}
	
	public void onTestSkipped(ITestResult result){
		extentTest.log(Status.SKIP, "Test is Skipped : "+result.getMethod().getMethodName());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result){
		
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("All test cases finished");
		extent.flush();
	}
}
