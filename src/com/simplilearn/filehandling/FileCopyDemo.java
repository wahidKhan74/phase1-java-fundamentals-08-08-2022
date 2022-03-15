package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyDemo {

	public static void main(String[] args) {
		
		copyFile("testdata.txt", "testdataCopy.txt");
	}

	private static void copyFile(String srcFile, String desFile) {
		try {
			// create files resource
			FileInputStream input = new FileInputStream(srcFile);
			FileOutputStream output = new FileOutputStream(desFile);
			
			// read one file and write another file.
			int c ;
			while((c=input.read()) != -1) {
				output.write(c);
			}
			System.out.println("File is copied !");
			input.close();
			output.close();
		} catch (Exception e) {
			System.out.println("Exception Ocuured : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}
	}
}
