package com.interfacedemo;

public class Triangle implements Shape {
	private double height,base;
	
	public Triangle(double height, double base) {
		super();
		this.height = height;
		this.base = base;
	}

	@Override
	public double getArea() {
		return 0.5*height*base;
	}

}
