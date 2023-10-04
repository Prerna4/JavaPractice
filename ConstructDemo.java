package com.java.demo.intro;

public class ConstructDemo {
	public ConstructDemo()  // no-argconstructor 
	{
		System.out.println("default");
	}
	// parameterize constructor
	public ConstructDemo(int a,int b) //parameters list
	{
		System.out.println(a+b);
	}
	public ConstructDemo(int m,int z,int k)
	{
		System.out.println(m+z+k);
	}
	public ConstructDemo(int m)
	{
		System.out.println(m*m);
	}
	public ConstructDemo(int m,float z,int k)
	{
		System.out.println(m*z*k);
	}

	public static void main(String[] args) {
		ConstructDemo cd=new ConstructDemo(5,8.5f,10); //arguments list
		
		
	}

}
