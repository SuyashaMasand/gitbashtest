package practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockTest {

	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.name("q")).sendKeys("dell laptops");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		 List<WebElement> laptops = driver.findElements(By.xpath("//div[starts-with(text(),'DELL')]"));
		 List<WebElement> price = driver.findElements(By.xpath("//div[starts-with(text(),'DELL')]/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		int countL = laptops.size();
		 int countP = price.size();
		System.out.println(countP);
		System.out.println(countL);
	 for(int i=0;i<countP;i++) {
			 
	String Lap = laptops.get(i).getText();
		String Pri = price.get(i).getText();
		int ch = Integer.parseInt(Pri);
		if(ch<50000) {
			
			System.out.println("LAPTOP NAMES:"+Lap+"price"+Pri);
		}
	 }
//			 
//			 String laptopName = laptops.get(i).getText();
//			 
//		 }
//		 
//		
//     for(int i=0; i<price.size();i++) {
//    	 
//                   
//    	 
//    	 if(i<50000) {
//    	 String p = price.get(i).getText(); 
//    	 System.out.println(p);
//    	 }
    
  
    
    }
    	 
     }
	   
				
				
		
		
	

		
		
		
		
		
		
		
		
		
		
	

