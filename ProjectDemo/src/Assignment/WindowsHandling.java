package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowsHandling {
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String mainId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		driver.findElement(By.xpath("//a[text()='YouTube']")).click();
		driver.findElement(By.xpath("//a[text()='Google+']")).click();

		Set<String> allIds = driver.getWindowHandles();
		for (String id : allIds) {
			if (!(id.equals(mainId)))
			{
				driver.switchTo().window(id);
				String url = driver.getCurrentUrl();
				if (url.contains("youtube"))
				{
					System.out.println(url);
				} 
				else
				{
				driver.close();
				}
			}
		}
		driver.switchTo().window(mainId);
		driver.close();
		System.out.println();
	}
}

