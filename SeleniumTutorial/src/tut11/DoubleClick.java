package tut11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\User\\Desktop\\Automation class\\Assignment\\Doubleclick.html");
		WebElement wb =driver.findElement(By.id("demo"));
		
		Actions act =new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(wb).build().perform();
		
		String b =driver.findElement(By.id("demo")).getText();
		System.out.println(b);
		
	}

}
