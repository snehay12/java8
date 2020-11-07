package com.lamda.predicates;

import java.util.List;
import java.util.function.Predicate;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class PredicateDemo {
	
	private static List<Student> studentList = StudentDatabase.getAllStudents();
	
	public static Predicate<Student> gradeThreePredicate = (student) -> student.getGrade() >= 3;
	
	public static Predicate<Student> gpaThreePredicate = (student) -> student.getGpa()>=3.5;
	
	private static void lambdaPrintStudentsWithCondition()
	{	
		studentList.forEach(student -> {
			if (gradeThreePredicate.test(student))
				System.out.println(student);
		});
	}
	
	private static void lambdaPrintStudentsWithConditions()
	{	
		studentList.forEach(student -> {
			if (gradeThreePredicate.and(gpaThreePredicate).test(student))
				System.out.println(student);
		});
	}

	public static void main(String[] args) {
		System.out.println("Print Students with Grade level 3 and above using Predicate");
		lambdaPrintStudentsWithCondition();
		System.out.println("\nPrint Students with Grade level >=3 and GPA>=3.5 using Predicate");
		lambdaPrintStudentsWithConditions();
	}

}
