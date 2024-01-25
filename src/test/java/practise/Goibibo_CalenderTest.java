package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo_CalenderTest {

	public static void main(String[] args) throws Throwable {
		String DepMonthAndYear= "January 2024";
		String ReturnMonthAndYear="February 2024";
		int depdate= 20;
		int returndate= 16;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		driver.findElement(By.xpath("//div[text()='"+DepMonthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+depdate+"']")).click();
		driver.findElement(By.xpath("//p[@class='gr_fswFld__info']")).click();
		driver.findElement(By.xpath("//div[text()='"+ReturnMonthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+returndate+"']")).click();
		Thread.sleep(2000);

	}


}
