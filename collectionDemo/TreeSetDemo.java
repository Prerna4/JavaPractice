package com.collectionDemo;

////gives output in ascending order of key(not maintaining insertion order)

import java.util.LinkedHashSet;

//not maintaining order
//not accepting duplicate entries
//not accepting null

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> tset=new TreeSet<Integer>();
	
		tset.add(4);
		tset.add(2);
		tset.add(6);
		tset.add(6);//not accepting duplicate entries
		tset.add(6); // not maintaining order
		System.out.println("TreeSet" + tset);
		
		//evenNumber.add(null);//not accepting multiple null
		
		//remove bulk data
		tset.removeAll(tset);
		System.out.println("TreeSet tset After removing Data:" + tset);
		
		LinkedHashSet<Integer> numbers=new LinkedHashSet<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		
		//add bulk data
		tset.addAll(numbers);
		System.out.println("TreeSet tset After adding Data:" + tset);
		
		numbers.add(7);
		numbers.add(9);
		System.out.println("TreeSet numbers After adding Data:" + numbers);
		
		tset.retainAll(tset);
		System.out.println("Intersection of TreeSet:" + tset);
		
		boolean check=numbers.containsAll(tset);
		System.out.println("Subset:"+check);
		
		
		
		
		
		
	}

}
