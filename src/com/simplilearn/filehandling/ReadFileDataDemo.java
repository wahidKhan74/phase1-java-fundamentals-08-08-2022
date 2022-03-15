package com.simplilearn.filehandling;

import java.io.FileInputStream;

public class ReadFileDataDemo {

	public static void main(String[] args) {
		
		readFile("data.txt");
		
		System.out.println("-------------");
		
		readFile("testdata.txt");
	}

	private static void readFile(String filename) {
		
		try {
			FileInputStream fileInputStream = new FileInputStream(filename);
			
			int count =0;
			while((count=fileInputStream.read()) !=-1 ) {
				System.out.print((char) count );
			}
			System.out.println();
			fileInputStream.close();
		} catch (Exception e) {
			System.out.println("Exception Ocuured : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}
	}
}
