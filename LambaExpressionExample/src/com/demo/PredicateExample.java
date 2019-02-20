package com.demo;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExample {
	
	
	
	private static void forEachEx()
	{
		Stream<String> stream = Stream.of("one","two","three","four");
		System.out.println(" Stream with for each ");
		stream.forEach(System.out::println);
	}
	
	private static void predicateChain()
	{
		System.out.println("\n\n Stream with predicate chaining");
		Stream<String> stream3 = Stream.of("one","two","three","four");
		Predicate<String> checkTwo= Predicate.isEqual("two");
		Predicate<String> checkThree= Predicate.isEqual("three");
		stream3.filter(checkTwo.or(checkThree)).forEach(System.out::println);
	}

	public static void main(String[] args) {
		forEachEx();
		
		predicateChain();
		
		
	}

}
