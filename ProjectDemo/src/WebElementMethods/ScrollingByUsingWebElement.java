package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingByUsingWebElement {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement products = driver.findElement(By.xpath("//strong[text()='Featured products']"));
		Thread.sleep(2000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",products);
		
		Thread.sleep(4000);
		driver.close();
	}
}
