package com.java.practice;

import java.util.Scanner;


public class Factorial {
	static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {
		int num, fact;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		num= sc.nextInt();
		fact=factorial(num);
		/*for(int i=1; i<=num;i++) {
			fact=fact*i;
		}*/
		System.out.println("factorial of num is:"+fact);
		// TODO Auto-generated method stub

	}

}
