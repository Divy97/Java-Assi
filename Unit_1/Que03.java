// Write a Java program to check file is read only or not.

import java.io.File;

public class Que03 {
    public static void main(String[] args) {
        File readOnly = new File("../Notes.txt");

        if (!readOnly.canWrite() && readOnly.canRead())
            System.out.println("File is Read Only");
        else
            System.out.println("File not Read Only");
    }
}
