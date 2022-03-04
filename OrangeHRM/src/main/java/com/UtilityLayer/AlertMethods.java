package com.UtilityLayer;

import com.BaseLayer.BaseClass;

public class AlertMethods extends BaseClass{
	
	public void clickOK()
	{
		driver.switchTo().alert().accept();
	}

	public void clickCancel()
	{
		driver.switchTo().alert().dismiss();
	}
	
	public String getAlertText()
	{
		return driver.switchTo().alert().getText();
	}
	
	public void enterTextToAlertPrompt(String text)
	{
		driver.switchTo().alert().sendKeys(text);
	}
}
