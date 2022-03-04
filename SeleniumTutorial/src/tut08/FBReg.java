package tut08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBReg {
	public static void Dropdown (WebElement w, String str) {
		
		Select s = new Select(w);
		s.selectByVisibleText(str);
		WebElement selected = s.getFirstSelectedOption();
		System.out.println("Selected value "+selected.getText());
	}
		
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/reg");
		
		//get title
		System.out.println("Page title: "+driver.getTitle());
		
		//get page url
		System.out.println("Page URL: "+driver.getCurrentUrl());
		
		driver.findElement(By.name("firstname")).sendKeys("Madhuri");
		driver.findElement(By.name("lastname")).sendKeys("Sathe");
		driver.findElement(By.name("reg_email__")).sendKeys("madhuri@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("madhuri");
		
		WebElement date = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		FBReg.Dropdown(date, "23");
		FBReg.Dropdown(month,"Apr");
		FBReg.Dropdown(year, "2014");		
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("madhuri@gmail.com");
		driver.findElement(By.xpath("input[@type='submit")).click();
		
		
		
		
		
	}

}
