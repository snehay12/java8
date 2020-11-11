package com.streams;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class StreamFlatMapDemo {

	public static void main(String[] args) {
		List<String> studetNames=StudentDatabase.getAllStudents()
				.stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.collect(toList());
		
		System.out.print(studetNames);
	}

}
