package crossBrowserParallel;

import org.testng.annotations.Test;

public class Test1 extends Baseclass{
	@Test
	public void google() {
		driver.get("https://www.google.com/");
	}

}
