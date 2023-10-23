package com.exceptiondemo;

import java.util.Scanner;

class OddNumber{
	public void checkNumber(int n) {
		if (n%2!=0)
			throw new IllegalArgumentException(n+" is odd");
	}
}
public class OddNumberException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		 try {
			OddNumber obj=new OddNumber();
			obj.checkNumber(num);
		 }
		 catch(IllegalArgumentException e) {
			 System.out.println("Error:"+e);
		 }
	}

}
