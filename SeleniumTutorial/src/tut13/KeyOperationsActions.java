package tut13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyOperationsActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	}

}
