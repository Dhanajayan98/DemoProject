  package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		driver.switchTo().frame(3);
		WebElement frame = driver.findElement(By.xpath("//p[@class='JcCk8']"));
		System.out.println(frame.getText());
		driver.switchTo().defaultContent();

		System.out.println(driver.findElement(By.xpath("//time[@datetime='2019-11-21T22:42:00-08:00']")).getText());
		
		Thread.sleep(3000);
		driver.close();
	}
}
