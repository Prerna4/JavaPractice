package com.collectionDemo;

import java.util.LinkedList;
import java.util.List;

//LinkedList is a data structure where each element consist of three things  node - previous add-3-next add
//First one is the reference to previous element, 
//second one is the actual value of the element and last one is the reference to next element.
//The LinkedList class in Java is an implementation of doubly linked list which can be used both as a List as well as Queue.
//LinkedList in java can have any type of elements including null and duplicates
//Elements can be inserted and can be removed from both the ends and can be retrieved from any arbitrary position.
// traverse a data using for loop, enhanced for loop, listIterator, iterator

/*LinkedList implements List,Queue,Serelizable, clonable extends AbstractSequentialList
{
	
}
 add()
 addAll()
 remove()
 set()
 get()
 
 addFirst()
 addlast()
 getFirst()
 getLast()
 removefirst()
 removelast()
 peek() // return head element return
 poll() // remove first element from list
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		
		List <String>linkedList=new LinkedList<String>();
		linkedList.add("First");
		linkedList.add("Second");
		linkedList.add("Third");  
		linkedList.add("Third");
		linkedList.add(null); 
		linkedList.add(null);
		
		
		linkedList.add(1, "Forth");
		linkedList.set(1, "Fifth");
		linkedList.remove(1);
		
	String str=(String) linkedList.get(1);
		
		System.out.println(linkedList);
		
		/*
		 * for(String element : linkedList) { System.out.println(element); }
		 */
		
	}

}
