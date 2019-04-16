package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ArraytoAL {
	
	public static void main(String[] ars) {
		
	// Converting arrayList to Array
	List<String> str=new ArrayList<String>();
	str.add("Hello");
	str.add("hi");
	str.add("Everyone");
	System.out.println(str);
	
	String[] string1=str.toArray(new String[str.size()]);
	for(String s:string1) {
		System.out.println(s);
	}
	
	// Converting ArrayList (Integer) to Array
	List<Integer> integer1=new ArrayList<Integer>();
	integer1.add(10);
	integer1.add(20);
	integer1.add(30);
	System.out.println(integer1);
	
	Integer[] integer2=integer1.toArray(new Integer[integer1.size()]);
	for(Integer i:integer2) {
		System.out.println(i);
	}
	
	// Converting array to arrayList
	
	List<Integer> l2=new ArrayList<Integer>();
	l2=Arrays.asList(integer2);
	System.out.println("Conversin of array to arraylist: "+l2);
	
	List<String> l3=new ArrayList<String>();
	l3=Arrays.asList(string1);
	System.out.println("Conversion of string array to arraylist: "+l3);

	
	// Predicate Functional Interface
	Predicate<Integer> predicate=l->l%2 ==1;
	System.out.println(predicate.test(6));
	
	// Function Functional Inteface
	Function<Integer,Integer> function=m->m*m;
	System.out.println(function.apply(6));
	
	// Consumer Functional Interface
	Consumer<String> consumer=c->System.out.println(c);
	consumer.accept("Welcome to Durga soft");
	
	
	// Supplier Functional Interface
	Supplier<String> s=()->{String[] s1= {"sunny","bunny","chinny"};
							int x=(int)(Math.random()*2+1);
							return s1[x];};
		System.out.println(s.get());	
	}
}
	

