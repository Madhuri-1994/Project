package tut05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public void display (WebElement w[]) {
		
		for(WebElement i:w) {
			if(i.isDisplayed() == true)
				System.out.println(i.getAttribute("value")+" is displayed");
			else
				System.out.println(i.getAttribute("value")+" is not displayed");
		}
	}

	public void enable (WebElement w[]) {
		
		for(WebElement i:w) {
			if(i.isEnabled() == true)
				System.out.println(i.getAttribute("value")+" is Enabled");
			else
				System.out.println(i.getAttribute("value")+" is not Enabled");
		}
	}

	public void select (WebElement w[]) {
		
		for(WebElement i:w) {
			if(i.isSelected() == true)
				System.out.println(i.getAttribute("value")+" is Selected");
			else
				System.out.println(i.getAttribute("value")+" is not Selected");
		}
	}

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/User/Desktop/Automation%20class/Assignment/Demo_form.html");
		WebElement w1 = driver.findElement(By.id("html"));
		WebElement w2 = driver.findElement(By.id("css"));
		WebElement w3 = driver.findElement(By.id("javascript"));
		Radio obj = new Radio();
		WebElement []w = {w1, w2, w3};
		
		obj.display(w);
		
		obj.enable(w);
		
		obj.select(w);
		w1.click();
		obj.select(w);	}

}
