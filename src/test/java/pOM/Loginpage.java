package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

		//Declaration
		@FindBy(name="email")
		private WebElement emailTF;
		
		@FindBy(id="password")
		private WebElement passwordTF;
		
		@FindBy(css="[type='checkbox']")
		private WebElement keepMeloggedIncheckBox;
		
		@FindBy (className ="login_Btn")
         private WebElement loginBTN;
		
		//Initialization
		public Loginpage (WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//Utilization
		public void setEmail(String email) {
			emailTF.sendKeys(email);
		}
		
		public void setPassword(String pwd) {
			passwordTF.sendKeys(pwd);
		}
		public void clickKeepMeLoggedin() {
			keepMeloggedIncheckBox.click();
		}
		
			
//		public  void  clickforgotpwd() 
			//forgotpwdLINK.click();
		
						
		public void clicklogin() {
			loginBTN.click();			
		}

}
