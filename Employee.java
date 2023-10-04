package com.java.demo.intro;

import java.util.Scanner;

public class Employee {
	private static String name;
	private static float salary;
	private static String jobTitle;
	
	public Employee(String name, String jobTitle, float salary) {
		this.name=name;
		this.jobTitle=jobTitle;
		this.salary=salary;
	}
	
	public void CalculateSalary(float raisePerc ) {
		float raiseAmt=salary*(raisePerc/100);
		salary+=raiseAmt;
		
	}
	public void updateTitle(String jobTitle) {
		this.jobTitle=jobTitle;
	}
	public String display() {
		return "Name: " + name + "\nJob Title: " + jobTitle + "\nSalary: $" + salary;
	}
	
	
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Employee name:");
		name=sc.next();
	    System.out.println("Enter jobTitle:");
	    jobTitle=sc.next();
	    System.out.println("Enter salary:");
	    salary=sc.nextInt();
		
		Employee e=new Employee(name,"Software Testing",50000);
		System.out.println("Initial Information:");
		System.out.println(e.display());
		e.CalculateSalary(10);
		System.out.println("Enter new Title:");
	    String updatedTitle=sc.next();
		e.updateTitle(updatedTitle);
		System.out.println("Updated Information:");
		System.out.println(e.display());
	}

}
