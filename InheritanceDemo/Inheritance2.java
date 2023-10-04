package com.Inheritance.lab;

class Employee{
	float salary;
	public Employee(float salary) {
		this.salary=salary;
	}
	void work() {
		System.out.println("working as an employee");
		
	}
	float getsalary() {
		return salary;
	}
}
class HRManager extends Employee{
	public HRManager(float salary) {
		super(salary);
	}
	void work() {
		System.out.println("working as Manager");
	}
	void addEmployee(){
		System.out.println("Adding employee..");
	}
}

public class Inheritance2 {
	public static void main(String args[] ){
		Employee e=new Employee(50000);
		HRManager h=new HRManager(60000);
		e.work();
		System.out.println("Salary of Employee is:"+e.getsalary());
		h.work();
		System.out.println("Salary of HRManager  is:"+h.getsalary());
		h.addEmployee();
	}
}
