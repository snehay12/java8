package com.lamda.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;
import com.lamda.predicates.PredicateDemo;

public class BiFunctionDemo {

	/*
	 * Get List of Students data to demo predicate and consumers
	 */
	private static List<Student> studentList = StudentDatabase.getAllStudents();

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentBiFunction = (students,
			studentPredicate) -> {
		Map<String, Double> studentGpaMap = new HashMap<String, Double>();
		students.forEach(student -> {
			if (studentPredicate.test(student)) {
				studentGpaMap.put(student.getName(), student.getGpa());
			}
		});
		return studentGpaMap;
	};

	public static void main(String[] args) {
		System.out.println(studentBiFunction.apply(studentList,
				PredicateDemo.gpaThreePredicate.and(PredicateDemo.gradeThreePredicate)));

	}

}
