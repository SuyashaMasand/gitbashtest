package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KRCTC_CalenderTest {

	public static void main(String[] args) {

		int date =25;
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter the url 
		driver.get("https://www.ksrtc.in/oprs-web/");
		
		//wait for page load
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//select the departure date 
		driver.findElement(By.id("txtJourneyDate")).click();
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
	}

}
