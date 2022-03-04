package tut11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends BaseClassDrag{
	public DragAndDrop (WebDriver driver){
			this.driver = driver;
	}
	
	public void matchTheCapitals() throws InterruptedException {
		System.out.println("In method");
		WebElement cap[] 	= new WebElement[7];
		WebElement country[]= new WebElement[7];
		Actions act = new Actions(driver);
		for (int i=0; i<7; i++){
			System.out.println("box"+(i+1));
			cap[i]		= driver.findElement(By.id("box"+(i+1)));
			country[i]	= driver.findElement(By.id("box10"+(i+1)));
			Thread.sleep(2000);
			act.dragAndDrop(cap[i], country[i]).build().perform();
		}
	}
	
	public void takeScreenShot() throws IOException{
		TakesScreenshot sc = (TakesScreenshot)driver;
		File f  = sc.getScreenshotAs(OutputType.FILE);
		File f1 = new File("C:\\Users\\User\\Desktop\\Automation class\\SeleniumTutorial\\src\\tut11\\MatchCapitals.png");
		FileUtils.copyFile(f, f1);
		System.out.println("Took a screenshot...");
	}
			

}
