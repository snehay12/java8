package com.streams;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;
import static java.util.stream.Collectors.toList;

import java.util.List;
public class StreamMapDemo {

	public static void main(String[] args) {
		
		List<String> studetNames = StudentDatabase.getAllStudents()
		.stream()
		.map(Student::getName)
		.collect(toList());
		
		System.out.print(studetNames);
		
		studetNames=StudentDatabase.getAllStudents()
				.stream()
				.map(Student::getName)
				.map(String::toUpperCase)
				.collect(toList());
		
		System.out.print(studetNames);
	}

}
