package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentXpath1 {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");		
		driver.findElement(By.xpath("//a[@class='ico-login' and text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("vijaykumar1996@gmail.com");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("vijay1996");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//ul[@class='top-menu']/descendant::a[1]")).click();
		driver.findElement(By.xpath("//a[text()='Health Book']/../../div[3]/div[2]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='cart-label' and text()='Shopping cart']")).click();
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("//span[@class='nobr' and text()='Sub-Total:']/../../td[2]/span[1]/span")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
