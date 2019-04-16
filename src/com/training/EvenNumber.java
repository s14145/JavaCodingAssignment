package com.training;

public class EvenNumber {

	public static void main(String[] args) {
		
		for(int i=0;i<=100;i++) {
			if(i%2 ==0) {
				System.out.println("Even Number is: "+i);
			}else if(i%2 == 1) {
				System.out.println("Odd Number is: "+i);
			}else {
				System.out.println("It is not an even or odd number"+i);
			}
		}

	}

}
