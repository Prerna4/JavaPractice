package com.collectionDemo;

/*ArrayList and LinkedList
LiinkedList and LinkedHashSet and LinkedHashMap difference*/

//order not maintaining (in ascending order of key)
//accept multiple null value
//not accepting null key
//can enter duplicate values
//override the value for duplicate key(not allowing duplicate key)

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Integer> tr =new TreeMap<Integer, Integer>();
		tr.put(1,10);
		tr.put(5,null);
		tr.put(3,null); //accept multiple null value
		tr.put(2,12);  //not accepting null key
		tr.put(4,12);
		tr.put(4,16); //override the value for key(not allowing duplicate key)
		
		System.out.println(tr); //order not maintaining (in ascending order of key)
		System.out.println("Gives greatest key: "+tr.lastKey());
		System.out.println("Gives entry with highest key: "+tr.lastEntry());
		
		TreeMap<String, Integer> tr1 =new TreeMap<String, Integer>();
		tr1.put("a",2);
		tr1.put("b",4);
		tr1.putIfAbsent("c",6);
		tr1.putIfAbsent("c",2);//will not override the value as 'c' is present a;ready 
		
		System.out.println("TreeMap of tr1:"+tr1);
		int val=tr1.getOrDefault("e", 10); //return the the value if key is there. Or return the specified value if key is nit present
		System.out.println(val);
		
		TreeMap<String, Integer> tr2 =new TreeMap<String, Integer>();
		tr2.put("d", 8);
		tr2.putAll(tr1); //adding bulk entry
		System.out.println("TreeMap of tr2:"+tr2);
		
		tr2.replace("c", 8);
		tr2.replace("d", 8,10);
		System.out.println("TreeMap of tr2 after replace:"+tr2);
		System.out.println(tr2.floorEntry("f")); //return the entry having key less than or equal to the key
		
		System.out.println(tr2.lastKey()); //return last or highest key
		System.out.println(tr2.lastEntry()); //returns last entry in the TreeMap or null if the Map is empty
				
		//keyEet
		//Values
		//entrySet
		//getDefault
		//remove(key)
		//remove(key,value)
		//lastKey()

		//lastEntry()
		
		
		
	}

}
