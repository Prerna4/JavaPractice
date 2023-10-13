package com.collectionDemo;

//maintaining order
//not accepting duplicate entries

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> evenNumber=new LinkedHashSet<Integer>();
		// add data
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		evenNumber.add(6);//not accepting duplicate entries
		evenNumber.add(6);
		evenNumber.add(null);//not accepting multiple null
		evenNumber.add(null);   // maintaining order
		System.out.println("LinkedHashSet" + evenNumber);
		
		LinkedHashSet<Integer> numbers=new LinkedHashSet<Integer>();
		//bulk entry
		// Union of Set
		numbers.add(1);

		numbers.add(3);
		numbers.add(5);
		numbers.addAll(evenNumber);
		System.out.println("New LinkedHashSet" +numbers);
		//travrese
		Iterator<Integer> it=numbers.iterator();
		System.out.println("LinkedHashSet Using Iterator");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		// remove
		boolean val=numbers.remove(5);
		System.out.println("Is 5 removes " +val);
		System.out.println("New LinkedHashSet after removing data:" +numbers);
		//all data removed 
		boolean val2=numbers.removeAll(numbers);
		System.out.println("Is all elements are removes " +val2);
		System.out.println("New LinkedHashSet after removing all data:" +numbers);
		
		
		LinkedHashSet<Integer> oddNumber=new LinkedHashSet<Integer>();
		oddNumber.add(1);
		oddNumber.add(3);
		oddNumber.add(5);
		
		
		LinkedHashSet<Integer> evenNumber1=new LinkedHashSet<Integer>();
		
		evenNumber1.add(2);
		evenNumber1.add(4);
		
		LinkedHashSet<Integer> primeNumber=new LinkedHashSet<Integer>();
		
		primeNumber.add(3);
		primeNumber.add(5);
		
		primeNumber.retainAll(oddNumber);
		System.out.println("The Intersection is " +evenNumber1);
		
		//check subset
		boolean check=oddNumber.containsAll(primeNumber);

		System.out.println("Subet:"+check);

		
	}

}
