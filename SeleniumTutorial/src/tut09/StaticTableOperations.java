package tut09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableOperations {
	public static WebDriver driver;
	
	//returns string array of table elements of tagname mentioned in parameters
	public static String[] getList(String elementType)
	{
		List<WebElement> list = driver.findElements(By.tagName(elementType));
		String  ele = ""; 
		String elements[] = {};
		
		//append to string
		for(WebElement w : list) {	
				ele = ele + " " +w.getText();
		}	
		//print list size
		System.out.println("Total elements: "+list.size());
		
		//split string into array and return to main()
		elements = ele.split(" ");
		return elements;
	}
	//checks for test cases
	public static void checkTest(String arr[], String str) {
		for (String s : arr)
		{
			if(s.equals(str))
			{
				System.out.println("Test case passed");
				break;
			}
		}
		

	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/Automation%20class/Assignment/static_table.html");
		
		boolean display = driver.findElement(By.id("table")).isDisplayed();
		System.out.println("Display Status: "+display);
		
		String elements [] = StaticTableOperations.getList("td");
		StaticTableOperations.checkTest(elements, "Devyani");
		
		String rows [] = StaticTableOperations.getList("tr");
		StaticTableOperations.checkTest(rows, "Austria");
		
		String columns [] = StaticTableOperations.getList("th");
		StaticTableOperations.checkTest(columns, "Phone");
		
		
	}

}
