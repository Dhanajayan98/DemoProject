package DataDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT {
	public static void main(String[] args) throws Throwable{
		FileInputStream fis=new FileInputStream("./Data/Dj.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		
		String url = pObj.getProperty("url");
		String Usn = pObj.getProperty("Username");
		String Pwd = pObj.getProperty("Password");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(Usn);
		driver.findElement(By.id("Password")).sendKeys(Pwd);
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
