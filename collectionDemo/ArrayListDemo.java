package com.collectionDemo;

import java.util.ArrayList;
//As ArrayList implements RandomAccess, you can get, set, insert and remove elements of the ArrayList from  any arbitrary position.
//ArrayList is not synchronized. That means, multiple threads can use same ArrayList simultaneously.

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList<String> arrayList=new ArrayList<String>(); //it is maintatin the insertion order
		arrayList.add("aaa");
		//arrayList.add(2);
		arrayList.add("bbb");
		arrayList.add("ccc");
		arrayList.add("ddd");
		arrayList.add("eee");
		arrayList.add("ccc");
		arrayList.add("ddd");
		arrayList.add("ccc");
		arrayList.add("aaa"); // Array is allwing dupliacte data
		
		arrayList.set(4, "aaa");
		arrayList.set(3, "bbb");
		System.out.println("Getting 3th index" + arrayList.get(3));
		arrayList.add(null);
		arrayList.add(null);
	
		System.out.println(arrayList.size());
		arrayList.remove(5);
		System.out.println(arrayList.size());
		System.out.println(arrayList);
		
		
		

	}

}