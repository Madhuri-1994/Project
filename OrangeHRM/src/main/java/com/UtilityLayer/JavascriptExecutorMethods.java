package com.UtilityLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class JavascriptExecutorMethods extends BaseClass{

	public static void clickOnElement(WebElement wb)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", wb);
	}

	public static void enterStringIntoTextbox(WebElement wb, String text)
	{
		//((JavascriptExecutor)driver).executeScript(, null)

	}
}
