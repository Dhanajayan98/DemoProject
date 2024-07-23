package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		WebElement gender= driver.findElement(By.id("gender-male"));		
		System.out.println(gender.isSelected());
		gender.click();	
		System.out.println(gender.isSelected());
		Thread.sleep(3000);
		driver.close();
	}
}
