package com.training;

public class RandomIntString {
	
	public static void main(String[] args) {
		
		// Way to display random String element
		String[] str1= {"Suresh","Binod","Eliz","Hari"};
		int x=(int)(Math.random()*3+1);
		System.out.println(str1[x]);
		
		// Way to display random int element
		int[] arr= {2,4,6,8,4,5,2};
		int y=(int)(Math.random()*6+1);
		System.out.println(arr[y]);
		
	}

}
