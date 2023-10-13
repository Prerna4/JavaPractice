package com.collectionDemo;

//not maintaining order
//not accepting duplicate entries

import java.util.HashSet;


public class HashSetDemo2 {
	public static void main (String args[]) {
	HashSet<Integer> oddNumber=new HashSet<Integer>();
	oddNumber.add(1);
	oddNumber.add(3);
	oddNumber.add(5);
	
	
	HashSet<Integer> evenNumber1=new HashSet<Integer>();
	// add data
	evenNumber1.add(2);
	evenNumber1.add(4);
	System.out.println("HasSet" + evenNumber1);
	
	HashSet<Integer> primeNumber=new HashSet<Integer>();
	
	primeNumber.add(3);
	primeNumber.add(5);
	
	//Difference of Sets
	primeNumber.removeAll(oddNumber);
	System.out.println(primeNumber);
	//intersection of sets
	evenNumber1.retainAll(primeNumber);
	System.out.println("The Intersection is " +evenNumber1);
	
	//check subset or not
	boolean check=oddNumber.containsAll(primeNumber);
	System.out.println(check);
	}
}

