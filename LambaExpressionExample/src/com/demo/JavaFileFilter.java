package com.demo;
import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class JavaFileFilter {

	public static void main(String[] args) {
		FileFilter fileFilter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().contains(".java");
			}
		};
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter the file path: ");
		String filePath = scanner.nextLine().toString();
		scanner.close();
		File file = new File(filePath);
		for(File f : file.listFiles(fileFilter))
		{
			System.out.println(f.getName());
		}

	}

}
