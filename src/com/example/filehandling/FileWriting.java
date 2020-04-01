package com.example.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		String string = "Employee Info:\n" + 
				"Employee Id: 7592747\n" + 
				"First name: Sonic\n" + 
				"Middle initial: T\n" + 
				"Last name: Hedgehog\n" + 
				"Occupation: Animal freedom fighter\n";
		
		try {
			FileWriter fileWriter = new FileWriter("output.txt");
			
			fileWriter.write(string);
			
			fileWriter.flush();
			
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
