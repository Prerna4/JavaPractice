package com.exceptiondemo;

import java.util.Scanner;

class AgeException extends Exception{
	AgeException(String str){
		System.out.println(str);
	}
}

public class CustomExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		try {
			if(age<18)
				throw new AgeException("your age is less and not eligible for voting");
			else
				throw new AgeException("Eligible for voting");
		}
		catch(AgeException e) {
			System.out.println(e);
		}
	}

}
