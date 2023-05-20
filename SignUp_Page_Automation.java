package basicPurpose;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpPageAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nexchar.com");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign up now")).click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,150)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("Test");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@id='CategoryId']")).click();
		Thread.sleep(2000);
		
		Set<String> handels = driver.getWindowHandles();
		
		for (String ami : handels) {
		
		driver.switchTo().window(ami);
		driver.findElement(By.xpath("//option[@value='4']")).click();
		Thread.sleep(2000);
		
		}
		
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("test@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Test#123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@for='Password']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary w-100']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@class='navbar-brand-image']")).click();
		
		
	}

}
