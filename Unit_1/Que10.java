import java.io.*;
import java.util.Scanner;

public class Que10 {
    public static void main(String[] args) {

        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream("./output.txt"));
            DataInputStream input = new DataInputStream(new FileInputStream("./output.txt"));

            Scanner in = new Scanner(System.in);
            String s = in.next();

            output.writeChars(s);
            output.close();

            int a = input.available();
            byte[] b = new byte[a];
            input.read(b);

            for (byte k : b) {
                char ch = (char) k;
                System.out.print(ch + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}