package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDynamic2 {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("Iphone 13 Pro Max");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();		
		String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 13 Pro Max (Alpine Green, 1 TB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(price);
		Thread.sleep(3000);
		driver.close();

	}
}
