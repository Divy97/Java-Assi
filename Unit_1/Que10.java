
/*10. Write a Java Program to read/write file using DataInputStream/DataOutputStream..*/
import java.util.Scanner;
import java.io.*;

public class Que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // System.out.println("Enter data");
            // String s1=sc.nextLine();
            File fin = new File("demox1.dat");
            DataInputStream dis = new DataInputStream(new FileInputStream(fin));
            System.out.println(dis.readFloat());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}