package com.lamda;

public class RunnableLambaDemo {

	public static void main(String[] args) {

		/*
		 * Prior Java 8
		 */
		Runnable runnable1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside old implementation: thread 1");

			}
		};

		new Thread(runnable1).run();
		
		/*
		 * Typical Lambda expression
		 */

		Runnable runnable2 = () -> {
			System.out.println("New Lambda implementation: thread 2");
		};

		new Thread(runnable2).run();
		
		/*
		 * More readable Lambda expression
		 */
		new Thread(() -> System.out.println("New Lambda implementation: thread 3")).run();
		
		/*
		 * When there are multiple statements, use {} brackets
		 */
		Runnable runnable4 = () -> {
			System.out.println("New Lambda implementation: thread 4.0");
			System.out.println("New Lambda implementation: thread 4.1");
		};

		new Thread(runnable4).run();

	}

}
