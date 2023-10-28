package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AnudipStudent{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/anudip", "root", "root");
	
				Statement stmt = con.createStatement();
				
				String sql="select * from student where PlacementStatus='placed'";
				
				//int i=stmt.executeUpdate(sql);
				
				ResultSet rs= stmt.executeQuery(sql);	
				int id ;
				String first = null,last,PlacementStatus;
					
				System.out.println("Student details");
				System.out.println("============");	
				while(rs.next())
				{
					id=rs.getInt(1);
					first=rs.getString(2);
					last=rs.getString(3);
					PlacementStatus=rs.getString(4);
					System.out.println(id+"  "+first+"  "+last+"  "+PlacementStatus);
				}
				con.close();

	}

}
