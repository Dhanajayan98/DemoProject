package TestScripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Price {
	@Test
	public void AdddtoCart() throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.name("Email")).sendKeys("vijaykumar1998@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("vijay1998");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		driver.findElement(By.xpath("//div[@class='product-item']/../../div[5]/div[1]/div[2]/h2[1]/a")).click();
		driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='header-links-wrapper']/../div[2]/div[1]/ul[1]/li[3]/a[1]/span[1]")).click();		
		robo.keyPress(KeyEvent.VK_PAGE_UP);
		robo.keyRelease(KeyEvent.VK_PAGE_UP);

		String price = driver.findElement(By.xpath("//div[@class='total-info']/../../div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/span")).getText();
		Reporter.log(price);
		Reporter.log("Price is a displayed",true);
		Thread.sleep(3000);
		driver.close();
	}
}