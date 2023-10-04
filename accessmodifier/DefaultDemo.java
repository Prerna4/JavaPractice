package com.accessmodifier;

class B{
	int num=10; //default variable
}
class C {
	void display() {
	B b=new B();
	System.out.println(b.num); //accessible anywhere within same package, not outside the package
	}
}
public class DefaultDemo {

	public static void main(String[] args) {
		C obj=new C();
		obj.display();
	}

}
