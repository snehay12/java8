package com.streams;

import java.util.List;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class StreamMatchDemo {
	
	private static Boolean anyMatch(List<Student> studentList)
	{
		return studentList.stream().anyMatch((s)->s.getGpa()>=4.0);
	}
	
	private static Boolean allMatch(List<Student> studentList)
	{
		return studentList.stream().allMatch((s)->s.getGpa()>=3.0);
	}
	
	private static Boolean noneMatch(List<Student> studentList)
	{
		return studentList.stream().noneMatch((s)->s.getGpa()>4.5);
	}

	public static void main(String[] args) {
	
		List<Student> studentList = StudentDatabase.getAllStudents();
		
		System.out.println("Any Student has GPA >= 4.0 ? "+anyMatch(studentList));
		System.out.println("All Student have GPA >= 3.0 ? "+allMatch(studentList));
		System.out.println("No Student has GPA > 4.5 ? "+noneMatch(studentList));

	}

}
