package WindowsHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingDemo {
	public static void main(String[] args)throws InterruptedException, AWTException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(1000);
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		String mainId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		Set<String> allIds = driver.getWindowHandles();
		for(String id:allIds) {
			if(!(id.equals(mainId))) {
				driver.switchTo().window(id);
				String title1 = driver.getTitle();
				System.out.println(title1);
				String dws = driver.getCurrentUrl();
				System.out.println(dws);
			}
		}
		driver.switchTo().window(mainId);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		driver.quit();
	}
}
