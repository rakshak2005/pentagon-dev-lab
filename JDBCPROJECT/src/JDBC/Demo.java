package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("loaded sucessfully");
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=MySQL@1234");
		System.out.println("connection done");
		
		Statement st = con.createStatement();
		System.out.println("platform created ");
		String iqry = "insert into student.student values(101,'Rakshak', 'Rakshak@gmail.com',8105555265,'tiger')";
		st.execute(iqry);
		System.out.println("done ");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
