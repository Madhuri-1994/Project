package tut03;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinMax {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Dimension p = new Dimension(400, 600);
		driver.manage().window().setSize(p);
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.close();
	}

}
