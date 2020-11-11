package com.streams;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class StreamDistinctCountSortedDemo {

	static List<String> studetNames;

	public static void main(String[] args) {
		studetNames = StudentDatabase.getAllStudents()
				.stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct().collect(toList());

		System.out.print("\n Distinct Activities : "+studetNames);

		System.out.print("\n Total Count of Activities : "+
				StudentDatabase.getAllStudents()
				.stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.count());

		studetNames = StudentDatabase.getAllStudents()
				.stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(toList());

		System.out.print("\n Sorted Distinct Activities : "+studetNames);

	}

}
