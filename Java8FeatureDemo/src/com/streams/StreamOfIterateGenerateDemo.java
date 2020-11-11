package com.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamOfIterateGenerateDemo {

	public static void main(String[] args) {
		Stream<String> nameStream = Stream.of("Adam","Eve","Jenny","Dan");
		
		System.out.println("List of Names: ");
		nameStream.forEach(System.out::println);
		
		System.out.println("Iterate 10 Integer: ");
		Stream.iterate(1,x->x*2)
		.limit(5)
		.forEach(System.out::println);
		
		System.out.println("Generate 10 Random Integer: ");
		Stream.generate(new Random()::nextInt)
		.limit(5)
		.forEach(System.out::println);


	}

}
