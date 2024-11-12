package pOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Loginpage login = new Loginpage(driver);
		login.setEmail("admin");
		login.setPassword("admin");
		login.clickKeepMeLoggedin();
		login.clicklogin();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
