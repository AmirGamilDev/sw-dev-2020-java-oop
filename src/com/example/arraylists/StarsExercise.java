package com.example.arraylists;

import java.util.ArrayList;
import java.util.List;

public class StarsExercise {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("the");
		list.add("quick");
		list.add("brown");
		list.add("fox");
		
		addStars(list);
		
		System.out.println(list);
		
		removeStars(list);
		
		System.out.println(list);
	}
	
	public static void addStars(List<String> list) {
		for(int i = 1; i <= list.size(); i += 2) {
			list.add(i, "*");
		}
	}
	
	public static void removeStars(List<String> list) {
		for(int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			
			if(string.equals("*")) {
				list.remove(i);
			}
		}
	}
}
