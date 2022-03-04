package com.UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseLayer.BaseClass;

public class ActionsClassMethods extends BaseClass{
private Actions act = new Actions(driver);

/**************** Mouse events *******************/
	public void clickOnElement(WebElement w)
	{
		act.click(w).build().perform();
	}
	
	public void rightClick(WebElement w)
	{
		act.contextClick(w).build().perform();
	}
	
	public void doubleClick(WebElement w)
	{
		act.doubleClick(w).build().perform();
	}
	
	public void dragAndDropElement(WebElement w1, WebElement w2)
	{
		act.dragAndDrop(w1, w2).build().perform();
	}
	
	public void clickAndHoldElement(WebElement w)
	{
		act.clickAndHold(w).build().perform();
	}
	
	public void releaseElement(WebElement w)
	{
		act.release(w).build().perform();
	}
	
	public void moveToWebElement(WebElement w)
	{
		act.moveToElement(w).build().perform();
	}
	
/********************* Keyboard events ***********************/
	
}
