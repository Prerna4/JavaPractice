package com.java.practice;

import java.util.Scanner;

public class Fibonacci {
		static int fibonacci(int n){
		if(n==0) {
			return 0;
		}
		if(n==1 ||n==2) {
			return 1;
		}
		else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	public static void main(String args[]) {
		int len, fact;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		len= sc.nextInt();
		for(int i=0; i<len; i++) {
		int fibo=fibonacci(i);
		System.out.println(fibo);
	}
	}

}
