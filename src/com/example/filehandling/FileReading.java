package com.example.filehandling;

import java.io.*;

public class FileReading {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("weather_data.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line = bufferedReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				
				line = bufferedReader.readLine();
			}
			
			bufferedReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
