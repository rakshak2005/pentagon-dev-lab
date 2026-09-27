package day3;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver"); // load 
		System.out.println("loaded sucessfully");
		
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/Student?user=root&password=MySQL@1234");//connection
		System.out.println("connection done");
		
		Statement stmt = con.createStatement(); 
		System.out.println("platform created hello ");
		
		
//		String sqry = "select * from student ";
//		ResultSet rs=stmt.executeQuery(sqry);
//		
//		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getString(3));
//			System.out.println(rs.getLong(4));
//			System.out.println(rs.getString(5));
//		}
		
//		String uqry = "update student set phoneno=9606182229 where idno=101";
//		stmt.executeUpdate(uqry);
		
//		String dqry = "delete from student where idno = 101";
//		stmt.executeUpdate(dqry);
		
//		String isqry = "insert into student values (104,'kanishka','kanishka@gmail.com',8105555299,'kanishka')";
//		boolean b = stmt.execute(isqry);
//		System.out.println(b);
		
		String sqry = "select * from student ";
		ResultSet rs = stmt.executeQuery(sqry);
		System.out.println(rs);
		
		while(rs.next()) {
			System.out.println("PHONE NUMBER Of " + rs.getString(2) + "  : "+ rs.getLong(4));
		}
		
//		String crqry  = "CREATE TABLE employee (id INT,name VARCHAR(50),salary INT,department VARCHAR(50))";
//		stmt.execute(crqry);
		
		
		} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
