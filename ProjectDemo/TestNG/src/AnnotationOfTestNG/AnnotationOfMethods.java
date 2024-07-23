package AnnotationOfTestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Genericutility.GetPropertiesData;

public class AnnotationOfMethods {
	GetPropertiesData pro=new  GetPropertiesData();
	WebDriver driver;
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void openBrowser(String browser) throws IOException {
		if(browser.contains("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.contains("Edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		String url = pro.fetchData("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		String Username = pro.fetchData("Username");
		String Password = pro.fetchData("Password");
		driver.findElement(By.name("Email")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	@AfterMethod(alwaysRun = true)
	public void logout() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser()throws Throwable {
		Thread.sleep(3000);
		driver.close();
		Reporter.log("Close Browser",true);
	}
}
