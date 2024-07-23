package Dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByDropdown {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement monthDropdown = driver.findElement(By.name("Month"));
		Select sel=new Select(monthDropdown);
		
		sel.selectByIndex(3);
		sel.selectByValue("Nov");
		sel.selectByVisibleText("October");
		
		sel.deselectAll();
	//	sel.deselectByIndex(11);
	//	sel.deselectByValue("Ma");
	//	sel.deselectByVisibleText("October");
		Thread.sleep(3000);
		driver.close();
	}		
}
