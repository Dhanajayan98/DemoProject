package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTask {
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		WebElement textbox=driver.findElement(By.id("FirstName"));
		textbox.sendKeys("Vijay");
		WebElement textbox1=driver.findElement(By.id("LastName"));
		textbox1.sendKeys("Kumar");
		WebElement textbox2=driver.findElement(By.id("Email"));
		textbox2.sendKeys("vijaykumar1998@gmail.com");
		WebElement textbox3=driver.findElement(By.id("Password"));
		textbox3.sendKeys("vijay1998");		
		WebElement textbox4=driver.findElement(By.id("ConfirmPassword"));
		textbox4.sendKeys("vijay1998");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(8000);
		driver.close();		
	}
}
