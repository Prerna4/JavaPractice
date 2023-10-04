package com.accessmodifier2;
import com.accessmodifier.*;

public class PublicDemo2 extends ProtectedDemo1 {

	public static void main(String[] args) {
		
		ProtectedDemo1 obj= new ProtectedDemo1();
		//System.out.println(obj.d);
		/*
		 * PublicDemo obj=new PublicDemo(); System.out.println(obj.a); //public variable
		 * 'a' accessible in different package within non child class obj.display();//
		 * method in one package accessible in another package
		 */	
		
		}

}

