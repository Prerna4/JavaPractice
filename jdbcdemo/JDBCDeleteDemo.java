package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDeleteDemo {
//crud- create-retrive-update-delete
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
		Statement stmt = con.createStatement();
		
		String sql="delete from emp where empid=1";
		
		stmt.executeUpdate(sql);
		
		ResultSet rs= stmt.executeQuery("select * from emp");	
		//System.out.println(rs);
		int id ;
		String name = null,dept;
		int sal;		
		System.out.println("Employe details");
		System.out.println("============");	
		while(rs.next())
		{
			id=rs.getInt(1);
			name=rs.getString(2);
			dept=rs.getString(3);
			sal=rs.getInt(4);
			System.out.println(id+"  "+name+"  "+dept+"  "+sal);
		}
		con.close();


	}

}
