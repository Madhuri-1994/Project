package tut12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassFrame {
	public static WebDriver driver;
	public static void initialization() {	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	}
}
