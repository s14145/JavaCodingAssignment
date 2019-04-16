package com.training;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		Set<String> set=new LinkedHashSet<String>();
		set.add("123");
		set.add("567");
		set.add("908");
		set.add("123");
		
		System.out.println(set);
		
		
	/**
	 * 
	 * Set does not allow duplicates and it does this by following implementation. Internally when you create a 
	 * set then a hashmap gets created with object. When you call add() method in set then internally hashmap put() 
	 * method is getting invoked and element which you add to add becomes the key of the hashmap. We know that hashmap
	 * allow unique key hence if we try to add same element in set then hashmap would perform check if put(Key,value)
	 * is or is not null, if it returns null then it would allow to add element to set otherwise element is not added 
	 * to the set. The first element added to set is retained so second element added will return false and does not
	 * get displayed in the output.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
		
	}

}
