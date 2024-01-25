package practise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10Test {
	public static void main(String[] args){
		System.out.println("open browser");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[.='click']")).click();
		Set<String> allwh = driver.getWindowHandles();
		String exptitle = "Selenium";
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String atitle = driver.getTitle();
			if(atitle.contains(exptitle)){
				
				break;
			}
		}
			String text = driver.findElement(By.xpath("//h4[@class='alert-heading text-center m-0']")).getText();
			System.out.println(text);
		}

	}


