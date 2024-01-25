package practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Script7Test {
	public static void main(String[] args) throws AWTException {
		ChromeOptions options = new ChromeOptions();
		//in order to handle notification pop ups which contains audio settings we will pass this in add arguments
		options.addArguments("--use-fake-ui-for-media-stream");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mictests.com/");
		driver.findElement(By.id("mic-launcher")).click();
		
		
		
		
	}

}
