package Assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotsAssignment4 {
	public static void main(String[] args)throws InterruptedException, IOException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.imdb.com/title/tt21209876/");
		TakesScreenshot ts=(TakesScreenshot)driver;
	    File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File path=new File("./Screenshots/SoloLeveling.png");
		FileHandler.copy(screenshot, path);
		Thread.sleep(2000);
		driver.close();
	}

}
