package DummyPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DummyClass {
	@Test
	public void DummyPackage() {
		Reporter.log("Dummy Execution", true);
	}
}
