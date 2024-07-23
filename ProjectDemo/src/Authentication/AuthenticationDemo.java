package Authentication;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationDemo {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		driver.close();
	}
}
