package practise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script12MakeMyTrip {

	public static void main(String[] args) {

		//open the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//maximize the browser 
		driver.manage().window().maximize();

		//enter the url 
		driver.get("https://www.makemytrip.com/");

		//wait to load the page 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//click on the hotel button 
		driver.findElement(By.xpath("(//span[text()='Hotels'])[1]")).click();

		//click on upto4Rooms radio button 
		driver.findElement(By.xpath("//span[text()='Upto 4 Rooms']")).click();

		//click on city name property or location
		driver.findElement(By.xpath("//span[text()='City, Property name or Location']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where do you want to stay?']")).sendKeys("goa");
		WebElement ele = driver.findElement(By.xpath("//span[text()='South ']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).click().perform();

		//click on checkin
		driver.findElement(By.id("checkin")).click();
		driver.findElement(By.xpath("//div[@aria-label='Sat Jan 27 2024']")).click();

		//click on checkout 
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//div[@aria-label='Wed Jan 31 2024']")).click();


		//click on rooms and guests 
		driver.findElement(By.id("guest")).click();
		driver.findElement(By.xpath("(//div[@class='gstSlct'])[1]")).click();

		//click on apply button 
		driver.findElement(By.xpath("//button[text()='Apply']")).click();

		//click on search button 
		driver.findElement(By.xpath("//button[text()='Search']")).click();

		//click on hotel 
		driver.findElement(By.xpath("//span[text()='Taj Exotica Resort & Spa, Goa']")).click();

		//switch to window 
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			//System.out.println(title);
		}
        //fetch the text
		String text = driver.findElement(By.xpath("//h2[text()='About Taj Exotica Resort & Spa, Goa']")).getText();
		System.out.println(text);
		driver.close();
       }
	}
