package com.java.practice;

import java.util.Scanner;

public class UserInput {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a+b;
		System.out.print("Sum of numbers is:"+ res);
	}
}
