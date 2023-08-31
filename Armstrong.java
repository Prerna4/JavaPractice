package com.java.demo.intro;
import java.lang.Math;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int rem=0;
		int temp=a;
		int sum=0;
		int n=a;
		int digits=0;
		while(n>0) {
			n=n/10;
			digits++;
		}
		
		while(a>0) {
			rem=a%10;
			sum+=Math.pow(rem, digits);
			a=a/10;
		}
		if(sum==temp) {
			System.out.println("Armstrong");
		}
		else
			System.out.println("Not Armstrong");
	}

}
