package com.Inheritance.lab;
class Animal2{
	void eat() {
		System.out.println("eating....");
	}
}
class Dog extends Animal2{
	void bark() {
		System.out.println("barking....");
	}
}
class BabyDog extends Dog{
	void weep() {
		System.out.println("weeping....");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		BabyDog b=new BabyDog();
		b.eat();
		b.bark();
		b.weep();
		// TODO Auto-generated method stub

	}

}
