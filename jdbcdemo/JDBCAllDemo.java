package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCAllDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//establish connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
		//create statement
		Statement stmt=con.createStatement();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:");
		System.out.println("1.Insert Data"+"\n2.Update data"+"\n3.Delete Data");
		int ch=sc.nextInt();
		
		String sqlQuery;
		int id;
		String name,addr,course;
		float marks;
		
		switch(ch) {
		
		case 1:
			//Insert Data:
			
			 
			sqlQuery="insert into student values(?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sqlQuery);
			
			System.out.println("Enter Student Id:");
			id=sc.nextInt();
			System.out.println("Enter Student Name:");
			name=sc.next();
			System.out.println("Enter Student Address:");
			addr=sc.next();
			System.out.println("Enter Student Course:");
			course=sc.next();
			System.out.println("Enter Student Marks:");
			marks=sc.nextFloat();
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			pstmt.setString(4, course);
			pstmt.setFloat(5, marks);
			
			int i=pstmt.executeUpdate();
			System.out.println(i+" "+"Record Added Successfully\n");

			break;
			
		case 2:
			//Update Data
			
			sqlQuery="Update student set course='Comp' where id=1";
			i=stmt.executeUpdate(sqlQuery);
			System.out.println(i+" "+"Record Updated Successfully\n");
			break;
			
		case 3:
			//Delete Data
			sqlQuery="Delete from student where id=2";
			i=stmt.executeUpdate(sqlQuery);
			System.out.println(i+" "+"Record Deleted Successfully\n");
			break;
			
		default:
			System.out.println("Invalid Choice..");
		}

		ResultSet rs=stmt.executeQuery("Select * from student");
		System.out.println("Students Detail:");
		System.out.println("=================");
		while(rs.next()) {
			id=rs.getInt(1);
			name=rs.getString(2);
			addr=rs.getString(3);
			course=rs.getString(4);
			marks=rs.getFloat(5);
			System.out.println(id+" "+name+" "+addr+" "+course+" "+marks);
		}
		
		//close connection
		con.close();
		
	}
	

}
