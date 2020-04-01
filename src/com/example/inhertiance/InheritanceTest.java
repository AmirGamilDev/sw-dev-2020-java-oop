package com.example.inhertiance;

public class InheritanceTest {

	public static void main(String[] args) {
		
		Parent parent1 = new Parent();
		Child child1 = new Child();
		Child child2 = new Child();
		
		System.out.println("A in parent1: " + parent1.getA());
		
		System.out.println("B in child1: " + child1.getB());	
		
		System.out.println("A in child1: " + child1.getA());
		
		child1.setA(11);
		child2.setA(229);
		
		parent1.setA(13);
		
		System.out.println("A in child1 after change: " + child1.getA());
		System.out.println("A in child2 after change: " + child2.getA());
		System.out.println("A in parent1 is still: " + parent1.getA());
	}
}
