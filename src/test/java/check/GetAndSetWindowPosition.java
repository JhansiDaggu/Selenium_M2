package check;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndSetWindowPosition {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		Point actpoint = driver.manage().window().getPosition();
		System.out.println(actpoint);
		Thread.sleep(2000);
		Point reqpoint = new Point(650,420);
		driver.manage().window().setPosition(reqpoint);
		Thread.sleep(2000);
		driver.close();
	}

}
