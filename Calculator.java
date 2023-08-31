package com.java.demo.intro;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		a=sc.nextInt();
		System.out.println("Enter b:");
		b=sc.nextInt();
		System.out.println("Enter oprator:");
		char ch=sc.next().charAt(0);
		switch(ch) {
		case '+':
			int c=a+b;
			System.out.println("a+b is"+ c);
			break;
		case '-':
			c=a-b;
			System.out.println("a-b is"+ c);
			break;
		case '*':
			System.out.println("a*b is"+ a*b);
			break;
		case '/':
			System.out.println("a/b is"+ a/b);
			break;
		default:
			System.out.println("Invalid operator");
		}
		
		// TODO Auto-generated method stub

	}

}
