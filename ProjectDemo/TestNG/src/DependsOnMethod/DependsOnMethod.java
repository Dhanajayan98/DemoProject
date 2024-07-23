package DependsOnMethod;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test(priority = 1)
	public void openBrowser() {
		Reporter.log("Open Browser",true);
	}
	@Test(priority = 2,dependsOnMethods = "register")
	public void login() {
		Reporter.log("Login",true);
	}
	@Test(priority = 3)
	public void register() {
		Reporter.log("Register",true);
	}
}
