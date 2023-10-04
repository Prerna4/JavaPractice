package com.abstraction.demo;

abstract class Emp {
	int a;
	abstract public void salary();
	public void facility() {
		//concrete method
	}
}
class PermanantEmp extends Emp{

	@Override//implemented method
	public void salary() {
		System.out.println("basic,HRA,PF,tax");
	}
	public void facility() {
		System.out.println("paid leaves/CL/canteen");
	}
	
}
class ContractEmp extends Emp{

	@Override//implemented method
	public void salary() {
		System.out.println("basic,HRA");
	}
	public void facility() {
		System.out.println("CL/canteen");
	}

}
public class Employee{
	public static void main(String args[]){
		Emp e=new ContractEmp();
		e.salary();
	}
}
