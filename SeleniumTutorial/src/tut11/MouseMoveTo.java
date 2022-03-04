package tut11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoveTo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement w = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a = new Actions(driver);
		a.moveToElement(w).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("nav_prefetch_yourorders")).click();
	}

}
