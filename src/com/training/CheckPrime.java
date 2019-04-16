package com.training;

public class CheckPrime {
	
	

	public static void main(String[] args) {
		int n=4;
		boolean flag=false;
		
		for(int i=2;i<n;i++) {
			if(n%i ==0)
				flag=false;
			break;
		}
	 
	if(!flag) {
		System.out.println(n+" is a prime number");
	}else {
		System.out.println(n+" is not a prime number");
	}
		
	}
}


