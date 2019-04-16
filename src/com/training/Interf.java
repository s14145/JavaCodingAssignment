package com.training;

@FunctionalInterface
public interface Interf {

	
	default void m1() {
		System.out.println("Hello");
	};
	void m2();
}

