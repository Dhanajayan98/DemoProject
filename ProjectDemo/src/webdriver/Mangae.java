package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mangae {
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
//			Options opts=driver.manage();' |
//			Window win=opts.window();      |-->traditional method
//			win.maximize();               _|
			driver.get("https://demowebshop.tricentis.com/camera-photo");
	}

}
