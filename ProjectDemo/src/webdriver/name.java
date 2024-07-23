package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {
	public static void main(String[] args) throws InterruptedException{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement textbox=driver.findElement(By.name("q"));
	textbox.sendKeys("Mobiles");
	Thread.sleep(5000);
	driver.quit();
	}
}


