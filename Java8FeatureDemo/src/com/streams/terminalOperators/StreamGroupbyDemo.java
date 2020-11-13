package com.streams.terminalOperators;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class StreamGroupbyDemo {

	private static void groupByStudentGender()
	{
		Map<String,List<Student>> studentMap=StudentDatabase.getAllStudents()
		.stream()
		.collect(Collectors.groupingBy(Student::getGender));
		
		System.out.println(studentMap);
	}
	
	private static void customizedGroupBy()
	{
		Map<String,List<Student>> studentMap=StudentDatabase.getAllStudents()
		.stream()
		.collect(Collectors.groupingBy(s->s.getGpa()>=3.9?"Outstanding":"Average"));
		
		System.out.println(studentMap);
	}
	
	private static void twoLevelGroupby_1()
	{
		Map<Integer,Map<String,List<Student>>> studentMap=StudentDatabase.getAllStudents()
		.stream()
		.collect(Collectors.groupingBy(Student::getGrade,
				Collectors.groupingBy(s->s.getGpa()>=3.9?"Outstanding":"Average")));
		
		System.out.println(studentMap);
	}
	
	private static void twoLevelGroupby_2()
	{
		Map<Integer,Integer> studentMap=StudentDatabase.getAllStudents()
		.stream()
		.collect(Collectors.groupingBy(Student::getGrade,
				Collectors.summingInt(Student::getNoteBooks)));
		
		System.out.println(studentMap);
	}
	
	private static void threeLevelGroupby_1()
	{
		LinkedHashMap<String,Set<Student>> studentMap=StudentDatabase.getAllStudents()
		.stream()
		.collect(Collectors.groupingBy(Student::getName,LinkedHashMap::new, Collectors.toSet()));
		
		System.out.println(studentMap);
	}
	
	private static void threeLevelGroupby_2()
	{
		Map<Integer,Optional<Student>> studentMap=StudentDatabase.getAllStudents()
		.stream()
		.collect(Collectors.groupingBy(Student::getGrade,Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		
		System.out.println(studentMap);
	}
	public static void main(String[] args) {
//		groupByStudentGender();
//		System.out.println();
//		customizedGroupBy();
		
//		System.out.println();
//		twoLevelGroupby_1();
//		
//		System.out.println();
//		twoLevelGroupby_2();
		
//		System.out.println();
//		threeLevelGroupby_1();
		
		System.out.println();
		threeLevelGroupby_2();
	}

}
