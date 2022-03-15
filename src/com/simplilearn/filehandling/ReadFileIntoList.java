package com.simplilearn.filehandling;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadFileIntoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lines = readFileIntoList("data.txt", "/home/wahidkhan74gmai/eclipse-workspace/phase1-java-fundamentals-08-08-2022/");
	
		// print data on console by ready line byline text
		for(String line : lines) {
			System.out.println(line);
		}
	}

	private static List<String> readFileIntoList(String filename, String path){
		
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(path+filename), StandardCharsets.UTF_8);
		} catch (Exception e) {
			System.out.println("Exception Ocuured : "+e.getClass());
			System.out.println("Exception Message : "+e.getMessage());
		}
		return lines;
	}
}
