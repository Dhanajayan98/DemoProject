package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByFollowingSibling {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//span[@role='status']/following-sibling::input[1]")).sendKeys("Mobiles");
		Thread.sleep(3000);
		driver.close();
		
	}
}
