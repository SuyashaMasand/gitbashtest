package practise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import net.sourceforge.tess4j.Tesseract;

public class Script6Test {
	public static void main(String[] args) throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath(" //a[text()=' LOGIN ']")).click();
		WebElement capchatext = driver.findElement(By.xpath("//img[@class='captcha-img']"));
	File src = capchatext.getScreenshotAs(OutputType.FILE);
	String path = "C:\\Users\\suyas\\eclipse-workspaceTY\\PractiseSessions\\screenshot\\captcha.png";
	FileHandler.copy(src, new File(path));
	Tesseract ts = new Tesseract();
	ts.setDatapath("C:\\Users\\suyas\\OneDrive\\Desktop\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
	String text=ts.doOCR(new File(path));
	System.out.println(text);
	driver.findElement(By.id("captcha")).sendKeys(text);
	
	
		
	}

}
