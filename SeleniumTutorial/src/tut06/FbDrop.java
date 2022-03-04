package tut06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDrop {

	public static void Dropdown(WebElement w, String s)
	{
		Select sel = new Select(w);
		sel.selectByVisibleText(s);
		WebElement text = sel.getFirstSelectedOption();
		System.out.println("Selected option "+text.getText());
		
		List<WebElement> l = sel.getOptions();
		System.out.println("Size of list"+l.size());
		for(WebElement i : l) {
			System.out.println(""+i.getText());
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// 2 April 1993
		driver.get("https://www.facebook.com/reg");
		
		//Fill up name
		driver.findElement(By.name("firstname")).sendKeys("Madhuri");
		
		//Fill Surname
		driver.findElement(By.name("lastname")).sendKeys("Sathe");
		
		driver.findElement(By.name("reg_email__")).sendKeys("madhu@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("madhu18");
		

		//fillTextBox("", "8149901929");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		FbDrop.Dropdown(day, "18");
		FbDrop.Dropdown(month, "May");
		FbDrop.Dropdown(year, "1994");
		
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("madhu@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String color = driver.findElement(By.name("websubmit")).getCssValue("background-color");
		System.out.println(color);
	}

}
