package DRopdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetsions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.findElement(By.name("q")).sendKeys("jhansi");
		List<WebElement> list=driver.findElements(By.xpath("//li[contains(.,'jhansi')]"));		
		for (WebElement e : list) {
			System.out.println(e.getText());			
	}
		 list.get(3).submit();
		 Thread.sleep(2000);
		 driver.quit();
		 

	}

}
