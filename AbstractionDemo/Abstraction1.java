package com.abstraction.demo;

abstract class BankAccount{
	private double balance;
	public BankAccount(double balance ) {
		this.balance=balance;
	}
	public abstract void deposit(double damt);
	public abstract void withdraw(double wamt);
	public double getBalance() { 
		return balance; 
	} 
	public void setBalance(double balance){ 
		this.balance=balance; 
	}
	
}

class SavingAccount extends BankAccount{

	public SavingAccount(double balance) {
		super(balance);
	}

	@Override
	public void deposit(double damt) {
		setBalance(getBalance()+damt);
		System.out.println("Deposit of"+" " +damt+ " " +"Successful. Current balance is:"+getBalance());
	}

	@Override
	public void withdraw(double wamt) {
		if(getBalance()>=wamt) {
			setBalance(getBalance()-wamt);
			System.out.println("Withdrawal of"+" " +wamt+" " + "Successful. Current balance is:"+getBalance());
		}
		else {
			System.out.println("Insuffeicient balance.Withdrawal failed");
		}
	}


}
class CurrentAccount extends BankAccount{
	public CurrentAccount(double balance) {
		super(balance);
	}
	@Override
	public void deposit(double damt) {
		setBalance(getBalance()+damt);
		System.out.println("Deposit of"+" " +damt+ " " +"Successful. Current balance is:"+getBalance());
	}

	@Override
	public void withdraw(double wamt) {
		if(getBalance()>=wamt) {
		setBalance(getBalance()-wamt);
		System.out.println("Withdrawal of"+" " +wamt+ " "+"Successful. Current balance is:"+getBalance());
		}
		else {
			System.out.println("Insuffeicient balance.Withdrawal failed");
		}
	}


}


public class Abstraction1 {

	public static void main(String[] args) {
		System.out.print("Saving Account:\n");
		SavingAccount s=new SavingAccount(1000);
		System.out.println("Initial balance is:"+s.getBalance());
		s.deposit(500);
		s.withdraw(500);
		System.out.print("\nCurrent Account:\n");
		CurrentAccount c=new CurrentAccount(2000);
		System.out.println("Initial balance is:"+c.getBalance());
		c.deposit(600);
		c.withdraw(700);
		 
		 
	}

}



