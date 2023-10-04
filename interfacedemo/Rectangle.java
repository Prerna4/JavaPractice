package com.interfacedemo;

public class Rectangle implements Shape {
	private double len;
	private double breadth;
	
	public Rectangle(double len, double breadth) {
		this.len = len;
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		return len*breadth;
	}

}
