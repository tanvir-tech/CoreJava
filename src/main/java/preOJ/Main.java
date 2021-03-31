package preOJ;
// Java program to demonstrate use of ProcessBuilder
// to compile and run external files.

import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try {
            // create a process
            ProcessBuilder pb = new ProcessBuilder("cmd");

            // take all commands as input in a text file
            File commands = new File("C:\\Users\\tanvi\\IdeaProjects\\CoreJava\\src\\preOJ\\commands.txt");

            // File where error logs should be written
            File error = new File("C:\\Users\\tanvi\\IdeaProjects\\CoreJava\\src\\preOJ\\error.txt");

            // File where output should be written
            File output = new File("C:\\Users\\tanvi\\IdeaProjects\\CoreJava\\src\\preOJ\\output.txt");

            // redirect all the files
            pb.redirectInput(commands);
            pb.redirectOutput(output);
            pb.redirectError(error);

            // start the process
            Process process = pb.start();
            int exitvalue = process.waitFor();
            System.out.println("Process finished with exit value " + exitvalue);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
