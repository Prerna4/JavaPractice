package com.accessmodifier;

class A{
	private int rollNo=101;
	void display() {
		System.out.println(rollNo); //accessible only within same class
	}
}

public class PrivateDemo {

	public static void main(String[] args) {
		A obj=new A();
		//System.out.println(obj.rollNo); //compile time error(private variable rollNo is not accessible in another class)
		obj.display();
	}

}
