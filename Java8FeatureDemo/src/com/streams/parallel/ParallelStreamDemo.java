package com.streams.parallel;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamDemo {
	
	public static Integer sequentialSum()
	{
		return IntStream.range(1, 100000)
		.sum();
	}
	
	public static Integer parallelSum()
	{
		return IntStream.range(1, 100000)
				.parallel()
				.sum();
	}
	
	public static long checkPerformance(Supplier<Integer> sumSupplier, Integer runTime)
	{
		long startTime = System.currentTimeMillis();
		for(int i=0;i<runTime;i++)
		{
			sumSupplier.get();
		}
		long endTime = System.currentTimeMillis();
		return endTime-startTime;
	}

	public static void main(String[] args) {

		System.out.println("No. of Processors: "+Runtime.getRuntime().availableProcessors());
		
		System.out.println("Sequential Summation time :"+checkPerformance(ParallelStreamDemo::sequentialSum, 20));
		
		System.out.println("Parallel Summation time :"+checkPerformance(ParallelStreamDemo::parallelSum, 20));
	}

}
