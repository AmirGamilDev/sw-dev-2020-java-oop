package com.example.interfaces.fileio.gson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.example.interfaces.fileio.ShapeFileReaderWriter;
import com.example.interfaces.fileio.models.Shape;
import com.google.gson.GsonBuilder;

public class GsonShapeFileReaderWriter implements ShapeFileReaderWriter {
    @Override
    public void writeShapesToFile(List<Shape> shapes, String outputFileName) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Shape.class, new ShapeAdapter());

        Shape[] shapesArray = new Shape[shapes.size()];
        shapes.toArray(shapesArray);

        String jsonOutputString = gsonBuilder.create().toJson(shapesArray);

        BufferedWriter bufferedWriter;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(outputFileName));

            bufferedWriter.write(jsonOutputString);

            bufferedWriter.flush();

            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException("Error writing shapes to file - cannot write to " + outputFileName);
        }
    }

    @Override
    public List<Shape> readShapesFromFile(String inputFileName) {
        List<Shape> shapes = null;

        BufferedReader bufferedReader;

        try {
            bufferedReader = new BufferedReader(new FileReader(inputFileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Cannot read from input file");
        }

        try {
            String line = bufferedReader.readLine();

            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(Shape.class, new ShapeAdapter());

            shapes = Arrays.asList(gsonBuilder.create().fromJson(line, Shape[].class));

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }        

        return shapes;
    }
}
