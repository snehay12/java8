package com.streams;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class StreamFilterDemo {

	static List<Student> studetNames;
	public static void main(String[] args) {
		studetNames = StudentDatabase.getAllStudents()
				.stream()
				.collect(toList());

		System.out.print("\n All Students : "+studetNames);
		
		studetNames = StudentDatabase.getAllStudents()
				.stream()
				.filter((s)->s.getGender().equalsIgnoreCase("female"))
				.sorted(Comparator.comparing(Student::getName))
				.collect(toList());

		System.out.print("\n\n All Female Students : "+studetNames);

	}

}
