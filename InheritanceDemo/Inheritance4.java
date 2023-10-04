package com.Inheritance.lab;

abstract class Vehicle{
    private String make,model,fuelType;
    private int year;
    public double fuelEfficiency;
	public Vehicle(String make, String model, String fuelType, int year, double fuelEfficiency) {
		this.make = make;
		this.model = model;
		this.fuelType = fuelType;
		this.year = year;
		this.fuelEfficiency = fuelEfficiency;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getFuelType() {
		return fuelType;
	}
	public int getYear() {
		return year;
	}
	abstract public double calFuelEfficiency();
	abstract public double calDistanceTravelled();
	abstract public double calMaxSpeed();
    
}
class Truck extends Vehicle{
	private double cargocapacity;
	public Truck(String make, String model, String fuelType, int year, double fuelEfficiency,double cargocapacity) {
		super(make, model, fuelType, year, fuelEfficiency);
		this.cargocapacity=cargocapacity; 
	}
	
	
		public double calFuelEfficiency(){
			return fuelEfficiency*(1.0 / (1.0 + (cargocapacity / 1000.0)));
		}
		public double calDistanceTravelled(){
			return calFuelEfficiency() * fuelEfficiency;
		}
		public double calMaxSpeed(){
			return 80.0;
		}
		
	
}
class Car extends Vehicle{
	 private int numSeats;
	public Car(String make, String model, String fuelType, int year, double fuelEfficiency,int numSeats) {
		super(make, model, fuelType, year, fuelEfficiency);
		this.numSeats=numSeats;
	}
	public double calFuelEfficiency(){
		return fuelEfficiency * (1.0 / (1.0 + (numSeats / 5.0)));
	}
	public double calDistanceTravelled(){
		return calFuelEfficiency() * fuelEfficiency;
	}
	public double calMaxSpeed(){
		return 120;
	}
	
}
class Motorcycle extends Vehicle{
	public Motorcycle(String make, String model, String fuelType, int year, double fuelEfficiency ) {
		super(make, model, fuelType, year, fuelEfficiency);
	}
	public double calFuelEfficiency(){
		return fuelEfficiency;
	}
	public double calDistanceTravelled(){
		return calFuelEfficiency() * fuelEfficiency;
	}
	public double calMaxSpeed(){
		return 80;
	}
	
}

public class Inheritance4 {

	public static void main(String[] args) {
		Truck t=new Truck("Tatra", "Tatra 810 4x4","GASOLINE", 2020, 8.112, 4.5);
		Car c = new Car("Volkswagen", "Virtus", "HYBRID",2019,  6.123, 8);
		Motorcycle m = new Motorcycle("Massimo Motor", "Warrior200", "GASOLINE",2018,  2.1);
		
		System.out.println("Truck model :"+t.getModel());
		System.out.println("Fuel efficiency for truck :"+t.calFuelEfficiency());
		System.out.println("Distance Traveled :"+t.calDistanceTravelled());
		System.out.println("Maximum Speed :"+t.calMaxSpeed()+"\n");
		
		System.out.println("Car model :"+c.getModel());
		System.out.println("Fuel efficiency for Car :"+c.calFuelEfficiency());
		System.out.println("Distance Traveled :"+c.calDistanceTravelled());
		System.out.println("Maximum Speed :"+c.calMaxSpeed()+"\n");
		
		System.out.println("Motocycle model :"+m.getModel());
		System.out.println("Fuel efficiency for Motorcycle :"+m.calFuelEfficiency());
		System.out.println("Distance Traveled :"+m.calDistanceTravelled());
		System.out.println("Maximum Speed :"+m.calMaxSpeed());
	}

}
