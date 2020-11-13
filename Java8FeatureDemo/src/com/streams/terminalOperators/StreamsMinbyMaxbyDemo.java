package com.streams.terminalOperators;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.lamda.data.Student;
import com.lamda.data.StudentDatabase;

public class StreamsMinbyMaxbyDemo {

	/*
	 * MaxBy and MinBy Collector takes Comparator as input parameter and returns Max/Min of the element based on the comparator
	 */
	private static Optional<Student> minBy() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}

	private static Optional<Student> maxBy() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}

	public static void main(String[] args) {

		Optional<Student> lowestGPAStu = minBy();
		Optional<Student> highestGPAStu = maxBy();
		System.out.println("Student with low GPA : "
				+ (lowestGPAStu.isPresent() ? lowestGPAStu.get().getName() + ", " + lowestGPAStu.get().getGpa()
						: "No Students"));
		System.out.println("Student with highest GPA : "
				+ (highestGPAStu.isPresent() ? highestGPAStu.get().getName() + ", " + highestGPAStu.get().getGpa()
						: "No Students"));
	}

}
