package practise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.exceptions.CsvMalformedLineException;

public class BrokenLinksTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Thread.sleep(5000);
		 List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		System.out.println(alllinks.size());
		
		for(WebElement links:alllinks) {
			String eachlink = links.getAttribute("href");
			int statuscode =0;
			
				//int statuscode =0;
				try {
					URL url = new URL(eachlink);
					
					HttpsURLConnection httpconn = (HttpsURLConnection) url.openConnection();
					Thread.sleep(5000);
					
					statuscode = httpconn.getResponseCode();
					if(statuscode >=400 && eachlink!=null)
					{
						System.out.println(eachlink+" --> "+statuscode);
					}
				} catch (Exception e) {
					//System.out.println(eachlink+" --> "+statuscode);
					//e.printStackTrace();
				}
			
		}
	}

}
