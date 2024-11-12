package annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pOM.Loginpage;

public class BaseClassForLogin {
	protected WebDriver driver;
	protected Loginpage login;
	
	@BeforeClass
	public void classSetup() {
		driver=new ChromeDriver();
		
		driver.manage().window(). maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		
		@BeforeMethod
		public void Methodsetup() {
			driver.get("https://demoapp.skillrary.com/login.php?type=login");
			login=new Loginpage(driver);
		}
			
			@AfterMethod
			public void methodteardown() {
				System.out.println("AfterMethod");
				
			}
			@AfterClass
			public void classteardown() {
				driver.quit();
			}
			
		
				
			
			
		
		
	}


