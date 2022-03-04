package POMWithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DynamicTable extends BaseClass{
//	By data = By.id("onward_cal");
//	By monthyear = By.xpath("//td[@class='monthTitle']");
//	By next = By.xpath("//td[@class='next']");
	WebElement data1 = driver.findElement(By.id("onward_cal"));
	WebElement monthyear1 = driver.findElement(By.xpath("//td[@class='monthTitle']"));
	WebElement next1 = driver.findElement(By.xpath("//button[text() = '>']"));
	/*
	public DynamicTable(WebDriver driver)
	{
		this.driver = driver;
	}*/
	
	public  void clickOnCalender()
	{
		data1.click();;
	}
	public String getCurrentMonthYear()
	{
		return monthyear1.getText();
	}
	public void clickNext()
	{
		next1.click();
	}
	public void selectDate(String day)
	{
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td[text()='"+day+"']")).click();
	}
}


