package com.simplilearn.filehandling;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteFileDemo {

	public static void main(String[] args) {
		
		deleteFile("data.txt","/home/wahidkhan74gmai/eclipse-workspace/phase1-java-fundamentals-08-08-2022/");
	}

	private static void deleteFile(String filename, String path) {
		// delete file 
		try {
			Files.delete(Paths.get(path+filename));
			System.out.println("File is deleted !");
		} catch (Exception e) {
			System.out.println("File Not Found Exception !");
			System.out.println("Exception Ocuured : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}
	}
}
