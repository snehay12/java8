package com.streams;

import java.util.List;
import java.util.Optional;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class StreamFindDemo {

	private static Optional<Student> findAnyStudent(List<Student> studentList)
	{
		return studentList.stream()
				.filter((s)->s.getGpa()>=3.9)
				.findAny();
	}
	public static void main(String[] args) {
		List<Student> studentList = StudentDatabase.getAllStudents();
		
		System.out.println(findAnyStudent(studentList));
	}

}
