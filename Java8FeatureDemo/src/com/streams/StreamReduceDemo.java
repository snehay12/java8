package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class StreamReduceDemo {
	
	static Integer performMultiplicationWithDefault(List<Integer> intList)
	{
		return intList.stream()
		//1, (1,1)=>1
		//1,(1,2) => 2
		//2,(2,3) -> 6
		//6,(6,4) => 24
		//24, (24,5) => 120
		.reduce(1, (a,b)->a*b);
	}
	
	static Optional<Integer> performMultiplicationWithOutDefault(List<Integer> intList)
	{
		return intList.stream()
		//1, (1,1)=>1
		//1,(1,2) => 2
		//2,(2,3) -> 6
		//6,(6,4) => 24
		//24, (24,5) => 120
		.reduce((a,b)->a*b);
	}

	static Optional<Student> highestGPAStudent(List<Student> studentList)
	{
		return studentList.stream().reduce((student1, student2) -> {
			if (student1.getGpa() > student2.getGpa())
				return student1;
			else
				return student2;
		});
	}
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		
		System.out.println(performMultiplicationWithDefault(intList));
		
		Optional<Integer> result = performMultiplicationWithOutDefault(intList);
		
		System.out.println(result.isPresent()? result.get(): 0);
		
		Optional<Integer> result2 = performMultiplicationWithOutDefault(Arrays.asList());
		
		System.out.println(result2.isPresent()? result2.get(): 0);
		
		Optional<Student> studentHighestGPA = highestGPAStudent(StudentDatabase.getAllStudents());
		
		System.out.println(studentHighestGPA.isPresent()? studentHighestGPA: "None");

	}

}
