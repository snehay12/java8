package com.lamda;

import java.util.Comparator;

public class CompartorLamdaDemo {

	public static void main(String[] args) {
		/*
		 * Prior Java 8
		 */
		Comparator<Integer> intCompare = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		
		System.out.println("Compare 1 and 2 using old implementation "+intCompare.compare(1, 2));
		
		/*
		 * Typical Lambda expression
		 */
	
		Comparator<Integer> intLambdaCompare= (Integer a, Integer b)-> a.compareTo(b);
		
		System.out.println("Compare 1 and 2 using Lambda "+intLambdaCompare.compare(1, 2));
		
		/*
		 * Typical Lambda expression: Java is smart enough to type case based on what parameters passed
		 */

		Comparator<Integer> intLambdaCompare2= ( a,  b)-> a.compareTo(b);
		
		System.out.println("Compare 1 and 2 using Lambda "+intLambdaCompare2.compare(1, 2));
	}

}
