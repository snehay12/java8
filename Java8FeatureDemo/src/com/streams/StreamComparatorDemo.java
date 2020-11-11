package com.streams;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class StreamComparatorDemo {

	static List<Student> studetNames;
	public static void main(String[] args) {
		studetNames = StudentDatabase.getAllStudents()
				.stream()
				.collect(toList());

		System.out.print("\n Before Sorting : "+studetNames);
		
		studetNames = StudentDatabase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getName))
				.collect(toList());

		System.out.print("\n\n Student sorted by Name : "+studetNames);
		
		studetNames = StudentDatabase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getGpa))
				.collect(toList());

		System.out.print("\n\n Student sorted by GPA(Asc): "+studetNames);
		
		studetNames = StudentDatabase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(toList());

		System.out.print("\n\n Student sorted by GPA(Desc): "+studetNames);

	}

}
