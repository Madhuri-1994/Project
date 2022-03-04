package tut07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAcceptDismiss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/Automation%20class/Assignment/Alert.html");
		WebElement w = driver.findElement(By.id("btn"));
		w.click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		String a1 = a.getText();
		System.out.println(a1);
		Thread.sleep(3000);
		
		if(a1.contains("button"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case failed");
		
		Thread.sleep(3000);
		a.accept();
		
		w.click();
		Thread.sleep(3000);
		a.dismiss();
		

				
	}

}
