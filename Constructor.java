package com.java.demo.intro;

public class Constructor {
    int a;
	/*public Constructor() {

			
			System.out.println("no-arg constructor"+ a);
		}*/
		public Constructor(int a)
		{
			System.out.println("Parameterize constructor");
		}
		
		public void display()
		{
			System.out.println("Normal method");
		}

	public static void main(String[] args) {
		Constructor obj=new Constructor(10);
		obj.display();
		// TODO Auto-generated method stub
		

	}

}
