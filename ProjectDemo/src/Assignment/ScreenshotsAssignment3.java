package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotsAssignment3 {
	public static void main(String[] args)throws InterruptedException, IOException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://play.google.com/store/apps/details?id=com.netmarble.sololv&hl=en&pli=1");
	//	Save the WebElement
		WebElement Sololevelinglogo = driver.findElement(By.xpath("//div[@class='qxNhq']"));		
	    File screenshot = Sololevelinglogo.getScreenshotAs(OutputType.FILE);
		File path=new File("./Screenshots/Solologo.png");
		FileHandler.copy(screenshot, path);
		
		Thread.sleep(2000);	
		driver.close();
	}
} 
