package check;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceClose {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.close();

	}

}
