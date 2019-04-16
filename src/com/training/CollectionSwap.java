package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSwap {

	public static void main(String[] args) {
		
		List<String> myList=new ArrayList<String>();
		
		myList.add("Orange");
		myList.add("Apple");
		myList.add("Grape");
		myList.add("Lemon");
		
		System.out.println("Before Swap: "+myList);

		// Swapping index 1 and 3
		Collections.swap(myList, 1, 3);
		
		System.out.println("After Swap: "+myList);
		
		// Reversing Collections
		Collections.reverse(myList);
		
		System.out.println("After reversing the list is: "+myList);
		
		
	}

}
