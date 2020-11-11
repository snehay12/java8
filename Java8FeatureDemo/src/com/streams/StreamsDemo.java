package com.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class StreamsDemo {

	public static void main(String[] args) {
		List<Student> studentList= StudentDatabase.getAllStudents();
		
		Map<String, List<String>> studentMap=
				studentList.stream()
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println("List of all Students \n\n"+studentMap);
		
		Map<String, List<String>> studentMapWithFilter=
				studentList.stream()
				.filter((s)->s.getGrade()>=3)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println("\n\nList of Students in Grade>= 3 \n\n"+studentMapWithFilter);
		
		Map<String, List<String>> studentMapWithFilters=
				studentList.stream()
				.filter((s)->s.getGrade()>=3)
				.filter((s)->s.getGpa()>=3.9)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println("\n\nList of Students in Grade>= 3 and GPA>=3.9 \n\n"+studentMapWithFilters);
 	}
}
