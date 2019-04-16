package com.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintMap {

	public static void main(String[] args) {
		Map<String,String> map1=new HashMap<>();
		
		map1.put("1","Hello");
		map1.put("2", "Hi");
		
		Set<Entry<String,String>> hashset=map1.entrySet();
		for(Entry entry:hashset) {
			System.out.println(entry.getKey()+","+entry.getValue());
		}
	}

	}


