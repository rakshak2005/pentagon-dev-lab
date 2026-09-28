package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//  resp.getWriter().println("<Html> <body bgcolor= blue > <h1> REGISTERED </h1> <body/> <html/>");
	 int id = Integer.parseInt(req.getParameter("idkey"));
	 String name = req.getParameter("namekey");
	 String Email = req.getParameter("emailkey");
	 long phone = Long.parseLong(req.getParameter("numberkey"));
	 String pass = req.getParameter("passkey");
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =  DriverManager.getConnection ("jdbc:mysql://localhost:3306/Student?user=root&password=MySQL@1234");//connection
		System.out.println("connection done");
		
		Statement stmt = con.createStatement(); 
		System.out.println("platform created hello ");
		
		String isqry = "insert into student values ('"+ id +"','"+ name  +"','"+ Email  +"','"+phone + "','"+ pass +"')";
		int b = stmt.executeUpdate(isqry);
		if (b>0) {
			resp.getWriter().println("Data imported");
		}
		else {
			resp.getWriter().println("Data import not done");
		}
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	 }
}
