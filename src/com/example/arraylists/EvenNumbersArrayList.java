package com.example.arraylists;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbersArrayList {

	public static void main(String[] args) {
		
		List<Integer> evenNumbers = new ArrayList<Integer>();
		
		for(int i = 0; evenNumbers.size() < 5; i += 2) {
			evenNumbers.add(i);
		}
		
		System.out.println(evenNumbers);
		
		int originalSize = evenNumbers.size();
		
		for (int i = 0; i < originalSize; i++) {
			evenNumbers.add(i, 42);
		}
		
		System.out.println(evenNumbers);
	}
}
