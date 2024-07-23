package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
		driver.close();
	}
}
