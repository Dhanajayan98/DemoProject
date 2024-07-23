package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddtoCart {
	@Test
	public void AdddtoCart() throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.name("Email")).sendKeys("vijaykumar1998@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("vijay1998");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
		driver.findElement(By.xpath("//div[@class='product-item']/../../div[5]/div[1]/div[2]/h2[1]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
		Reporter.log("AddtoCart is displayed",true);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
