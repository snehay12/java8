package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryAndFinal {

	static Predicate<String> p1= Predicate.isEqual("two");
	static Predicate<String> p2= Predicate.isEqual("three");
	
	public static void main(String[] args) {
		
		intermediaryExample();
		finalExample();

	}

	private static void intermediaryExample()
	{
		System.out.println("Inside intermediary example method");
		Stream<String> stream1 = Stream.of("one","two","three","four","five");
		List<String> l1= new ArrayList<>();
		stream1.peek(System.out::println)
		.filter(p1.or(p2))
		.peek(l1::add);
		
		
		System.out.println("The list size is : "+l1.size());
	}
	private static void finalExample()
	{
		System.out.println("\n\nInside  final example method");
		Stream<String> stream1 = Stream.of("one","two","three","four","five");
		List<String> l1= new ArrayList<>();
		stream1.peek(System.out::println)
		.filter(p1.or(p2))
		.forEach(l1::add);
		
		
		System.out.println("The list size is : "+l1.size());
	}
}
