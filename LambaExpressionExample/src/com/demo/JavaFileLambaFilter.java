package com.demo;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class JavaFileLambaFilter {

	public static void main(String[] args) {
		
		FileFilter fileFilter = (File pathName) -> pathName.getName().contains(".java");
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
