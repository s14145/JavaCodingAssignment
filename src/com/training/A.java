package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class A{
	
	public static void main(String[] args) {
		
		Interf i=new Interf() {
			public void m1() {
				System.out.println("Hello m1");
			}
			public void m2() {
				System.out.println("Hello m2");
			}
		};
		i.m1();
		i.m2();
		
		List<Integer> numbers=Arrays.asList(1,2,3,4);
		List<Integer> evenNumber=numbers.stream().filter(n->n%2 == 0).collect(Collectors.toList());
		evenNumber.forEach(System.out::println);
		
		List<Integer> num=Arrays.asList(2,3,4,5,6);
		Integer usingReduce=num.stream().reduce(0,(a,b)->a+b);
		System.out.println(usingReduce);
		
		Integer[] arr=new Integer[] {1,2,3,4,5};
		System.out.println("Arrays is: "+Arrays.toString(arr));
		
		Predicate<Integer> p=j->j%2 ==0;
		System.out.println(p.test(4));
		
		Function<Integer,Integer> function=k->k*k;
		System.out.println(function.apply(3));
		
		Consumer<String> consumer=s->System.out.println(s);
		consumer.accept("Hello");
		
	}
}
