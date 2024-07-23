package Assignment;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDemo {
	public static void main(String[] args)throws InterruptedException, Throwable  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("vijaykumar1998@gmail.com");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("vijay1998",Keys.TAB,Keys.SPACE);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		Robot robo=new Robot();
		
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/logout']")).click();  
		Thread.sleep(3000);
		driver.close();
	}
}