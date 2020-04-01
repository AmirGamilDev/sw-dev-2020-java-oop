package com.example.arraylists;

import java.util.ArrayList;
import java.util.List;

public class UppercasePlural {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("hello");
		list.add("apples");
		list.add("oranges");
		list.add("fork handles");
		list.add("hose");
		
		System.out.println(list);
		
		uppercasePlural(list);
		
		System.out.println(list);
	}
	
	static void uppercasePlural(List<String> list) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).endsWith("s")) {
				list.set(i, list.get(i).toUpperCase());
			}
		}
	}
}
