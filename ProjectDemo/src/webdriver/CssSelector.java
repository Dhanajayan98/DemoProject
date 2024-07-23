package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		WebElement textbox=driver.findElement(By.id("Email"));
		textbox.sendKeys("vijaykumar1998@gmail.com");
		WebElement textbox1=driver.findElement(By.id("Password"));
		textbox1.sendKeys("vijay1998");
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		Thread.sleep(8000);
		driver.close();
	}
}
