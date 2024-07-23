package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask1 {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Build your own expensive computer']/../../div[3]/div[2]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='add-to-cart-panel']/input[2]")).click();
		
		Thread.sleep(3000);
		driver.close();
	}
}
