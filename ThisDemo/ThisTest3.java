package com.thistest.demo;

/*class A3{

	A3(){
		this(5);
		System.out.println("Hello a3");
	}
	A3(int a){
		System.out.println(a);
	}
}

public class ThisTest3 {

	public static void main(String[] args) {
		A3 obj=new A3();
	}

}*/

//Reusing one constructor in another
class Student{
	String name;
	int roll;
	float fees;
	Student(int roll, String name){
		this.name=name;
		this.roll=roll;
	}
	Student(int roll, String name, float fees){
		this( roll,name);
		this.fees=fees;
		this.fees=fees;
	}
	void display() {
		System.out.println("name:"+name+"\nroll:"+roll+"\nfees"+fees);
	}
}

public class ThisTest3 {

	public static void main(String[] args) {
		Student s1=new Student(1,"aaa");
		Student s2=new Student(1,"aaa",5000f);
		s1.display();
		s2.display();
		
	}

}