package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTheDisabled {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		WebElement textbox = driver.findElement(By.xpath("//input[@class='form-control']"));
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='vijay1998@gmail.com ';",textbox);
		
		Thread.sleep(3000);
		driver.close();
	}
}
