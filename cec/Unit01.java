// Write a java program that reads a text file and creates a new
// text file with each letter converted to upper case whether it is
// lower case or upper case.

import java.util.Scanner;
import java.io.*;

public class Unit01 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter File Name to read: ");
        String pathNameRead = input.nextLine();

        System.out.println("Enter File Name to write: ");
        String pathNameWrite = input.nextLine();

        FileInputStream readFile = new FileInputStream(pathNameRead);
        FileOutputStream writeFile = new FileOutputStream(pathNameWrite);

        try {

            int index;
            while ((index = readFile.read()) != -1) {

                writeFile.write(Character.toUpperCase((char) index));
            }

        } catch (Exception error) {
            System.out.println(error);
        }

    }
}
