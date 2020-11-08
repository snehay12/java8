package com.lamda;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryDemo {
	
	static UnaryOperator<String> capitalizeString = (firstName)-> {return firstName.toUpperCase();};
	
	static BinaryOperator<Integer> multipyInteger = (a, b)->{return a*b;};
	
	static Comparator<Integer> integerComparator = (a, b)-> a.compareTo(b);
	
	static BinaryOperator<Integer> maxInteger = BinaryOperator.maxBy(integerComparator);
	
	static BinaryOperator<Integer> minInteger = BinaryOperator.minBy(integerComparator);
	

	public static void main(String[] args) {
		
		System.out.println(capitalizeString.apply("java8"));
		
		System.out.println(multipyInteger.apply(10,3));
		
		System.out.println(maxInteger.apply(10,3));
		
		System.out.println(minInteger.apply(10,3));

	}

}
