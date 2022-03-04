package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath = "//div[@id='branding']/a/img")
	private WebElement logo;
/*
	@FindBy( = )
	private WebElement 

	@FindBy( = )
	private WebElement 

	@FindBy( = )
	private WebElement 

	@FindBy( = )
	private WebElement 
	*/
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
}
