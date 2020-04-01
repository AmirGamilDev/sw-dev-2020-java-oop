package com.example.interfaces.fileio;

import com.example.interfaces.fileio.models.Shape;

import java.util.List;

public interface ShapeFileReaderWriter {
    void writeShapesToFile(List<Shape> shapes, String outputFileName);

    List<Shape> readShapesFromFile(String inputFileName);
}
