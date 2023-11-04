package com.collectionlab;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> tset=new TreeSet<Integer>();
		tset.add(4);
		tset.add(2);
		tset.add(6);
		tset.add(7);
		tset.add(10);
		tset.add(12);
		tset.add(8);
		tset.add(1);
		tset.add(5);
		
		System.out.println("Numbers less than 7 are:");
		TreeSet<Integer> treeheadset=new TreeSet<Integer>();
		treeheadset = (TreeSet)tset.headSet(7); 
		
		Iterator i=treeheadset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
