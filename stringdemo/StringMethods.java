package com.stringdemo;

public class StringMethods {

	public static void main(String[] args) {
		
		int a=10;
		String str1="Hello"; //using string literal(stored inside String constant pool inside heap)
		String str2="Hello";
		System.out.println(str1.concat(str2)); //HelloHello
		System.out.println(str1.equals(str2));//true
		
		String str3=new String("Hello"); //using new operator(stored inside heap memory) 
		String str4=new String("Hello");
		String str5=new String("  JAVA  ");
		
		System.out.println(str1==str2);//check same instance or not(true)
		System.out.println(str1==str3);//false
		System.out.println(str3==str4); //false
		
		System.out.println(str1.charAt(2));
		
		System.out.println(str1.equalsIgnoreCase("HELLO"));//compare by ignoring case
		
		System.out.println(str1.length());//5
		
		System.out.println(str1.replace('e','E'));
		
		System.out.println(str1.substring(2)); //llo
		System.out.println(str1.substring(1,4));//ell
		
		System.out.println(str2.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toCharArray());
		
		String s=String.valueOf(a);//used to convert primitive datatype to string
		System.out.println(a+"I'm a String");
		
		System.out.println(str5.trim());//remove leading and tailing whitespaces
		
		
	}

}
