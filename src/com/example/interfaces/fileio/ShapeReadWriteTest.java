package com.example.interfaces.fileio;

import java.util.ArrayList;
import java.util.List;

import com.example.interfaces.fileio.gson.GsonShapeFileReaderWriter;
import com.example.interfaces.fileio.models.Circle;
import com.example.interfaces.fileio.models.Rectangle;
import com.example.interfaces.fileio.models.Shape;
import com.example.interfaces.fileio.models.Square;
import com.example.interfaces.fileio.models.Triangle;

public class ShapeReadWriteTest {

    public static void main(String[] args) {

        // here we can use an instance of either
        // - BasicShapeFileReaderWriter
        // - SerializableShapeReaderWriter
        // - GsonShapeFileReaderWriter
        // the rest of the code doesn't need to change as it is referring to an interface (which all three classes
        // implement)
        // NOTE: The GsonShapeFileReaderWriter implementation is somewhat complex as a ShapeAdapter was required
        // due to the presence of an abstract Shape class.  Using the Gson library is not normally as complicated
        // and is usually much more straightforward (1 or 2 lines of code).
        // See more here: https://github.com/google/gson
        // To use Gson (and any library), it must be included in your project.  For the sake of simplicity, this is 
        // done in this project by adding the required jar file in the libs folder and then adding this libray as 
        // a dependency of the project.  A better way is to have the project be a Maven/Gradle project and add this 
        // as a dependency in the pom file/gradle file.
    	ShapeFileReaderWriter shapeFileReaderWriter = new GsonShapeFileReaderWriter();
    	
    	writeAndReadShapes(shapeFileReaderWriter);
    }
    
    private static void writeAndReadShapes(ShapeFileReaderWriter shapeFileReaderWriter) {
        List<Shape> shapes = new ArrayList<>();
 
        shapes.add(new Circle("Green", 5));
        shapes.add(new Rectangle("Blue", 3, 4));
        shapes.add(new Square("Red", 5));
        shapes.add(new Triangle("Pink", 4.98, 3.7, 3.1, 2.3));

        // write shapes out
        
        shapeFileReaderWriter.writeShapesToFile(shapes, "shapes.txt");

        // read shapes back in again
        
        List<Shape> shapesFromFile = shapeFileReaderWriter.readShapesFromFile("shapes.txt");

        // are they the same?
        
        String before = shapes.toString();
        String after = shapesFromFile.toString();

        System.out.println("Are the two lists the same? : " + before.equals(after));
    }
}
