package com.lamda.data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

	public static List<Student> getAllStudents()
	{
		Student adam = new Student("Adam",2,3.6,"male", Arrays.asList("swimming","voleyball","basketball"));
		Student jenny = new Student("Jenny",2,3.8,"female", Arrays.asList("swimming","gymnastics","soccer"));
		
		Student emily = new Student("Emily",3,4.0,"female", Arrays.asList("swimming","gymnastics","aerobics"));
		Student dave = new Student("Dave",3,3.9,"male", Arrays.asList("swimming","gymnastics","soccer"));
		
		Student sophia = new Student("Sophia",4,3.5,"female", Arrays.asList("swimming","dancing","footbal"));
		Student james = new Student("James",4,3.4,"male", Arrays.asList("swimming","gymnastics","baseball","basketball"));
		
		return Arrays.asList(adam,jenny,emily,dave,sophia,james);
	}
}
