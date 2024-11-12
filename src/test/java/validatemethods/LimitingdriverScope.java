package validatemethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingdriverScope {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement footer = driver.findElement(By.id("pageFooter"));
		Thread.sleep(2000);
		List<WebElement> links = footer.findElements(By.tagName("a"));//after login button we see languages and so many links 
		for (WebElement link : links) {
			System.out.println(link.getText());
			
		}
		driver.quit();
	}

}
