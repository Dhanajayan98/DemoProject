package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTask {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input")).click();	
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Mani Kandan");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("Prabhu");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("manikandan1998@gmail.com");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[3]/div[2]/div[1]/input")).sendKeys("mani@1998");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("mani@1998");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/form/div[1]/div[2]/div[4]/input")).click();
		Thread.sleep(4000);
		
		Navigation navi = driver.navigate();
		navi.back();
		Thread.sleep(2000);
		navi.forward();	
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form/div[2]/input")).sendKeys("manikandan1998@gmail.com");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form/div[3]/input")).sendKeys("mani@1998");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
