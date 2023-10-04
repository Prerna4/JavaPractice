package com.abstraction.demo;

abstract class Bird{
	public abstract void fly();
	public abstract void makeSound();
}
 class Eagle extends Bird{

	  public void fly() {
		    System.out.println("Eagle: Flying high.");
		  }

		  @Override
		  public void makeSound() {
		    System.out.println("Eagle: Screech!");
		  }
	 
 }

 class Hawk extends Bird {
	  @Override
	  public void fly() {
	    System.out.println("Hawk: Soaring through the air.");
	  }

	  @Override
	  public void makeSound() {
	    System.out.println("Hawk: Caw!");
	  }
	}
public class Abstraction4 {

	public static void main(String[] args) {
		 Bird e = new Eagle();
		    Bird h = new Hawk();

		    e.fly();
		    e.makeSound();

		    h.fly();
		    h.makeSound();
	}

}
