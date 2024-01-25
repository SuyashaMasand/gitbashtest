package practise;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataInto_PropertyFileTest {

	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream(".\\src\\\\test\\resources\\commondata.properties");
		
		Properties p = new Properties();
		p.load(fis);
		
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String UN = p.getProperty("un");
		String PWD = p.getProperty("pwd");
		
		System.out.println("BROWSER"+BROWSER);
		System.out.println("URL"+URL);
		System.out.println("UN"+UN);
		System.out.println("PWD"+PWD);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);
		
		driver.findElement(By.xpath("//a[text()='Staff Login']")).click();
		
		driver.findElement(By.name("staff_id")).sendKeys(UN);
		driver.findElement(By.name("password")).sendKeys(PWD);
		driver.findElement(By.xpath("//input[@class='login-btn']")).click();
	
	}

}
