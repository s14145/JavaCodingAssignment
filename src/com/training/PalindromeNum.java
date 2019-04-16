package com.training;

public class PalindromeNum {

	public static void main(String[] args) {
		
		int n=454;
		int sum=0;
		int r;
		int temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		n=temp;
		if(n == sum) {
			System.out.println(n+" is a Palindrome number");
		}else {
			System.out.println(n+" is not a Palindrome number");
		}

	}

}
