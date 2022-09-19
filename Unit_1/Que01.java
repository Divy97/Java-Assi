// Write a Java program to list out the files in the given directory.

import java.io.File;

public class Que01 {
    public static void main(String[] args) {

        File list = new File("../Practical_UNIT1");

        String[] listOfFiles = list.list();

        System.out.println("List of Files in given Directory");
        for (String ele : listOfFiles) {
            System.out.println(ele);
        }

    }
}