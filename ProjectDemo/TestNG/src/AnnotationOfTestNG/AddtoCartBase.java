package AnnotationOfTestNG;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddtoCartBase extends AnnotationOfMethods{
	@Test
	public void Addtocart()throws Throwable {
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);

		driver.findElement(By.xpath("//div[@class='product-item']/../../div[5]/div[1]/div[2]/h2[1]/a")).click();
		driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
		Thread.sleep(5000);
	}
}
