package assertions;

import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
	public void demo() {
		String s1="Hello";
		String s2="Hi";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(s1, s2);
		
		System.out.println(s1);
		System.out.println(s2);
		soft.assertAll();
		
	}

}
