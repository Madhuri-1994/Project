package tut14;
import java.util.*;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver97\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\User\\Desktop\\Automation class\\Assignment\\Demo.html");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.linkText("OrangeHRM")).click();
		driver.findElement(By.linkText("Google")).click();
		Set<String> windows =  driver.getWindowHandles();
		ArrayList<String> arr  = new ArrayList<String>(windows);
		System.out.println(arr.size());
		
		driver.switchTo().window(arr.get(2));
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name = 'Submit']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(arr.get(0));
		driver.findElement(By.id("fname")).sendKeys("Madhuri");
		Thread.sleep(3000);
		
		driver.switchTo().window(arr.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(arr.get(0));
		driver.findElement(By.id("lname")).sendKeys("Sathe");
	}

}
