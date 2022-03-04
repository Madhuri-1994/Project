package TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;

public class JavaScriptPograms extends BaseClass{
	
	@Test
	public void openfb()
	{
		BaseClass.initialization();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		
		js.executeScript("arguments[0].value = 'Madhuri';", firstname);
		js.executeScript("arguments[0].value = 'Sathe';", lastname);
		
		String color = "red";
		WebElement button = driver.findElement(By.name("websubmit"));
		String actualColor = button.getCssValue("background-color");
		System.out.println(actualColor);
		
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", button);
	}

}
