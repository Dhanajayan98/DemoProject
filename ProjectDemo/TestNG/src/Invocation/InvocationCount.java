package Invocation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	@Test
	public void openBrowser() {
		Reporter.log("Open Browser",true);
	}
	@Test
	public void login() {
		Reporter.log("Login",true);
	}
	@Test(invocationCount = 15)
	public void register() {
		Reporter.log("Register",true);
	}
}
