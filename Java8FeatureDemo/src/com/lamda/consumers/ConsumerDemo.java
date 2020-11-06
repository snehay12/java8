package com.lamda.consumers;

import java.util.List;
import java.util.function.Consumer;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class ConsumerDemo {
	
	private static List<Student> studentList = StudentDatabase.getAllStudents();
	
	/*
	 * Prior java 8 way to print Student object
	 */
	private static void legacyPrintStudentName()
	{
		for(Student s: studentList)
			System.out.println(s);
	}
	/*
	 * Using consumer to print Student object
	 */
	private static void lambadPrintStudentName()
	{
		Consumer<Student> studentPrintConsumer=(student)->System.out.println(student);
		studentList.forEach(studentPrintConsumer);
	}
	/*
	 * Prior java 8 way to print Student name and list of activities
	 */
	private static void legacyPrintStudentNameAndActivities()
	{
		for(Student s: studentList)
			System.out.println(s.getName()+" "+s.getActivities());
	}
	/*
	 * Using Consumer to print name and list of activities using Consumer chaining i.e. andThen()
	 */
	private static void lambadPrintStudentNameAndActivities()
	{
		Consumer<Student> studentNamePrintConsumer=(student)->System.out.print(student.getName());
		Consumer<Student> studentActivitiesPrintConsumer=(student)->System.out.println(" "+student.getActivities());
		studentList.forEach(studentNamePrintConsumer.andThen(studentActivitiesPrintConsumer));
	}
	/*
	 * Prior java 8 way to print Student name and list of activities who are in or above grade level 3
	 */
	private static void legacyPrintStudentUsingCondition()
	{
		for(Student s: studentList)
		{
			if(s.getGrade()>=3)
			{
				System.out.println(s.getName()+" "+s.getActivities());
			}
			
		}
			
	}
	/*
	 * Using Consumer to print name and list of activities who are in or above grade level 3
	 */
	private static void lambadPrintStudentUsingConditioin()
	{
		Consumer<Student> studentNamePrintConsumer=(student)->System.out.print(student.getName());
		Consumer<Student> studentActivitiesPrintConsumer=(student)->System.out.println(" "+student.getActivities());
		studentList.forEach(student->{
			if(student.getGrade()>=3)
			{
				studentNamePrintConsumer.andThen(studentActivitiesPrintConsumer).accept(student);
			}
		});
	}

	public static void main(String[] args) {
		System.out.println("Prior Java 8 way to print a list");
		legacyPrintStudentName();
		System.out.println("\nLambda way to print a list using cosumer");
		lambadPrintStudentName();
		
		System.out.println("\nPrior Java 8 way to print Student name and activities");
		legacyPrintStudentNameAndActivities();
		System.out.println("\nLambda way to print Student name and activities");
		lambadPrintStudentNameAndActivities();
		
		System.out.println("\nPrior Java 8 way to print Student name and activities with Grade >=3");
		legacyPrintStudentUsingCondition();
		System.out.println("\nLambda way to print Student name and activities with Grade>=3");
		lambadPrintStudentUsingConditioin();
	}

}
