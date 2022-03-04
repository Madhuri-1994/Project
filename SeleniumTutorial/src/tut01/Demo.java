package tut01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		//connect webdriver to actual browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver97\\chromedriver.exe");
		
		//Upcasting Parent reference and Child object
		WebDriver driver = new ChromeDriver();
		//open particular 
		driver.get("https://www.w3schools.com/");
		
		
	}

}
