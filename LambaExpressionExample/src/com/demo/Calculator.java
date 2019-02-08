package com.demo;

public class Calculator {

	@FunctionalInterface
	private interface IntMathOperation{
		Integer operation(Integer param1,Integer param2);
	}
	
	private static Integer binaryOperator(Integer param1, Integer param2, IntMathOperation operationInterface)
	{
		return operationInterface.operation(param1, param2);
	}
	public static void main(String[] args) {
	
		for(int i=1;i<10;i++)
			System.out.println("5 * "+i+" = "+binaryOperator(5, i, (a,b)->a*b));
		for(int i=1;i<10;i++)
			System.out.println("10 - "+i+" = "+binaryOperator(10, i, (a,b)->a-b));
		for(int i=0;i<10;i++)
			System.out.println("1 + "+i+" = "+binaryOperator(1, i, (a,b)->a+b));
		
	}

}
