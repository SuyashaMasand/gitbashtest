package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.collections4.functors.CatchAndRethrowClosure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;


public class RMGYantra_SelectQueryTest {

	public static void main(String[] args) throws InterruptedException, SQLException {

		
		Random r = new Random();
		int random = r.nextInt(100);
		String proj_name = "TY_BANKING_PROJECT"+random;

		


			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("http://rmgtestingserver:8084/");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

			Thread.sleep(5000);
			driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
			driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
			driver.findElement(By.xpath("//button[text()='Sign in']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Projects']")).click();
			driver.findElement(By.xpath("//span[text()='Create Project']")).click();

			driver.findElement(By.name("projectName")).sendKeys(proj_name);
			driver.findElement(By.name("createdBy")).sendKeys("Suyasha Masand");

			WebElement ProStatus = driver.findElement(By.xpath("//select[@name='status']"));

			Select s = new Select(ProStatus);
			s.selectByVisibleText("Created");

			driver.findElement(By.xpath("//input[@value='Add Project']")).click();


			//validate the data 
			//step1: register driver
			
			Connection conn = null;
			try {
			Driver driver1 = new Driver();
			DriverManager.registerDriver(driver1);

			//step2: get connection from database 

			conn = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");

			//step3: create statement 
			Statement statement = conn.createStatement();
			String query = "select * from project where lower(project_name)= '"+proj_name+"';";

			//step4: execute query 

			ResultSet result = statement.executeQuery(query);
		ResultSetMetaData columncount = result.getMetaData();
		int ccount = columncount.getColumnCount();
                    System.out.println(ccount);
			boolean flag = false;
			while(result.next()) {

                //for(int i=0;i<ccount;i++) {
				String actual = result.getString(4);

				if(proj_name.contains(actual)) {
					flag = true;
					break;
				}
			}
			
			
			if(flag) {
				System.out.println("-- project created sucesssfully--");
			}
			else {
				System.out.println("-- project not created sucessfully--");
			}
		}
		catch(Exception e){

e.printStackTrace();
		}
		finally {
			conn.close();
			System.out.println("----DB CLOSED----");
		}
	}
}

