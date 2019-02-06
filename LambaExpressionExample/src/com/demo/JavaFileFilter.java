package com.demo;
import java.io.File;
import java.io.FileFilter;

public class JavaFileFilter {

	public static void main(String[] args) {
		FileFilter fileFilter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().contains(".java");
			}
		};
		
		File file = new File("/Users/Sne/GitRepository/");
		for(File f : file.listFiles(fileFilter))
		{
			System.out.println(f.getName());
		}

	}

}
