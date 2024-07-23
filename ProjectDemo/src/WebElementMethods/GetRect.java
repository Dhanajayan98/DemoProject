package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Rectangle rect = driver.findElement(By.id("small-searchterms")).getRect();
		System.out.println(rect.getX());	
		System.out.println(rect.getY());	
		System.out.println(rect.getHeight());	
		System.out.println(rect.getWidth());	
		Thread.sleep(3000);
		driver.close();
	}
}
