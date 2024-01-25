package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysInHowManyWaya {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//1.send keys
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("email")).clear();
		
		//2.store it in a variable
		WebElement text = driver.findElement(By.id("email"));
		text.sendKeys("abc@gmail.com");
		
		//3rd way - robot class
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_2);
		r.keyPress(KeyEvent.VK_G);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_L);
		
		//4th way - javascriptexecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById(\"email\").value='suyasha'");
				
		//5th way - actions class
		Actions a = new Actions(driver);
		a.sendKeys("suyasha").perform();
		}
	}


