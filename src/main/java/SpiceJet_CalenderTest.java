import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJet_CalenderTest {

	public static void main(String[] args) throws Throwable {
		
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='round trip']")).click();
		Thread.sleep(2000);
		//enter from location
		//here if we will write only till from xpath we will get 1/1 but it will not take bhopal insted it will take only 3 letters that is for bengaluru it is blr. 
		//but of we will use xpath by axis we can send any data 
	    
		driver.findElement(By.xpath("//div[text()='From']/parent::div/descendant::input")).sendKeys("bho");
	    driver.findElement(By.xpath("//div[text()='To']/parent::div/descendant::input")).sendKeys("vns");	
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='October ' and text()='2024']/../../descendant::div[text()='19']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='December ' and text()='2024']/../../descendant::div[text()='20']")).click();
	        
	   
	    
	}			
	
	}


