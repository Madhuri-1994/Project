package tut11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement w = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a = new Actions(driver);
		a.contextClick(w).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Alert at = driver.switchTo().alert();
		System.out.println(at.getText());
		at.accept();
		
	}

}
