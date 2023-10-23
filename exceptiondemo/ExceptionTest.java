package com.exceptiondemo;

class MyException extends Exception{
	private int ex;
	MyException(int ex){
		this.ex=ex;
	}
	public String toString() {
		return ex+ " " +"is less than zero";
		
	}
}

public class ExceptionTest {
	static void sum(int a,int b) throws MyException {
		if(a<0) {
			throw new MyException(a);
		}
		else {
			System.out.println(a+b);
		}
	}
	
	public static void main(String[] args) {
		try {
			sum(-1,20);
		} catch (MyException e) {
			System.out.println(e);
		}
	}

}
