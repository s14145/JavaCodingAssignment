package com.training;

public final class ImmutableClass {
	
	/*
	 * Declaring class as final so that it cannot be extended by any other class
	 * Declaring all fields present as private and final so that it can only accessed within the class and value once assigned to it cannot be changed
	 * Not to include setter method for the fields (variables)
	 * 
	 * 
	 * 
	 */
	
	private final int id;
	private final String name;
	
	public ImmutableClass(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	

}


