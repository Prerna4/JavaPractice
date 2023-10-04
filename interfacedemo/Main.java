package com.interfacedemo;

interface Resizable{
	void resizeWidth(int w);
	void resizwHeight(int h);
	void display();
}

class Rect implements Resizable{
	private int h,w;
	public Rect(int h,int w) {
		this.h=h;
		this.w=w;
	}
	@Override
	public void resizeWidth(int w) {
		this.w=w;
	}

	@Override
	public void resizwHeight(int h) {
		this.h=h;
	}
	
	public void display() {
		System.out.println("width:"+w+" "+ "height:"+h);
	}
	
}

public class Main {

	public static void main(String[] args) {
		Resizable r=new Rect(10,20);
		r.display();
		r.resizeWidth(5);
		r.resizwHeight(15);
		r.display();
	}

}
