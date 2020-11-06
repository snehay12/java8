package com.lamda.consumers;

import java.util.List;
import java.util.function.BiConsumer;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class BiConsumerDemo {

	private static List<Student> studentList = StudentDatabase.getAllStudents();
	
	/*
	 * Prior java 8 way to print Student name and list of activities
	 */
	private static void legacyPrintStudentNameAndActivities()
	{
		for(Student s: studentList)
			System.out.println(s.getName()+" "+s.getActivities());
	}
	/*
	 * Using Biconsumer to print Student name and list of activities
	 */
	private static void lambadPrintStudentNameAndActivities()
	{
		BiConsumer<String,List<String>> studentNamePrintConsumer=(name,activities)->System.out.println(name+" "+activities);
		
		studentList.forEach(student->studentNamePrintConsumer.accept(student.getName(), student.getActivities()));
	}
	public static void main(String[] args) {
		
		System.out.println("\nPrior Java 8 way to print Student name and activities");
		legacyPrintStudentNameAndActivities();
		System.out.println("\nLambda way to print Student name and activities");
		lambadPrintStudentNameAndActivities();
	}

}
