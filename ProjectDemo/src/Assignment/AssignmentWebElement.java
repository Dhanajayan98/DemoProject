 package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWebElement {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login' and text()='Log in']")).click();
		String title = driver.getTitle();
		
		if(title.contains("Login")) {
			System.out.println("login page is displayed");
		}
		else {
			System.out.println("login page is not displayed");
		}
		
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("vijaykumar1996@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vijay1996");
		driver.findElement(By.xpath("//input[@type='submit']/../../div[5]/input[1]")).submit();   
		String title1 = driver.getTitle();  
		
		if(title1.contains("Demo Web Shop")) {		
			System.out.println("Demo Web Shop page is displayed");
		}	
		else {
			System.out.println("Demo Web Shop page is not displayed");
		}	
			
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
		String title2 = driver.getTitle();
		
		if(title2.contains("Books")) {
			System.out.println("books page is displyed");
		}	
		else {
			System.out.println("books page is not displayed");
		}
		
		driver.findElement(By.xpath("//div[@class='product-item']/../../div[5]/div[1]/div[2]/h2[1]/a")).click();
		String title3 = driver.getTitle();
		
		if(title3.contains("Health Book")) {
			System.out.println("health book is displayed");
		}
		else {
			System.out.println("health book is not displayed");
		}
		
		driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='header-links-wrapper']/../div[2]/div[1]/ul[1]/li[3]/a[1]/span[1]")).click();
		String title4 = driver.getTitle();
		
		if(title4.contains("Shopping Cart")) {
			System.out.println("cart page is displayed");
		}
		else {
			System.out.println("cart page is not displayed");
		}
		
		String price = driver.findElement(By.xpath("//div[@class='total-info']/../../div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/span")).getText();
		System.out.println(price);
		System.out.println("Price is a displayed");
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		String title5 = driver.getTitle();
		
		if(title5.contains("Demo Web Shop")) {
			System.out.println("demo web shop logout is displayed");
		}
		else {
			System.out.println("demo web shop logout is displayed");
		}
		
		Thread.sleep(3000);
		driver.close();
	}
}

