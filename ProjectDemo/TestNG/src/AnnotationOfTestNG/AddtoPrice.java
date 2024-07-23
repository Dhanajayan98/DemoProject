 package AnnotationOfTestNG;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddtoPrice extends AnnotationOfMethods {
	@Test
	public void Addtocart()throws Throwable {
		driver.findElement(By.xpath("//div[@class='header-links-wrapper']/../div[2]/div[1]/ul[1]/li[3]/a[1]/span[1]")).click();		
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_UP);
		robo.keyRelease(KeyEvent.VK_PAGE_UP);

		String price = driver.findElement(By.xpath("//div[@class='total-info']/../../div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/span")).getText();
		Reporter.log(price);
		Reporter.log("Price is a displayed",true);
	}
}
