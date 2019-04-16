package com.abstractfactory;

public class Dummy {

	private int id;
	private String name;
	
	
	
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null || this.getClass() != o.getClass())
			return false;
		
		Dummy dummy=(Dummy) o;
		return (dummy.name.equals(this.name)&& dummy.id == this.id);
					
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
	
}
