package com.java.demo.intro;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		int a,b,c;
		try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter three numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		}
		int max=a;
		if(b>max) {
			max=b;
			if(c>max) {
				max=c;
			}
		}
		System.out.println("Largest number is:"+max);
		
	}

}
	/*public static void main(String[] args) {
		int a =20;
		int b = 35;
		int c =10;
		
		if(a>b && a>c) {
				System.out.println("A = "+a+" is the largest number");
				
			
		}
		else if(b>a && b>c) {
				System.out.println("B = "+b+" is the largest number");
			}
		
		else if(c>a && c>b){
				System.out.println("C = "+c+" is the largest number");
				
			}
		

	}

}*/
