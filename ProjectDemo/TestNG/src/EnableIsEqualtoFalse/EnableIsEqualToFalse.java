package EnableIsEqualtoFalse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableIsEqualToFalse {
	@Test
	public void openBrowser() {
		Reporter.log("Open Browser",true);
	}
	@Test
	public void login() {
		Reporter.log("Login",true);
	}
	@Test(enabled = false)
	public void register() {
		Reporter.log("Register",true);
	}
}
