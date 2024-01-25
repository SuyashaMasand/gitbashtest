package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSellectQuery_Test {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		try {
		//register driver 
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//step2: get connection from database
		
	    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet53", "root", "root");
	
		//step3: create statement 
		
		 Statement state = conn.createStatement();
		 String query = "insert into rmg values('suyasha','java',1),('vani','selenium',2);";
		 
		 //step4 : execute/update
		 
		 int result = state.executeUpdate(query);
		 
		 
		 if(result>=1) 
		 { // or result ==2
			 System.out.println("data added sucessfully");
		 }
		 else {
			 System.err.println("data not added");
		 }
		
		}
		
		catch (Exception e) {
		}
		finally {
			//step5: close the connection  
			conn.close();
		}
		 
		
	}

}
