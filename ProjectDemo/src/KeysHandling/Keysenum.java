package KeysHandling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keysenum {
	public static void main(String[] args)throws InterruptedException, IOException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("vijaykumar1998@gmail.com",Keys.TAB,"vijay1998",Keys.TAB,Keys.SPACE,Keys.TAB,Keys.TAB,Keys.ENTER);		
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
