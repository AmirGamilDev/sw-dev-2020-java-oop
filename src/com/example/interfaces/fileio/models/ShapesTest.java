package com.example.interfaces.fileio.models;

public class ShapesTest {

	public static void main(String[] args) {
		Square square = new Square("white", 5);
		Rectangle rectangle = new Rectangle("Red", 3.2, 5.4);
		Triangle triangle = new Triangle("Green", 4.98, 3.7, 3.1, 2.3);
		Circle circle = new Circle("Blue", 3);
		
		Shape[] shapes = new Shape[4];
		
		shapes[0] = square;
		shapes[1] = rectangle;
		shapes[2] = triangle;
		shapes[3] = circle;
		
//		for(int i = 0; i < shapes.length; i++) {			
//			printShapeDetails(shapes[i]);
//			printArea(shapes[i]);
//			System.out.println();
//		}
		
		for(Shape shape : shapes) {
			printShapeDetails(shape);
			printArea(shape);
			System.out.println();
		}
		
		Shape actuallyACircle = new Circle("Orange", 7);
		printArea(actuallyACircle);
//		actuallyACircle.setRadius(9); doesn't work - too specific
		
		System.out.println();
		
		if(actuallyACircle instanceof Circle) {
			System.out.println("actuallyACircle IS a circle!!");
			
			Circle theActualCircle = (Circle)actuallyACircle;
			theActualCircle.setRadius(9);			
		} else {
			System.out.println("actuallyACircle wasn't a circle...");
		}
		
		Shape actuallyASquare = new Square("Navy", 3);
		
		if(actuallyASquare instanceof Circle) {
			System.out.println("actuallyASquare IS a circle!!");
			
			Circle notACircleAtAll = (Circle) actuallyASquare;
			notACircleAtAll.setRadius(11);
		} else {
			System.out.println("actuallyASquare wasn't a circle...");
		}
	}
	
	public static void printArea(Shape shape) {
		System.out.println("The area of this shape is: " 
				+ shape.getArea());
	}
	
	public static void printShapeDetails(Shape s) {
		System.out.println(s.toString());
	}
}
