package com.example.interfaces.fileio.basic;

import com.example.interfaces.fileio.ShapeFileReaderWriter;
import com.example.interfaces.fileio.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BasicShapeFileReaderWriter implements ShapeFileReaderWriter {
    @Override
    public void writeShapesToFile(List<Shape> shapes, String outputFileName) {
        BufferedWriter bufferedWriter;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(outputFileName));
        } catch (IOException e) {
            throw new RuntimeException("Error writing shapes to file - cannot write to " + outputFileName);
        }

        for(Shape shape : shapes) {
            try {
                String output = shape.getClass().getSimpleName() + " " + shape.getColour() + " ";

                if(shape instanceof Circle) {
                    output += createStringForCircle((Circle) shape);
                } else if(shape instanceof Rectangle) {
                    output += createStringForRectangle((Rectangle)shape);
                } else if(shape instanceof Square) {
                    output += createStringForSquare((Square) shape);
                } else if(shape instanceof Triangle) {
                    output += createStringForTriangle((Triangle) shape);
                }

                bufferedWriter.write(output + "\n");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            bufferedWriter.flush();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();

            throw new RuntimeException("Error flushing/closing shapes file " + outputFileName);
        }
    }

    @Override
    public List<Shape> readShapesFromFile(String inputFileName) {
        List<Shape> shapes = new ArrayList<>();

        BufferedReader bufferedReader;

        try {
            bufferedReader = new BufferedReader(new FileReader(inputFileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Cannot read from input file");
        }

        try {
            String line = bufferedReader.readLine();

            while(line != null) {
                String[] items = line.split(" ");

                switch (items[0]) {
                    case "Circle":
                        Circle circle = getCircleFromDataLine(items);
                        shapes.add(circle);
                        break;

                    case "Rectangle":
                        Rectangle rectangle = getRectangleFromDataLine(items);
                        shapes.add(rectangle);
                        break;

                    case  "Square":
                        Square square = getSquareFromDataLine(items);
                        shapes.add(square);
                        break;

                    case "Triangle":
                        Triangle triangle = getTriangleFromDataLine(items);
                        shapes.add(triangle);
                        break;

                    default:
                        System.out.println("Error!  Unknown shape");
                }

                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error closing input file");
        }

        return shapes;
    }

    private String createStringForCircle(Circle circle) {
        return circle.getRadius() + "";
    }

    private String createStringForRectangle(Rectangle rectangle) {
        return rectangle.getWidth() + " " + rectangle.getLength();
    }

    private String createStringForSquare(Square square) {
        return square.getWidth() + "";
    }

    private String createStringForTriangle(Triangle triangle) {
        return triangle.getBase() + " " + triangle.getSide2() + " " + triangle.getSide3() + " " + triangle.getHeight();
    }

    private Circle getCircleFromDataLine(String[] items) {
        String colour = items[1];

        double radius = 0;

        try {
            radius = Double.parseDouble(items[2]);
        } catch(NumberFormatException e) {
            e.printStackTrace();

            throw new RuntimeException("Error reading circle data");
        }

        return new Circle(colour, radius);
    }

    private Rectangle getRectangleFromDataLine(String[] items) {
        String colour = items[1];

        double width = 0;
        double length = 0;

        try {
            width = Double.parseDouble(items[2]);
            length = Double.parseDouble(items[3]);
        } catch(NumberFormatException e) {
            e.printStackTrace();

            throw new RuntimeException("Error reading rectangle data");
        }

        return new Rectangle(colour, width, length);
    }

    private Square getSquareFromDataLine(String[] items) {
        String colour = items[1];

        double width = 0;

        try {
            width = Double.parseDouble(items[2]);
        } catch(NumberFormatException e) {
            e.printStackTrace();

            throw new RuntimeException("Error reading square data");
        }

        return new Square(colour, width);
    }

    private Triangle getTriangleFromDataLine(String[] items) {
        String colour = items[1];

        double base = 0;
        double side2 = 0;
        double side3 = 0;
        double height = 0;

        try {
            base = Double.parseDouble(items[2]);
            side2 = Double.parseDouble(items[3]);
            side3 = Double.parseDouble(items[4]);
            height = Double.parseDouble(items[5]);
        } catch(NumberFormatException e) {
            e.printStackTrace();

            throw new RuntimeException("Error reading triangle data");
        }

        return new Triangle(colour, base, side2, side3, height);
    }
}
