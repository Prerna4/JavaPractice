package com.thistest.demo;
//this: to refer current class instance variable
class A{
	String name;
	int roll, age;
	

	public A(String name, int roll, int age) {
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
	void display() {
		System.out.println("name is:"+name+"Rollis:"+roll+"age is:"+age);
	}
}

public class ThisTest1 {


	public static void main(String[] args) {
		A t=new A("aaa", 1,20);
		t.display();

	}
}
