package com.streams;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamDemo {

	private static Integer sumOfInteger(List<Integer> intList)
	{
		return intList.stream()
				.reduce(0, (x,y)->x+y);
	}
	
	private static Integer sumOfIntegerUsingIntStream()
	{
		return IntStream.rangeClosed(1, 5).sum();
	}
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5);

		System.out.println("Regular summation using reduce: "+sumOfInteger(intList));
		
		System.out.println("Regular summation using IntStrea: "+sumOfIntegerUsingIntStream());
		
		System.out.println("IntStream max(1-50): "+IntStream.rangeClosed(1, 50).max());
		
		System.out.println("LongStream min(10-50): "+LongStream.rangeClosed(10, 50).min());
		
		System.out.println("IntStream average(10-50): "+IntStream.rangeClosed(10, 50).average());
		
		System.out.println("MapToObj "+IntStream.rangeClosed(1, 10).mapToObj((i)->new Integer(i)).collect(toList()));
		
		System.out.println("MapToLong "+IntStream.rangeClosed(1, 10).mapToLong((i)->i).sum());
		
		System.out.println("MapToDouble "+IntStream.rangeClosed(1, 5).mapToLong((i)->i).sum());
	}

}
