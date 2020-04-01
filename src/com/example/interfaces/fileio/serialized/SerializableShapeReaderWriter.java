package com.example.interfaces.fileio.serialized;

import com.example.interfaces.fileio.ShapeFileReaderWriter;
import com.example.interfaces.fileio.models.Shape;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SerializableShapeReaderWriter implements ShapeFileReaderWriter {
    @Override
    public void writeShapesToFile(List<Shape> shapes, String outputFileName) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    Files.newOutputStream(Paths.get(outputFileName)));

            for(Shape s : shapes) {
                objectOutputStream.writeObject(s);
            }

            objectOutputStream.writeObject(null); // used to mark of end of file for reading later

            objectOutputStream.flush();

            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();

            throw new RuntimeException("Error writing serialised data to " + outputFileName);
        }
    }

    @Override
    public List<Shape> readShapesFromFile(String inputFileName) {
        List<Shape> shapes = new ArrayList<>();

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    Files.newInputStream(Paths.get(inputFileName)));

            while(true) {
                Shape shape = (Shape) objectInputStream.readObject();

                if(shape == null) break;

                shapes.add(shape);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

            throw new RuntimeException("Error reading shapes from " + inputFileName);
        }

        return shapes;
    }
}
