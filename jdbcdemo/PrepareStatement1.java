package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatement1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//connection establish
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root","root");
		
		//prepared the statement
		PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the empId:");
		int id=sc.nextInt();
		
		System.out.println("Enter the empName:");
		String name=sc.next();
		
		System.out.println("Enter the empdept:");
		String dept=sc.next();
		
		System.out.println("Enter the empSalary:");
		int sal=sc.nextInt();
		
		pstmt.setInt(1,id);
		pstmt.setString(2,name);
		pstmt.setString(3,dept);
		pstmt.setInt(4, sal);
		
		//executing the statement
		int i=pstmt.executeUpdate();
		//close connection
		con.close();
		System.out.println(+i+" "+"record successfully added...");
	}

}
