package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitHubDemo {
	
	
	@Test
	public void github() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/");
		
		
		
	}

}
