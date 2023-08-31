package com.java.practice;

import java.util.Scanner;

public class Palindrom {
	public static void main(String args[]) {
		int num,temp,rem;
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num=sc.nextInt();
		temp=num;
		while(num>0) {
			rem=num %10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("NUmber is palindrome");
		}
		else {
			System.out.println("NUmber is not palindrome");
		}
		
	}
	

}
