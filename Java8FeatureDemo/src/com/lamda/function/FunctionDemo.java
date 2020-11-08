package com.lamda.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class FunctionDemo {
	
	/*
	 * Get List of Students data to demo predicate and consumers 
	 */
	private static List<Student> studentList = StudentDatabase.getAllStudents();
	
	static Predicate<Student> gpaThreePredicate = (student) -> student.getGpa()>=3.5;
	
	private static Function<List<Student>, Map<String,Double>> studentFunction = (students)->{
		Map<String,Double> studentGpaMap = new HashMap<String,Double>();
		students.forEach( student -> {
			if(gpaThreePredicate.test(student))
			{
				studentGpaMap.put(student.getName(), student.getGpa());
			}	
		});
		return studentGpaMap;
	};

	public static void main(String[] args) {
		System.out.println(studentFunction.apply(studentList));
	}
<<<<<<< HEAD
=======

>>>>>>> a5526fb0216f474d0866960d5925d3661b0142a7
}
