package tut13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FacebookKeys {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	WebElement wb = driver.findElement(By.name("email"));
	
	Actions act = new Actions(driver);
	act.click(wb).keyDown(Keys.SHIFT).sendKeys("Selenium Testing").build().perform();
	}
}
