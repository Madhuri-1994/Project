package tut04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/User/Desktop/Automation%20class/Assignment/Demo_form.html");
		WebElement w = driver.findElement(By.id("fname"));
		boolean fname_displayed = w.isDisplayed();
		boolean fname_enabled = w.isEnabled();
		System.out.println("First Name text box display status : "+fname_displayed);
		System.out.println("First Name text box enabled status : "+fname_enabled);
		
		boolean rbtn_check = driver.findElement(By.id("javascript")).isSelected();
		System.out.println("The radio button selection status "+rbtn_check);
		
	}

}

