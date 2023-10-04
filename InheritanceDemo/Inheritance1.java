package com.Inheritance.lab;


class Animal{
	void makeSound() {
		
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("bark");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		Animal a=new Cat();
		a.makeSound();
	}

}
