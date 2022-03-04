package tut04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/Automation%20class/Assignment/Demo.html");
		WebElement w = driver.findElement(By.linkText("OrangeHRM"));
		boolean d = w.isDisplayed();
		boolean e = w.isEnabled();
		boolean s = w.isSelected();
		System.out.println("Link Display status  : "+d);
		System.out.println("Link Enable status   : "+e);
		System.out.println("Link Selected status : "+s);
		Thread.sleep(3000);
		w.click();
		Thread.sleep(6000);
//		boolean s1 = w.isSelected();
//		System.out.println("Link Selected status : "+s1);
		
		driver.close();
	}

}
