package com.stringdemo;

/*toString() is used to represent any Java Object 
into a meaningful string representation.
Whenever we will try to print any object of class Car, 
its toString() function will be called. */ 

public class ToString {

	public static void main(String[] args) {
		ToString t=new ToString();
		System.out.println(t);

	}
	public String toString(){
		return "this is a object of ToString class";
	}

}
