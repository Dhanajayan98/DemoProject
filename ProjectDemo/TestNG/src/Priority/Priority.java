package Priority;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority = -3)
	public void openBrowser() {
		Reporter.log("Open Browser",true);
	}
	@Test
	public void login() {
		Reporter.log("Login",true);
	}
	@Test(priority = 2)
	public void register() {
		Reporter.log("Register",true);
	}
}
