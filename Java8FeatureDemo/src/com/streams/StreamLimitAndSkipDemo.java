package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitAndSkipDemo {

	private static Optional<Integer>limitDemo(List<Integer> intList)
	{
		return intList.stream()
		.limit(3)
		.reduce((a,b)->a+b);
	}
	
	private static Optional<Integer>skipDemo(List<Integer> intList)
	{
		return intList.stream()
		.skip(3)
		.reduce((a,b)->a+b);
	}
	
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		
		Optional<Integer> limitResult =limitDemo(intList);
		
		System.out.println("Sum by limiting to 3 elements :"+ (limitResult.isPresent()? limitResult.get(): "List is empty"));
		
		Optional<Integer> skipResult =skipDemo(intList);
		
		System.out.println("Sum by skipping 3 elements :"+ (skipResult.isPresent()? skipResult.get(): "List is empty"));

	}

}
