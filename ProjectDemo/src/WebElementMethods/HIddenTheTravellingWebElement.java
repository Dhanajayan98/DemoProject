package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HIddenTheTravellingWebElement {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement elementDisplay = driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
		WebElement hidebtn = driver.findElement(By.id("hide-textbox"));
		WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		WebElement showbtn = driver.findElement(By.id("show-textbox"));
		Thread.sleep(2000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", elementDisplay);
		
		Thread.sleep(3000);
		
		jse.executeScript("arguments[0].click();",hidebtn);
		
		Thread.sleep(3000);
		jse.executeScript("arguments[0].value='Hello Manoj';",textbox);
		
		Thread.sleep(3000);
		jse.executeScript("arguments[0].click();",showbtn);
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
