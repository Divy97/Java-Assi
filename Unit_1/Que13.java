
/*13. Write a program to write your name and address into file using FileWriter and read same
file using FileReader. */
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.*;

public class Que13 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name");
        String s = sc.nextLine();
        FileWriter fw = new FileWriter(s);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter address");
        String address = sc.nextLine();
        // System.out.print("Name is ");
        for (int i = 0; i < name.length(); i++) {
            fw.write(name.charAt(i));

        }
        // System.out.println("Address is ");
        for (int i = 0; i < address.length(); i++) {
            fw.write(address.charAt(i));
        }
        fw.close();

        FileReader fr = new FileReader(s);
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();

    }
}