package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo_Calender_DiffrentMonthTest {

	public static void main(String[] args) {
		String DepMonthAndYear="May 2024";
		String RMonthAndYear="June 2024";
		int ddate= 20;
		int rdate=16;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+DepMonthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+ddate+"']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
			
			driver.findElement(By.xpath("//p[@class='gr_fswFld__info']")).click();
			for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+RMonthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+rdate+"']")).click();
				
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			//driver.findElement(By.xpath("//span[text()='Done']")).click();
			//driver.findElement(By.xpath("//a[text()='Cancel']")).click();
			}
			
		
		
	}
	}

