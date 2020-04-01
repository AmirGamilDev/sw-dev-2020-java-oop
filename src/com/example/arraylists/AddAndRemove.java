package com.example.arraylists;

import java.util.ArrayList;
import java.util.List;

public class AddAndRemove {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 10; i <= 100; i += 10) {
			list.add(i);
		}
		
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			list.remove(i);
		}
		
		System.out.println(list);
		
		for(int i = 10; i < 100; i += 20) {
			list.remove(list.indexOf(i));
		}
	}
}
