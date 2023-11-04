package com.collectionlab;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo {

	public static void main(String[] args) {
		List <String>linkedList=new LinkedList<String>();
		linkedList.add("Prerna");
		linkedList.add("Swapnil");
		linkedList.add("Renuka");
		linkedList.add("Dhanashri");
		linkedList.add("Gauri");
		System.out.println("First Element is:"+linkedList.getFirst());
		System.out.println("Last Element is:"+linkedList.getLast());
	}

}
