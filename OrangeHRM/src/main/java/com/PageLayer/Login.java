package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class Login extends BaseClass{
	 
	//@FindBy(id="txtUsername")
	private WebElement username = driver.findElement(By.id("txtUsername"));
	
	//@FindBy(id="txtPassword")
	private WebElement password = driver.findElement(By.id("txtPassword"));
	
	//@FindBy(id="btnLogin")
	private WebElement button = driver.findElement(By.id("btnLogin"));
	
	//Initialise the By elements
/*	public Login()
	{ 
		PageFactory.initElements(driver, this);
	}
*/
	/*********** username **************/
	public boolean usernameDisplayStatus()
	{
		return username.isDisplayed();
	}

	public boolean usernameEnableStatus()
	{
		return username.isEnabled();
	}
	
	public void enterUsername(String user)
	{
		username.sendKeys(user);
	}

	public void clearUsername()
	{
		username.clear();
	}

	public String getUsername()
	{
		return username.getAttribute("value");
	}
		
	/********** password ***************/
	public boolean passwordDisplayStatus()
	{
		return password.isDisplayed();
	}
	
	public boolean passwordEnableStatus()
	{
		return password.isEnabled();
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys("admin123");
	}
	
	public void clearPassword()
	{
		password.clear();
	}

	public String getPassword()
	{
		return password.getAttribute("value");
	}

	/********* login button *************/
	public boolean loginButtonDisplayStatus()
	{
		return button.isDisplayed();
	}
		
	public boolean loginButtonEnableStatus()
	{
		return button.isEnabled();
	}
	
	public String getButtonValue()
	{
		return button.getAttribute("value");
	}
	
	public void clickOnLogin()
	{
		button.click();
	}
	
}
