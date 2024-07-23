package AlertHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMethods {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("CSK");
		alt.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		Alert alt1=driver.switchTo().alert();
		System.out.println(alt1.getText());
		alt1.accept();
		Thread.sleep(3000);
		driver.close();
		
	}	
}
