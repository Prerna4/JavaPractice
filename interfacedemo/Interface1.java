package com.interfacedemo;

interface Emp{//by default abstract
	int a=10;//public,static.final
	double salary();//abstract, public

}
interface Emp2{
	double salary();
}
//multiple inheritance
class programmer implements Emp,Emp2{
	public double salary() {
		System.out.println("hello");//implementation of method is in implementation class so multiple inheritance is present
		return 0;
	}
}
public class Interface1 {
	public static void main(String args[]) {
		programmer e=new programmer();
		System.out.println(e.salary());
	
		
	}

}
