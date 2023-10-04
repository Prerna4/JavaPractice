package com.abstraction.demo;

abstract class Person{
	public abstract void eat();
	public abstract void exercise();
}
class Athlete extends Person{

	@Override
	public void eat() {
		System.out.println("Athlete:Eating Healthy Food");
	}

	@Override
	public void exercise() {
		System.out.println("Athlete:Exrecise regularly.");
	}
	
}
class LazyPerson extends Person{
	@Override
	public void eat() {
		System.out.println("LazyPerson:Eating Fast Food");
	}

	@Override
	public void exercise() {
		System.out.println("LazyPerson:Exrecise rarely.");
	}
	
}
public class Abstraction3 {

	public static void main(String[] args) {
		Athlete a=new Athlete();
		LazyPerson l=new LazyPerson();
		a.eat();
		a.exercise();
		l.eat();
		l.exercise();
	}

}
