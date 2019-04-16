package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateinArrayList {
	
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
		
		Set<T> set=new LinkedHashSet<T>();
		
		set.addAll(list);
		
		list.clear();
		
		list.addAll(set);
		
		return list;
	}
	

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(2,5,6,2,8,9,7,6,5,4,7,8,3,3,3));
		
		ArrayList<Integer> listThree=removeDuplicates(list);
		
		System.out.println(listThree);

	}

}
