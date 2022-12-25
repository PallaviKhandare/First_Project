package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Pages.LoginPage;
import Com.Utility.Base_Class;

public class Test_1 extends Base_Class {

	//test case steps
	
	@Test
	public void verify_loginpage() {
		
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		login.getTxt_email().sendKeys("Test@gmail.com");
		login.getTxt_pass().sendKeys("12345678");
		login.getLogin_button().click();
	}
}
