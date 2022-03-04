package tut05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/User/Desktop/Automation%20class/Assignment/Demo_form.html");
		WebElement w = driver.findElement(By.id("btn"));
		boolean d = w.isDisplayed();
		boolean e = w.isEnabled();
		if(d == true)
			System.out.println("Button displayed");
		else
			System.out.println("Button not displayed");
		
		if(e == true)
			System.out.println("Button enabled");
		else
			System.out.println("Button not enabled");
		
		String s = w.getAttribute("value");
		Thread.sleep(3000);
		System.out.println("Captured button value "+s);
		Thread.sleep(3000);
		w.click();
		
	}

}
