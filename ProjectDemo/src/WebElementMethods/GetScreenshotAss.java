package WebElementMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetScreenshotAss {
	public static void main(String[] args)throws InterruptedException, IOException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	//	Save the WebElement
		WebElement demologo = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));		
	    File screenshot = demologo.getScreenshotAs(OutputType.FILE);
		File path=new File("./Screenshots/demologo.png");
		FileHandler.copy(screenshot, path);
	//	Thread.sleep(2000);
		driver.quit();
	}
}
