package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("Computers");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		//Thread.sleep(3000);
		driver.close();
	}		
}
