package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicxpathPracisce2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.className("_2iLD__")).click();
		Thread.sleep(3000);
		int sum=0;
		for(;;) {
			Thread.sleep(3000);
			List<WebElement> list = driver.findElements(By.className("KzDlHZ"));
			sum = sum + list.size();
			try {
				driver.findElement(By.xpath("//span[text()='Next']"));
			}catch (Exception e) {
				break;
			}
		}
		Thread.sleep(3000);
		String header =driver.findElement(By.className("BUOuZu")).getText();
		String[] str = header.split("");
		int actualNumber = Integer.parseInt(str[5]);
		
		if(sum == actualNumber)
			System.out.println("no of products mathed");
		else
		System.out.println("not matched");
		
		driver.quit();
			
		}
		
	}

