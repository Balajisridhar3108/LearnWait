package week5.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTextChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//h5[text()='Wait for Text Change']")).click();
		 WebElement findElement = driver.findElement(By.xpath("//button[text()='Click ME!']"));
		 findElement.click();
		 Alert alert = driver.switchTo().alert();
		 WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 webDriverWait.until(ExpectedConditions.alertIsPresent());
		 alert.accept();
		 String text = findElement.getText();
		 System.out.println(text);
		 

	}

}
