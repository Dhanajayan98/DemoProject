package AnnotationOfTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UpdateAddress extends AnnotationOfMethods {
	@Test
	public void updateAddress()throws Throwable {
		driver.findElement(By.xpath("//a[text()='vijaykumar1998@gmail.com']")).click();
		driver.findElement(By.xpath("//a[@class='inactive' and text()='Addresses']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 add-address-button']")).click();
		driver.findElement(By.xpath("//input[@id='Address_FirstName']")).sendKeys("Michacel");
		driver.findElement(By.xpath("//input[@id='Address_LastName']")).sendKeys("Vijay");
		driver.findElement(By.xpath("//input[@name='Address.Email']")).sendKeys("vijaykumar1998@gmail.com");
		driver.findElement(By.xpath("//input[@id='Address_Company']")).sendKeys("TCS");
		WebElement countryDropdown = driver.findElement(By.name("Address.CountryId"));
		Select sel=new Select(countryDropdown);
		sel.selectByIndex(41);
		sel.selectByVisibleText("India");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Address.City']")).sendKeys("Bangalore");		
		driver.findElement(By.xpath("//input[@id='Address_Address1']")).sendKeys("Sivaji Nagar");
		driver.findElement(By.xpath("//input[@id='Address_Address2']")).sendKeys("MGR Nagar Street");
		driver.findElement(By.xpath("//input[@name='Address.ZipPostalCode']")).sendKeys("62202");
		driver.findElement(By.xpath("//input[@name='Address.PhoneNumber']")).sendKeys("9842777092");
		driver.findElement(By.xpath("//input[@class='button-1 save-address-button']")).click();
	}

}
