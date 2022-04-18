package browser_commands;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcc {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	String query="select title,author,price from book";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","password");
	System.out.println("connected successfully");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(query);
	int rowcount=0;
	while(rs.next()) {
		String title=rs.getString("title");
		String author=rs.getString("author");
		String price=rs.getString("price");
		System.out.println(title +" "+author+" "+price);
		++rowcount;
	}
	System.out.println(rowcount);
	}
}
