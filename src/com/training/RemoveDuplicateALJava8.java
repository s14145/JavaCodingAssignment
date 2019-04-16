package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateALJava8 {

	public static void main(String[] args) {
		
		List<Integer> list1=Arrays.asList(3,5,7,6,9,3,5,8,9,7,0,8,7);
		
		List<Integer> listtwo=list1.stream().distinct().collect(Collectors.toList());
		
		System.out.println(listtwo);
		
		int[] s= {3,5,7,6,8,9};
		int x=(int)(Math.random()*5+1);
		
		System.out.println(s[x]);

	}

}
