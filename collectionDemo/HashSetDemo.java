package com.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> evenNumber=new HashSet<Integer>();
		// add data
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		evenNumber.add(6);//not accepting duplicate entries
		evenNumber.add(6);
		evenNumber.add(null);//not accepting multiple null
		evenNumber.add(null);//not maintainig order
		System.out.println("HasSet" + evenNumber);
		
		HashSet<Integer> numbers=new HashSet<Integer>();
		//bulk entry
		// Union of Set
		numbers.add(1);

		numbers.add(3);
		numbers.add(5);
		numbers.addAll(evenNumber);
		System.out.println("New HashSet" +numbers);
		//travrese
		Iterator<Integer> it=numbers.iterator();
		System.out.println("HasSet Using Iterator");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		// remove
		boolean val=numbers.remove(5);
		System.out.println("Is 5 removes " +val);
		//all data removed 
		boolean val2=numbers.removeAll(numbers);
		System.out.println("Is all elements are removes " +val2);
		
		
		
		
		
		
		
	}

}