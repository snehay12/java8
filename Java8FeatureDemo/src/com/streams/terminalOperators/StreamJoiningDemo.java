package com.streams.terminalOperators;

import java.util.List;
import java.util.stream.Collectors;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class StreamJoiningDemo {

	/*
	 * Joining - Performs String Concatenation
	 * 
	 * Its has three method overload which is illustrated below
	 * 
	 */
	private static String joiningStudentNames(List<Student> studentList)
	{
		return studentList.stream()
		.map(Student::getName)
		.collect(Collectors.joining());
	}
	private static String joiningStudentNamesWithDelimiters(List<Student> studentList)
	{
		return studentList.stream()
		.map(Student::getName)
		.collect(Collectors.joining("-"));
	}
	
	private static String joiningStudentNamesWithDelimitersAndPrefix(List<Student> studentList)
	{
		return studentList.stream()
		.map(Student::getName)
		.collect(Collectors.joining("-","(",")"));
	}
	public static void main(String[] args) {
	
		List<Student> studentList = StudentDatabase.getAllStudents();

		System.out.println("Joining Student Name without any delimiters: "+joiningStudentNames(studentList));
		
		System.out.println("Joining Student Name with '-' delimiter: "+joiningStudentNamesWithDelimiters(studentList));
		
		System.out.println("Joining Student Name with delimiter, prefix and suffix: "+joiningStudentNamesWithDelimitersAndPrefix(studentList));
	}

}
