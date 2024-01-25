package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script13MakeMyTrip {

	public static void main(String[] args) throws Throwable {
       //open the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//maximise the browser
				driver.manage().window().maximize();
		
		//enter url 
		driver.get("https://www.makemytrip.com/");
		
		
		//wait to load the page 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on cabs 
		driver.findElement(By.xpath("//span[text()='Cabs']")).click();
		
		//click on hourly rental checkbox 
		driver.findElement(By.xpath("//li[text()='Hourly Rentals']")).click();
		
		//click on pickup location 
		driver.findElement(By.xpath("//span[text()='Pickup Location']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("pune");
		WebElement location = driver.findElement(By.xpath("//span[contains(text(),'Pune Railway Station, Agarkar Nagar,')]"));
		Actions a = new Actions(driver);
		a.moveToElement(location).click().perform();
		
		//click on pickup date 
		driver.findElement(By.xpath("//span[text()='Pickup Date']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Fri Dec 29 2023']")).click();
		
		//click on pickup time 
		driver.findElement(By.xpath("(//span[@class='downArrow cswInputLabel'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='08  Hr']")).click();
		driver.findElement(By.xpath("//span[text()='15  min']")).click();
		driver.findElement(By.xpath("(//span[text()='AM'])[2]")).click();
		
		//click on apply button 
		driver.findElement(By.xpath("//span[text()='APPLY']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
