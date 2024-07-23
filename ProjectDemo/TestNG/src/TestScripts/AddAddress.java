package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddAddress {
	@Test
	public void AdddtoCart() throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.name("Email")).sendKeys("vijaykumar1998@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("vijay1998");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//a[text()='vijaykumar1998@gmail.com']")).click();
		driver.findElement(By.xpath("//a[@class='inactive' and text()='Addresses']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 add-address-button']")).click();
		driver.findElement(By.xpath("//input[@id='Address_FirstName']")).sendKeys("Vijay");
		driver.findElement(By.xpath("//input[@id='Address_LastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='Address.Email']")).sendKeys("vijaykumar1998@gmail.com");
		driver.findElement(By.xpath("//input[@id='Address_Company']")).sendKeys("Wipro");
		WebElement countryDropdown = driver.findElement(By.name("Address.CountryId"));
		Select sel=new Select(countryDropdown);
		sel.selectByIndex(6);
		sel.selectByVisibleText("Australia");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Address.City']")).sendKeys("Chennai");		
		driver.findElement(By.xpath("//input[@id='Address_Address1']")).sendKeys("47/1,BalaMurugan Street");
		driver.findElement(By.xpath("//input[@id='Address_Address2']")).sendKeys("MGR Nagar Street");
		driver.findElement(By.xpath("//input[@name='Address.ZipPostalCode']")).sendKeys("60002");
		driver.findElement(By.xpath("//input[@name='Address.PhoneNumber']")).sendKeys("9842568890");
		driver.findElement(By.xpath("//input[@class='button-1 save-address-button']")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Reporter.log("Account New Address",true);
		Thread.sleep(3000);
		driver.close();
	}	
}
