// Write a Java program to display file size.

import java.io.File;

public class Que04 {
    public static void main(String[] args) {
        File size = new File("../Notes.txt");

        System.out.println("Size of File : " + size.length() + " bytes");
    }
}
