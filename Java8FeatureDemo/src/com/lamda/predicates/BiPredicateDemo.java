package com.lamda.predicates;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class BiPredicateDemo {

	/*
	 * Get List of Students data to demo predicate and consumers 
	 */
	private  List<Student> studentList = StudentDatabase.getAllStudents();
	
	/*
	 * Predicate to find students in Grade 3 or above
	 */
	private BiPredicate<Integer, Double> studentsWithGPAAndGrade = (grade,gpa)-> grade>=3 && gpa>=3.5;
	
	/*
	 * BiConsumer to print name and activities of students
	 */
	BiConsumer<String,List<String>> studentNamePrintConsumer=(name,activities)->System.out.println(name+" "+activities);
	
	private void printStudentNameAndActivities() {
		studentList.forEach(student -> {
			if (studentsWithGPAAndGrade.test(student.getGrade(), student.getGpa())) {
				studentNamePrintConsumer.accept(student.getName(), student.getActivities());
			}
		});
	}
	public static void main(String[] args) {
		new BiPredicateDemo().printStudentNameAndActivities();
	}

}
