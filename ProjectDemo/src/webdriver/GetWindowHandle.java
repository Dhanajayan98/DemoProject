package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/camera-photo");
	String source=driver.getWindowHandle();
	System.out.println(source);
	driver.quit();
	}
}