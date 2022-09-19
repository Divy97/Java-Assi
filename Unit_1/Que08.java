
// Write a Java program to that will read a data from one file and write it to other file using 
// File Handling Concepts.

import java.io.*;

public class Que08 {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("./Notes.txt");
            FileOutputStream out = new FileOutputStream("./output.txt");

            int index;
            while ((index = in.read()) != -1) {
                out.write((char) index);
            }

            in.close();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
