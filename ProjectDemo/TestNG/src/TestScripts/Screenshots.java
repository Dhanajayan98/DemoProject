package TestScripts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshots {
	@Test
	public void AdddtoCart() throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://play.google.com/store/apps/details?id=com.netmarble.sololv&hl=en&pli=1");
		WebElement Sololevelinglogo = driver.findElement(By.xpath("//div[@class='qxNhq']"));		
	    File screenshot = Sololevelinglogo.getScreenshotAs(OutputType.FILE);
		File path=new File("./Screenshots/Solologo.png");
		FileHandler.copy(screenshot, path);
		
		Thread.sleep(3000);	 
		driver.close();		
	}
}
