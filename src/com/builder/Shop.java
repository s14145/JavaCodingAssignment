package com.builder;

public class Shop {

	public static void main(String[] args) {
		
		Phone p=new PhoneBuilder().setOs("Windows").setRam(24).getPhone();
		System.out.println(p);

	}

}
