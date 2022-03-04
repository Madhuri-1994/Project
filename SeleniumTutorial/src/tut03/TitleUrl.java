package tut03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		if(actualTitle.equals(expectedTitle)) 
			System.out.println("Test case pass");
		else
			System.out.println("Test case failed");
		
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.contains("orange"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case failed");

	}

}
