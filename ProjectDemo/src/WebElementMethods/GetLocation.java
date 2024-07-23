package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element=driver.findElement(By.id("small-searchterms"));
		Point point = element.getLocation();
		System.out.println(point.getX());	
		System.out.println(point.getY());	
		Thread.sleep(3000);
		driver.close();
	}		
}
  