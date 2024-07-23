package Dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement countryDropdown = driver.findElement(By.name("country"));
		Select sel=new Select(countryDropdown);
		System.out.println(sel.isMultiple());
		Thread.sleep(2000);
		
		WebElement monthDropdown = driver.findElement(By.name("Month"));
		Select sel1=new Select(monthDropdown);
		System.out.println(sel1.isMultiple());

		Thread.sleep(3000);
		driver.close();
	}
}
