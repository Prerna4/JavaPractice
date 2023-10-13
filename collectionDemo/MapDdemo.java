package com.collectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//map does not extends collection
//Hash Map gives output in ascending order of keys(not maintaining insertion order)
//Hash Map basic capacity is 8
//If the optional parameter not used, then the default capacity will be 16
//and the default load factor will be 0.6

public class MapDdemo {

	public static void main(String[] args) {
		Map <Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(1, 1); //accept data in key and value pair
		map.put(4, 20); //multiple duplicate values are allowed
		map.put(1, 2); //override the value for key
		map.put(3, 20);
		map.put(2, 10);
		map.put(null, 1); //can have only one null key
		map.put(5, null); //can have multiple null value
		System.out.print(map);
		//gives output in ascending order of key :{null=1, 1=2, 2=10, 3=20, 4=20, 5=null}
		
		int value=map.get(1);
		System.out.println(value);
		
		System.out.println(map.keySet());//provide set of key
		System.out.println(map.values());//provide set of values

		System.out.println(map.entrySet());//provide total set
		
		System.out.println(map.remove(5));
		System.out.println(map);
		
		//enhanced for
		for(Integer key: map.keySet()) {
			System.out.println(key);

		}
		System.out.println();
		for(Integer val: map.values()) {
			System.out.println(val);
		}
		System.out.println();
		
		for(Entry<Integer, Integer> entry: map.entrySet()) {
			System.out.println(entry);

		}


		
	}

}
