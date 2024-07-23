package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login' and text()='Log in']")).click();
		String title = driver.getTitle();
		if(title.contains("Login")) {
			System.out.println("login page is displayed");
		}
		else {
			System.out.println("login page is not displayed");
		}
		Thread.sleep(3000);
		driver.close();
	}
}
