# SW Dev LK Course 2019-2020 Java OOP Samples

This project contains sample code produced during class of the Java Object Oriented Programming module.

Code was produced via live coding in class as demoed by course tutor as well as via collective coding 
with students contributing to code that was written as part of class exercises.

Note 1: Not all coding best practices are employed as certain concepts were only employed once class had knowledge of these (e.g. use of abstract or final where appropriate).  Also, getters and setters were sometimes left out
to keep code simple when demonstrating a different concept.

Note 2: The example of reading/writing Shape data to a file using an interface can be found in com.example.interfaces.fileio

The GsonShapeFileReaderWriter implementation is somewhat complex as a ShapeAdapter was required due to the presence of an abstract Shape class.  Using the Gson library is not normally as complicated and is usually much more straightforward (1 or 2 lines of code).

See more here: https://github.com/google/gson

To use Gson (and any library), it must be included in your project.  For the sake of simplicity, this is  done in this project by adding the required jar file in the libs folder and then adding this libray as  a dependency of the project.  A better way is to have the project be a Maven/Gradle project and add this  as a dependency in the pom file/gradle file.