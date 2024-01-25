import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Assignment1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("https://www.icc-cricket.com/rankings/team-rankings/mens/test");
		Thread.sleep(5000);

		List<WebElement> teamnames = driver.findElements(By.xpath("//div[@class='si-table-body']/descendant::div[@class='si-table-data-wrap']/h3/span[2]|//div[@class='si-table-body']/descendant::div[@class='si-table-data si-rating']/span"));

		System.out.println(teamnames.size());

		for(WebElement tn: teamnames) {

			String text = tn.getText();
			System.out.println(text);
		}
	}

}
