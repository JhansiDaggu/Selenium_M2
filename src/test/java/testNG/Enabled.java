package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test(enabled=false)
	public void demo1() {
		Reporter.log("demo1",true);
	}
	@Test(invocationCount=-2)
	public void demo2() {
		Reporter.log("demo2",true);
	}
	@Test(invocationCount=0)
	public void demo3() {
		Reporter.log("demo3",true);
	}
}
