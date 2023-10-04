package com.abstraction.demo;

abstract class abstraction{
	private int a,b;

	/*
	 * public abstraction(int a, int b) { this.a=a; this.b=b; }
	 */
	public void seta(int a) {
		this.a=a;
	}
	public int geta() {
		return a;
	}
	public void setb(int b) {
		this.b=b;
	}
	public int getb() {
		return b;
	}
	abstract public int add();
}
class A extends abstraction{
	private static int result;
	/*
	 * public A(int a, int b) { super(a, b); }
	 */

	@Override
	public int add() {
		result=geta()+getb();
		return result;
	}


	
	
}
public class abstraction2 {

	public static void main(String[] args) {
		A obj=new A();
		obj.seta(30);
		obj.setb(40);
		
		System.out.println(obj.add());
	}

}
