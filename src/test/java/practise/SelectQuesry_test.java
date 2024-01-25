package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class SelectQuesry_test {
	public static void main(String[] args) throws SQLException {
		
		
		
		//step1: register driver 
		
		Driver driver = new Driver();
		
		DriverManager.registerDriver(driver);
		
		
		
		//step2: get connection
		//database name
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet53", "root", "root");
		
		//step3: create statement
		
		Statement statement = conn.createStatement();
		String query ="select * from rmg;";
		
		
		//step: execute/update
		ResultSet result = statement.executeQuery(query);
		
		while(result.next()) {
			System.out.println(result.getString(1)+"  "+result.getString(2)+"   "+result.getString(3));
		}
		
		//step5: close DB connection 
		
		conn.close();
		
		
		
	}

}
