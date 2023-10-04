package com.Inheritance.lab;

class BankAccount{
	private float bal;
	public BankAccount(float bal) {
		this.bal=bal;
	}
	void deposit(float amt) {
		bal=bal+amt;
	}
	void withdraw(float amt) {
		if(bal>=amt) {
			bal=bal-amt;
		}
		else {
			System.out.println("Balance is not sufficient");
		}
	}
	float getbalance() {
		return bal;
	}
}
class SavingAccount extends BankAccount{
	public SavingAccount(float amt) {
		super(amt);
	}
	void withdraw(float amt) {
		if(getbalance() -amt<100) {
			System.out.println("Minimum balace should be 100");
		}
		else {
			super.withdraw(amt);
		}
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		System.out.println("Initial Balance is 600");
		BankAccount b=new BankAccount(600);
		System.out.println("Deposite 1000 to account:");
		b.deposit(1000);
		System.out.println("New Balance after depositing:"+b.getbalance());
		System.out.println("withdraw 600:");
		b.withdraw(600);
		System.out.println("New Balance after withdrawing:"+b.getbalance());
		System.out.println("Initial Balance is 300");
		BankAccount s=new SavingAccount(300);
		System.out.println("trying to withdraw 100:");
		s.withdraw(100);
		System.out.println("Balance after withdrawing:"+s.getbalance());
		
		

	}

}
