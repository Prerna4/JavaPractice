package com.exceptiondemo;

import java.io.IOException;

class Throws{
	void method() throws IOException{
		throw new IOException("device error");
	}
}
public class ThrowsDemo1 {

	public static void main(String[] args) {
		try {
			Throws obj=new Throws();
			obj.method();
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("Exception handled");
		}
	}

}
