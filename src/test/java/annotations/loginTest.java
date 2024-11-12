package annotations;

import org.testng.annotations.Test;

public class loginTest extends BaseClassForLogin  {
	@Test
	public void LoginTest() {
	login.setEmail("admin");
	login.setPassword("admin");
	login.clickKeepMeLoggedin();
	login.clicklogin();
	}
	

}
