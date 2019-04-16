package com.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConListToMap {
	
	public static void main(String[] args) {
		
		// Conversion of List to Map
		List<String> l1=new ArrayList<String>();
		
		l1.add("Hello");
		l1.add("Hi");
		l1.add("Everyone");
		
		Map map1=l1.stream().collect(Collectors.toMap(Function.identity(),String::length));
		System.out.println(map1);
		
		// Conversion of Map to List
		Map<String,String> map2=new HashMap<String,String>();
		map2.put("101","Jungle Book");
		map2.put("102", "Hello Now");
		
		System.out.println(map2.keySet());
		System.out.println(map2.values());
		
		/*
		List<String> list1=map2.values().stream().collect(Collectors.toList());
		list1.forEach(System.out::println);
		*/
		
		List<String> list2=new ArrayList<>(map2.keySet());
		List<String> list3=new ArrayList<>(map2.values());
		System.out.println(list2);;
		System.out.println(list3);
		
	}

}


	

