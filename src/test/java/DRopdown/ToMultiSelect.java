package DRopdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/k ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement course = driver.findElement(By.id("cars"));
		Select s=new Select(course);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("99");
		s.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		Thread.sleep(2000);
		System.out.println("**************************************");
		
		List<WebElement> list = s.getOptions();
		 for(WebElement e :list) {
			 System.out.println(e.getText());				 
			 }
			 System.out.println("*****************************");
			 if(s.isMultiple()) {
				 System.out.println("Multi Select");
				 System.out.println("First Selected Option:"+s.getFirstSelectedOption().getText());
				 List<WebElement> selectedOptions = s.getAllSelectedOptions();
				 for(WebElement opt :selectedOptions) {
					System.out.println(opt.getText());
					
					
					s.deselectByIndex(0);
					Thread.sleep(2000);
					s.deselectByValue("99");
					s.deselectByVisibleText("INR 100 -INR 199 ( 16 ) ");
				 }
				 
				 {
					 System.out.println("single select");
				 }
					
				driver.quit();	 
				 }
			 }
			
				
				
	}


