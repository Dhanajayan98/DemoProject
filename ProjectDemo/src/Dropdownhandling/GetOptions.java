package Dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement monthDropdown = driver.findElement(By.name("Month"));
		Select sel=new Select(monthDropdown);

		List<WebElement> getOptions = sel.getOptions();
		for(WebElement opt:getOptions) {
			System.out.println(opt.getText());
		}
		Thread.sleep(3000);
		driver.close();
	}
}