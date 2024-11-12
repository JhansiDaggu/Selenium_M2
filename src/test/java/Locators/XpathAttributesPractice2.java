package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAttributesPractice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/hyderabad");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("img[@alt='Top Trending Spots']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("img[alt='Broadway']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Direction']")).click();
		Thread.sleep(3000);
		
		//WebElement deliveryCharges = driver.findElement(By.xpath("//div[@class='sc-aXZVg fVWuLc']"));
		//System.out.println(deliveryCharges.getText());
		//Thread.sleep(3000);
		driver.quit();
	}

}
