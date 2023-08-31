package com.java.demo.intro;

public class Swap {

	public static void main(String[] args) {
		int a=20;
		int b=10;
		/*int temp;
		temp=a;
		a=b;
		b=temp;*/
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("a="+a+"\n"+ "b=" +b);

	}

}
