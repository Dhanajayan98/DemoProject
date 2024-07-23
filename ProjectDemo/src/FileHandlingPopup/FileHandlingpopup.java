package FileHandlingPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandlingpopup {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.findElement(By.name("file")).sendKeys("F:\\Manual Project\\Project Duration Notes\\7.2 Project Initiation.txt");
		Thread.sleep(3000);
		driver.close();
	}	
}
