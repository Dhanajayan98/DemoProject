package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDynamic {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String price = driver.findElement(By.xpath("//a[text()=('14.1-inch Laptop')]/../../div[3]/div[1]/span")).getText();
		System.out.println(price);
		Thread.sleep(3000);
		driver.close();		
	}
}
