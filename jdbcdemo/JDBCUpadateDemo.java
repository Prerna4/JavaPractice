package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpadateDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
		/*Student table- id name address,course marks
		
		craete table
		desc
		
		syso("input your choice");
		1
		
		switch()
		
		case:1
		
			insertStudnet()
			
		case:2 
		
			updateStudent()
			
		case 3:
			
			delete()
		
			studentData
			
			
			
			*/
				Statement stmt = con.createStatement();
				
				String sql="update emp set empdept ='IT' where empid=1";
				
				int i=stmt.executeUpdate(sql);
				
				ResultSet rs= stmt.executeQuery("select * from emp");	
				int id ;
				String name = null,dept;
				int sal;		
				System.out.println("Student details");
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