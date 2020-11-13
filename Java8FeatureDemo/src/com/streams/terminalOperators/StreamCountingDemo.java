package com.streams.terminalOperators;

import java.util.stream.Collectors;

import com.lamda.data.StudentDatabase;

public class StreamCountingDemo {

	/*
	 * Counting - Terminal returns Count of elements in the stream
	 */
	private static Long count()
	{
		return StudentDatabase.getAllStudents().stream()
		.collect(Collectors.counting());
	}
	
	private static Long countWithFilter()
	{
		return StudentDatabase.getAllStudents().stream()
				.filter(s->s.getGpa()>=3.9)
		.collect(Collectors.counting());
	}
	public static void main(String[] args) {
		System.out.println("Total number of Students: "+count());
		
		System.out.println("Total number of Students with GPA>=3.9: "+countWithFilter());

	}

}
