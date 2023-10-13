package com.collectionDemo;

enum Directions{
	EAST,
	WEST,
	NORTH,
	SOUTH,
}
public class EnumDemo {

	public static void main(String[] args) {
		for(Directions dir :Directions.values()) {
			System.out.println(dir);
		}
		Directions dir1=Directions.NORTH;
		if(dir1==Directions.EAST) {
			System.out.println("Directions EAST");
		}
		if(dir1==Directions.WEST) {
			System.out.println("Directions WEST");
		}
		if(dir1==Directions.SOUTH) {
			System.out.println("Directions SOUTH");
		}
		else {
			System.out.println("Directions NORTH");
		}
	}

}
