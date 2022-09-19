// Write a Java program to check whether file is exist or not

import java.io.File;

public class Que02 {
    public static void main(String[] args) {
        File exists = new File("../Notes.txt");

        if (exists.exists())
            System.out.println("File Exists");
        else
            System.out.println("File not exists");
    }
}
