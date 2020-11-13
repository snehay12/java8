package com.streams.parallel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamLimitationDemo {
	
	public static int sequentialSum(List<Integer> inputList)
	{
		long startTime = System.currentTimeMillis();
		int sum = inputList.stream()
					.reduce(0, (x,y)->x+y);
		long endTime = System.currentTimeMillis();
		System.out.println("Sequential summation duration: "+(endTime-startTime));
		return sum;
	}
	
	public static int parallelSum(List<Integer> inputList)
	{
		long startTime = System.currentTimeMillis();
		int sum = inputList.parallelStream()
					.reduce(0, (x,y)->x+y); //Unboxing impacts the parallel stream performance and takes more time
		long endTime = System.currentTimeMillis();
		System.out.println("Parallel summation duration: "+(endTime-startTime));
		return sum;
	}


	public static void main(String[] args) {
		List<Integer> intList = IntStream.range(1, 100000)
										.boxed()
										.collect(Collectors.toList());
		
		sequentialSum(intList);
		
		parallelSum(intList);
	}

}
