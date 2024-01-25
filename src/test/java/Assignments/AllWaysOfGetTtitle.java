package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllWaysOfGetTtitle {
	public static void main(String[] args) throws Throwable {
		//launch the chromedriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//page load and wait statement
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//enter url 
		driver.get("https://www.myntra.com/");
//---------------------------------------------------------------------------------		
		//1. using gettitle
		String title1 = driver.getTitle();
		System.out.println("title1:"+title1);
//---------------------------------------------------------------------------------
		//2.using find elements 
		  String title2 = driver.findElement(By.xpath("(//title)[1]")).getText();
		 Thread.sleep(2000);
		 System.out.println("title2:" +title2);
//---------------------------------------------------------------------------------
		 //3. using javascript executor
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 String title3 = (String) js.executeScript("return document.title;");
		 System.out.println("title3"+ title3);
//---------------------------------------------------------------------------------
		 //4 using expected conditions 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.titleIs("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra"));
		 
		String title4 = driver.getTitle();
		System.out.println("title4" +title4);
		driver.quit();
//---------------------------------------------------------------------------------
		//5.using actions class
		
}
}
