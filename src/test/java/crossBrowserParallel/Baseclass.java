package crossBrowserParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass {
	WebDriver driver;

	@Parameters("BROWSER")
	@BeforeClass
	public void classSetup(String browser) {
		switch(browser) {
		case "chrome":
		driver=new ChromeDriver();
		break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
			default:
				System.out.println("Invalid browser");
		}
	}
	
	@AfterClass
	public void classTearDown() {
		driver.quit();
		
	}
		

}
