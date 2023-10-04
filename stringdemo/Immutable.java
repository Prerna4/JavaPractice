package com.stringdemo;

public class Immutable {

	public static void main(String[] args) {
		String a="Hello";
		a.concat("abc");
		System.out.println(a); //it will only print Hello
		String b=a.concat("abc");
		System.out.println(b); //will print Helloabc
	}

}
