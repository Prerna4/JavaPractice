package com.collectionDemo;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		 
        list.add("FIRST");
 
        list.add("SECOND");
 
        list.add("THIRD");
 
        //Traversing list elements in forward direction using Iterator
 
        Iterator<String> iterator = list.iterator();
 
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
 
        //Traversing list elements in forward direction using ListIterator
 
        ListIterator<String> listIterator = list.listIterator();
 
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
 
 
        //Traversing list elements in backward direction using ListIterator
 
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
	}

}

