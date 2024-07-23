package HeadlessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {
	public static void main(String[] args)throws InterruptedException  {
		ChromeOptions opts=new ChromeOptions();
		opts.addArguments("headless");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
	}	
}
