package tut05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement w = driver.findElement(By.linkText("Gmail"));
		boolean display = w.isDisplayed();
		boolean enable = w.isEnabled();
		String linkname = w.getText();
		if(display == true)
			System.out.println("Link is displayed on webpage");
		else
			System.out.println("Link is not displayed on webpage");
		
		if(enable == true)
			System.out.println("Link is enabled");
		else
			System.out.println("Link is not enabled");
		
		System.out.println("Text on link"+linkname);
		w.click();
	}

}
