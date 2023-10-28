package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJDBCDemo {
	public static void main(String args[]) throws ClassNotFoundException, SQLException    {
		//1. register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. establish a connection 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip", "root","root");
		
		//3. create SQL statement
		Statement stmt=con.createStatement();
		String sql="create table student"+
				"(id int not null," +
                " first varchar(20), " + 
                " last varchar(20), " + 
                " PlacementStatus varchar(20))";
		
		//4. Execute query
		stmt.executeUpdate(sql);
		System.out.println("student1 table created....");
		
		//5. close connection
		con.close();
		
	}
}
