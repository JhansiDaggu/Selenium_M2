package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatorPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone");
		driver.findElement(By.className("_2iLD__")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
		;

}
