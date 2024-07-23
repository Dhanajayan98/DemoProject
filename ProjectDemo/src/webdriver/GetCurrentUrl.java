package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
}
