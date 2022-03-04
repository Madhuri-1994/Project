package tut10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableWithMethod {
	
	public static WebDriver driver;
	public static void SelectDate(String monthyear, String day) throws InterruptedException
	{
		
		while(true)
		{
			String a = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			if(a.equals(monthyear))
			{
				System.out.print("\n"+a+" ");
				break;
			}
			else
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}

		}
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td[text()='"+day+"']")).click();
		
		System.out.print(day);
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		DynamicTableWithMethod.SelectDate("May 2022", "4");
	}

}
