package com.collectionlab;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Red");
		hs.add("Green");
		hs.add("Black");
		hs.add("Blue");
		hs.add("White");
		
		Iterator<String> i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
