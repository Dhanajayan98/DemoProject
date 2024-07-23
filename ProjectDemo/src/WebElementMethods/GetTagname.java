package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagname {
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");		
		String tagname = driver.findElement(By.xpath("//a[contains(@href,'/register')]")).getTagName();
		System.out.println(tagname);
		Thread.sleep(3000);
		driver.close();
	}
}
