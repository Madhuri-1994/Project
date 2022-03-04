package tut07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageOperations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/Automation%20class/Assignment/Demo.html");
		WebElement img = driver.findElement(By.id("loginimg"));
		boolean display = img.isDisplayed();
		boolean enable  = img.isEnabled();
		img.click();
		String s = img.getAttribute("id");
		System.out.println(s);

	}

}
