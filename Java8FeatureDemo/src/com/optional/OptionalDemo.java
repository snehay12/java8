package com.optional;

import java.util.Optional;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class OptionalDemo {

	public static String getStudentsName()
	{
		Student student = StudentDatabase.studentSupplier.get();
		return student==null? null:student.getName();
		
	}
	
	public static Optional<String> getStudentsNameUsingOptional()
	{
		Optional<Student> student = Optional.ofNullable(StudentDatabase.studentSupplier.get());
		return student.isEmpty()? Optional.empty():student.map(Student::getName);
		
	}
	public static void main(String[] args) {

		String stu = getStudentsName();
		if(stu!=null)
			System.out.println("Student Name :"+stu);
		else
			System.out.println("No Student Name ");
		
		Optional<String> optStu= getStudentsNameUsingOptional();
		
		if(optStu.isPresent())
			System.out.println("Student Name :"+optStu.get());
		else
			System.out.println("No Student Name ");
		
	}

}
