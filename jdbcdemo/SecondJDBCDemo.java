package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SecondJDBCDemo {

	public static void main(String[] args) throws SQLException {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
				
			Connection con=null;
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root","root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			Statement	stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp");
			int id;
			String name, dept;
			int sal;
			
			System.out.println("Employee Details:");
			System.out.println("=================");
			while(rs.next()) {
				id=rs.getInt(1);
				name=rs.getString(2);
				dept=rs.getString(3);
				sal=rs.getInt(4);
				System.out.println(id+" "+name+" "+dept+" "+sal);
			}
			con.close();
			
	}

}
