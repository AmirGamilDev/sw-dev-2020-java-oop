package com.example.animals;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Lassie", "Brown & White", "Collie", 4, true, 20, 1);
		Dog dog2 = new Dog("Cujo", "Dark Brown & White", "St. Bernard", 4, true, 40, 0);
		
		Cat cat1 = new Cat("Ginger", "Ginger", "Tomcat", 4, true, 4.3, 6);
		Cat cat2 = new Cat("Garfield", "Ginger", "Tabby cat", 4, true, 7.3, 6);
		
		dog1.eat();
		cat1.eat();
		
		dog1.sleep();
		cat1.sleep();
		
		dog1.makeSound();
		cat1.makeSound();
		
		dog1.pant();
		cat1.climb();
		
		String dog1String = dog1.toString();
		System.out.println();
		System.out.println(dog1String);
		
		System.out.println();
		System.out.println(cat1.toString());
	}
}
