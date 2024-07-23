package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentScreenshot {
	public static void main(String[] args)throws InterruptedException, IOException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	//	Save the WebElement
		WebElement instalogo = driver.findElement(By.xpath("//i[@data-visualcompletion='css-img']"));		
	    File screenshot = instalogo.getScreenshotAs(OutputType.FILE);
		File path=new File("./Screenshots/instalogo.png");
		FileHandler.copy(screenshot, path);
		Thread.sleep(2000);
		driver.close();
	}
}


