package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip_CalenderTest {

	public static void main(String[] args) throws InterruptedException {
		String DMonthAndDate="March 2024";
		int ddate=20;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(4000);
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//a[@class='close']")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		driver.switchTo().parentFrame();
		
		try {
			driver.findElement(By.xpath("//div[text()='"+DMonthAndDate+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+ddate+"']")).click();
		} catch (Exception e) {
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
                


	}

}
