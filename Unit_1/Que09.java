
/*9. Write a Java program to write a byte array to BufferedArrayOutputStream.*/
import java.util.Scanner;
import java.io.*;

public class Que09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter data");
            String[] s1 = new String[2];
            for (int i = 0; i < 2; i++) {
                s1[i] = sc.nextLine();
            }
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("demox1.dat"));
            for (int i = 0; i < 2; i++) {
                bos.write(s1[i].getBytes());
            }

            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}