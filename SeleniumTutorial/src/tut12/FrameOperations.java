package tut12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameOperations extends BaseClassFrame {

	FrameOperations(WebDriver driver) {
		this.driver = driver;
	}

	public void switchMain() {
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Window");
	}

	// switch to frame 3 by using web element
	public void switchToRight() throws InterruptedException {
		switchMain();
		WebElement wb = driver.findElement(By.name("classFrame"));
		driver.switchTo().frame(wb);
		Thread.sleep(2000);
		driver.findElement(By.linkText("org.openqa.selenium.concurrent")).click();
		System.out.println("Right Frame");
		switchMain();
	}

	public void switchLeftBottom() throws InterruptedException {
		switchMain();
		// switch to frame 2 by using frame index.
		driver.switchTo().frame(1);// PackageFrame
		driver.findElement(By.linkText("ActiveSession")).click();
		Thread.sleep(2000);
		System.out.println("BottomLeft");
		//switchMain();
	}

	public void switchToTopLeft() throws InterruptedException {
		switchMain();
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
		Thread.sleep(2000);
		System.out.println("TopLeft");
		switchMain();
	}

}
