package com.training;

public class ReverseString {
	
	public static void main(String[] args) {
		
		/*
		String input="ComeOn";
		
		StringBuilder input1=new StringBuilder();
		
		input1.append(input);
		
		input1=input1.reverse();
		
		System.out.println(input1);
		*/
		
		String input="ComeOn";
		
		char[] try1=input.toCharArray();
		
		for(int i=try1.length-1;i>=0;i--) {
			System.out.print(try1[i]);
		}
		
		
		int num=1234;
		
		int reversed=0;
		
		while(num != 0) {
			int digit = num % 10;
			reversed= reversed * 10 +digit;
			num /=10;
		}
		
		System.out.println(reversed);
	}

}
