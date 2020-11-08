package com.lamda.methodReference;

import java.util.function.Function;

public class FunctionMethodRefDemo {

	/*
	 * ClassName::instance method
	 * Using method reference syntax in Lambda expression
	 */
	static Function<String, String> printUpperCaseString = String :: toUpperCase;
	public static void main(String[] args) {
		
		System.out.println(printUpperCaseString.apply("method reference"));

	}

}
