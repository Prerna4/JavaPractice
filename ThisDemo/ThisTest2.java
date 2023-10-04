package com.thistest.demo;
/*this: to invoke current class method
You may invoke the method of the current class by using the this keyword. 
If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.*/
class A1{
	public void a() {
		System.out.println("Hello a");
	}
	public void b() {
		System.out.println("Hello b");
		this.a();
	}
}
public class ThisTest2 {
	
	public static void main(String[] args) {
		A1 t=new A1();
		t.b();

	}

}
