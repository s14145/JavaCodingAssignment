package com.training;

public class Singleton {
	
	/**
	 * 
	 * Declaring constructor as private so that we cannot instantiate object using constructor
	 * creating a static method that returns the object of the singleton class
	 * 
	 * 
	 * 
	 */
	
	private static Singleton singleton_instance=null;
	
	private Singleton() {
		
	};
	
	public static Singleton getInstance() {
		if(singleton_instance == null)
			singleton_instance=new Singleton();
		return singleton_instance;
	}

}
