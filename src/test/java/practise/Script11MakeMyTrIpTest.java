package practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script11MakeMyTrIpTest {

	public static void main(String[] args) throws Throwable {
		
		//open the browser 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser 
		driver.manage().window().maximize();
		
		//enter the url 
		driver.get("https://www.makemytrip.com/");
		
		//wait for page to load 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//click on flight 
		driver.findElement(By.xpath("(//span[text()='Flights'])[1]")).click();
		
		//wait statement 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//click on one way radio button 
		driver.findElement(By.xpath("//ul[@class='fswTabs latoRegular darkGreyText ']/descendant::li[contains(text(),'One')]")).click();
		
		//click on from 
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("bengaluru");
		
		WebElement from = driver.findElement(By.xpath("//p[text()='Bengaluru, India']"));
		Actions a = new Actions(driver);
		a.moveToElement(from).click().perform();
		
		//click on to 
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("mumbai");
		
		WebElement to = driver.findElement(By.xpath("//p[text()='Mumbai, India']"));
		a.moveToElement(to).click().perform();
		
		//select departure date 
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Mon Jan 01 2024']")).click();
		
		//select traveller and class 
		driver.findElement(By.xpath("//span[text()='Travellers & Class']")).click();
		driver.findElement(By.xpath("//li[@data-cy='adults-4']")).click();
		
		//click on apply
	    driver.findElement(By.xpath("//button[.='APPLY']")).click();
	    
	    //click on search button
	    driver.findElement(By.xpath("//a[.='Search']")).click();
	    
	    //click on cancel button 
	    driver.findElement(By.xpath("//div[@class='commonOverlay ']/descendant::span[contains(@class,'bgProperties  overlayCrossIcon')]")).click();
	    
	    //click on view price
	    driver.findElement(By.xpath("(//button[@class='ViewFareBtn  text-uppercase  clusterBtn']/descendant::span[.='View Prices'])[10]")).click();
	     
	    //click on booknow
	    driver.findElement(By.xpath("(//button[.='Book Now'])[1]")).click();
	    
	    //switch to window 
	    String etitle ="MakeMyTrip";
	   Set<String> allwh = driver.getWindowHandles();
	   for( String wh:allwh) {
	    driver.switchTo().window(wh);
	    String atitle = driver.getTitle();
	    
	   }
	   //fetch the text
	   String text = driver.findElement(By.xpath("//h2[text()='Complete your booking']")).getText();
	   System.out.println(text);
	    
	    }
	   }

	

