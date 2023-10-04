package com.interfacedemo;

public class Mainclass {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(10, 20);
		Circle c=new Circle(10);
		Triangle t=new Triangle(10, 30);
		
		System.out.println("Area of Rectangle:"+r.getArea());
		System.out.println("Area of Triangle:"+t.getArea());
		System.out.println("Area of Circle:"+c.getArea());
	}

}
