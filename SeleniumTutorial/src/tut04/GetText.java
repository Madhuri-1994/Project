package tut04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Admin");
		driver.findElement(By.id("pass")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		String alert = driver.findElement(By.className("_9ay7")).getText();
		System.out.println("Alert received:  "+alert);

		
	}

}
