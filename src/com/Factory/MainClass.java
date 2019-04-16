package com.Factory;

public class MainClass {

	public static void main(String[] args) {
		FactoryClass fc=new FactoryClass();
		OS obj=fc.getOS("Hello");
		obj.spec();
	}

}
