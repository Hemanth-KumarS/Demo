package Pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
public class NoSqlEx {

	public static void main(String[] args) throws SQLException {
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_yantra","root","root");
		Statement stat = con.createStatement();
		String Query = "insert into student(first_name,last_name,address)values('raju','BN','india')";
		
		  int result = stat.executeUpdate(Query);
		
	if(result==1) {
		System.out.println("user is created");
	}
	else {
		System.out.println("User is not created");
	}
		}
		
		
		
		
		
		
		
	}
	


