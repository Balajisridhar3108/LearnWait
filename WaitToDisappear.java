package week5.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitToDisappear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//h5[text()='Wait to Disappear']")).click();
		WebElement findElement = driver.findElement(By.id("btn"));
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driverWait.until(ExpectedConditions.invisibilityOf(findElement));
	    boolean displayed = findElement.isDisplayed();
		System.out.println(displayed);
		
		

	}

}
