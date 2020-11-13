package com.streams.terminalOperators;

import java.util.List;
import java.util.stream.Collectors;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class StreamMappingCollectorDemo {

	/*
	 * Mapping Collector - apply transformation first and then collects the data in a collection
	 */
	public static void main(String[] args) {
		List<String> studentNames = StudentDatabase.getAllStudents().stream()
		.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		
		System.out.println(studentNames);

	}

}
