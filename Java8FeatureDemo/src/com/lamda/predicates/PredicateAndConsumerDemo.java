package com.lamda.predicates;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class PredicateAndConsumerDemo {

	/*
	 * Get List of Students data to demo predicate and consumers 
	 */
	private  List<Student> studentList = StudentDatabase.getAllStudents();
	
	/*
	 * Predicate to find students in Grade 3 or above
	 */
	 Predicate<Student> gradeThreePredicate = (student) -> student.getGrade() >= 3;
	
	/*
	 * Predicate to find students with GPA >= 3.5
	 */
	 Predicate<Student> gpaThreePredicate = (student) -> student.getGpa()>=3.5;
	
	/*
	 * BiConsumer to print name and activities of students
	 */
	BiConsumer<String,List<String>> studentNamePrintConsumer=(name,activities)->System.out.println(name+" "+activities);
	
	private void printStudentsWithConditions()
	{
		studentList.forEach(student -> {
			if(gradeThreePredicate.and(gpaThreePredicate).test(student)){
				studentNamePrintConsumer.accept(student.getName(),student.getActivities());
			}
		}
		)
		;
	}
	public static void main(String[] args) {
		PredicateAndConsumerDemo mainClass = new PredicateAndConsumerDemo();
		mainClass.printStudentsWithConditions();

	}

}
