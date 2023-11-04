package com.collectionlab;

import java.util.ArrayList;
import java.util.Collections;

public class SortedArraylist {

	public static void main(String[] args) {
		ArrayList <String> ar=new ArrayList<String>();
		ar.add("Red");
		ar.add("Green");
		ar.add("Black");
		ar.add("Blue");
		ar.add("White");
		
		System.out.println("List before sort:"+ar);
		Collections.sort(ar);
		System.out.println("List after sort:"+ar);
	}

}
