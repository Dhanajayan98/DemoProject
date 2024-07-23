package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");		
		WebElement size=driver.findElement(By.id("small-searchterms"));
		Dimension element = size.getSize();
		System.out.println(element.getHeight());
		System.out.println(element.getWidth());
		Thread.sleep(3000);
		driver.close();
	}
}
