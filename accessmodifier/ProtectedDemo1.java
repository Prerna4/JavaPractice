package com.accessmodifier;

public class ProtectedDemo1 {
	protected int d=10;
	public static void main(String[] args) {
		D obj=new D();
		obj.display();
	}

}
class D extends ProtectedDemo1{
	void display() {
		System.out.print(d);//protected accessible in same package and in child class in different package
	}
}
