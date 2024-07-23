package FileHandlingPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandlingPopup2 {
	public static void main(String[] args)throws InterruptedException, AWTException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(1000);
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='  I have work experience (excluding internships)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(2000);
		StringSelection path=new StringSelection("D:\\Resume\\Traditional Resume.pdf");
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(path, null);
		
		Robot robo1=new Robot();
		robo1.keyPress(KeyEvent.VK_CONTROL);
		robo1.keyPress(KeyEvent.VK_V);
		robo1.keyRelease(KeyEvent.VK_CONTROL);
		robo1.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robo1.keyPress(KeyEvent.VK_ENTER);
		robo1.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(7000);
		driver.close();
	}	
}
