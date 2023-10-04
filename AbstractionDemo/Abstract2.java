package com.abstraction.demo;

abstract class Vehicle{
	public abstract void startEngine();
	public abstract void stopEngine();
}
class Car extends Vehicle{

	@Override
	public void startEngine() {
		System.out.println("Car:Start Engine");
	}

	@Override
	public void stopEngine() {
		System.out.println("Car:Stop Engine");
	}
	
}
class Motorcycle extends Vehicle{
	public void startEngine() {
		System.out.println("Motorcycle:Start Engine");
	}

	@Override
	public void stopEngine() {
		System.out.println("motorcycle:Stop Engine");
	}
	
}

public class Abstract2 {
	public static void main(String args[]) {
		Vehicle c=new Car();
		c.startEngine();
		c.stopEngine();
		Vehicle m=new Motorcycle();
		m.startEngine();
		m.stopEngine();
	}
}
