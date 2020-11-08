package com.lamda.methodReference;

import java.util.List;
import java.util.function.Consumer;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class ConsumerMethodRefDemo {

	static Consumer<Student> printStudentDetails = System.out::println;
	
	static Consumer<Student> printStudentActivities = Student::printListOfActivities;
	
	public static void main(String s[])
	{
		List<Student> listOfStudents = StudentDatabase.getAllStudents();
		
		System.out.println("Student details: \n");
		listOfStudents.forEach(printStudentDetails);
		
		System.out.println("\nStudents Activities: \n");
		listOfStudents.forEach(printStudentActivities);
	}
}
