package com.streams.terminalOperators;

import java.util.stream.Collectors;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class StreamSumAvgDemo {

	/*
	 * Summing Collector return the sum of the collectors
	 * Averaging Collector returns the avg of the collected elements
	 * 
	 * Its available in Int,Long and Double
	 */
	
	private static Integer totalNumOfNoteBoox()
	{
		return StudentDatabase.getAllStudents()
				.stream()
				.collect(Collectors.summingInt(Student::getNoteBooks));
	}
	
	private static Double totalAvgOfGPA()
	{
		return StudentDatabase.getAllStudents()
				.stream()
				.collect(Collectors.averagingDouble(Student::getGpa));
	}
	public static void main(String[] args) {

		System.out.println("Sum of Note Books: "+totalNumOfNoteBoox());
		
		System.out.println("Avg Student GPA: "+totalAvgOfGPA());
		
	}

}
