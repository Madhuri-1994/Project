 package tut10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableOperations {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		String monthyear = "Jun 2022";
		driver.findElement(By.id("onward_cal")).click();
		while(true)
		{
			String a = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			if(a.equals(monthyear))
			{
				System.out.println(a);
				break;
			}
			else
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
		}
		
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td[text()='29']")).click();
	}

}
