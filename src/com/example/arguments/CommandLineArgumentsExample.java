package com.example.arguments;

public class CommandLineArgumentsExample {

	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println("Arg #" + i + ": " + args[i]);
		}
		
		System.out.println("Program end");
	}
}
