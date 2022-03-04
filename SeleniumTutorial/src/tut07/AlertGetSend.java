package tut07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertGetSend {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/Automation%20class/Assignment/AlertPromt.html");
		driver.findElement(By.id("btn")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(3000);
		a.sendKeys("abc");
		Thread.sleep(2000);
		a.accept();
		
		

	}

}
