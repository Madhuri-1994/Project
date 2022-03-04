package tut05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement w = driver.findElement(By.name("q"));
		boolean disp = w.isDisplayed();
		boolean en  = w.isEnabled();
		if(disp == true)
			System.out.println("TextBox is displayed");
		else
			System.out.println("TextBox is not displayed");
		
		if(en == true)
			System.out.println("TextBox is enabled");
		else
			System.out.println("TextBox is not enabled");
		
		w.sendKeys("Selenium methods");
		w.clear();
		w.sendKeys("Selenium");
		String s = w.getAttribute("value");
		System.out.println(s);
		driver.findElement(By.name("btnK")).click();
		

	}

}
