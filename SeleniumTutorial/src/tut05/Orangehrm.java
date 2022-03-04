package tut05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Automation class\\Selenium SetUp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Title of website\n"+driver.getTitle());
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("Chris");
		Thread.sleep(3000);
		driver.findElement(By.id("middleName")).sendKeys("John");
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys("Evans");
		Thread.sleep(3000);
		driver.findElement(By.id("employeeId")).sendKeys("123");
		
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.id("btnSave")).click();//edit
		Thread.sleep(2000);
		driver.findElement(By.id("personal_txtLicenNo")).sendKeys("0000112");
		Thread.sleep(2000);
		driver.findElement(By.id("personal_txtNICNo")).sendKeys("432111");
		Thread.sleep(2000);
		driver.findElement(By.id("personal_optGender_1")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("personal[txtEmpNickName]")).sendKeys("Captain");
		Thread.sleep(2000);
		driver.findElement(By.name("personal[chkSmokeFlag]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("personal[txtMilitarySer]")).sendKeys("No");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();//save		
		/*
		String fn = driver.findElement(By.id("firstName")).getAttribute("value");
		String ls = driver.findElement(By.id("lastName")).getAttribute("value");
		String id = driver.findElement(By.id("employeeId")).getAttribute("value");
		String gender = driver.findElement(By.id("personal_optGender_1")).getAttribute("value");
		 
		
		//Display details
		System.out.println("First Name: "+fn);
		System.out.println("Last Name : "+ls);
		System.out.println("Emp id    : "+id);
		System.out.println("Gender    : "+gender);
*/
		driver.findElement(By.id("welcome")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[9]/ul/li[3]/a")).click();
	}

}
