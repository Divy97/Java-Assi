// Write a Java program to print file information.

import java.io.File;
import java.util.Scanner;

public class Que05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter File Path: ");
        String pathName = input.nextLine();
        File information = new File(pathName);

        System.out.println("File Information");

        System.out.println("File Name: " + information.getName());
        System.out.println("File Exists: " + information.exists());
        System.out.println("File is Writable: " + information.canWrite());
        System.out.println("File is Readable: " + information.canRead());
        System.out.println("Is Directory: " + information.isDirectory());
        System.out.println("Is File: " + information.isFile());
        System.out.println("File Size: " + information.length() + " bytes");
        System.out.println("File Path: " + information.getPath());
        System.out.println("Parent Directory: " + information.getParent());
        System.out.println("File Absolute Path: " + information.getAbsolutePath());
        System.out.println("File is Hidden: " + information.isHidden());

    }
}