package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("abcd22@gmail.com");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("abcd143");
		driver.findElement(By.cssSelector("button[value='1']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}

}
