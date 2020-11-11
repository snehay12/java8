package com.streams;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class StreamMapFilterReduceDemo {
	
	private static int totalNoOfNoteBooks()
	{
		return StudentDatabase.getAllStudents()
		.stream()
		.map(Student::getNoteBooks)
		//.reduce(0,(a,b)->a+b);
		.reduce(0, Integer::sum);
	}
	
	private static int totalNoOfNoteBooksInGradeAbove2()
	{
		return StudentDatabase.getAllStudents()
		.stream()
		.filter((s)->s.getGrade()>=3)
		.map(Student::getNoteBooks)
		.reduce(0, Integer::sum);
	}
	
	private static int NoOfNoteBooksWithGalsInGradeAbove2()
	{
		return StudentDatabase.getAllStudents()
		.stream()
		.filter((s)->s.getGrade()>=3 && s.getGender().equalsIgnoreCase("female"))
		.map(Student::getNoteBooks)
		.reduce(0, Integer::sum);
	}

	public static void main(String[] args) {
		System.out.println("Total Number of Books Students have :"+totalNoOfNoteBooks());
		
		System.out.println("Total Number of Books Students in Grade >=3 have :"+totalNoOfNoteBooksInGradeAbove2());
		
		System.out.println("Total Number of Books Female Students in Grade >=3 have :"+NoOfNoteBooksWithGalsInGradeAbove2());

	}

}
