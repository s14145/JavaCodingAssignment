package com.training;

public class CharConStr {

	public static void main(String[] args) {

	// Converting char to String
	char[] Char= {'j','a','s','m'};
	String str=new String(Char);
	System.out.println(str);
	
	// Converting String to Char
	String str1="My Name is hello";
	char[] Char2=str1.toCharArray();
	for(char c:Char2) {
		System.out.println(c);
	}
	
	}
}
