
// Write a Java program to write a byte array to BufferedArrayOutputStream.
import java.io.*;

public class Que09 {
    public static void main(String[] args) {
        try {
            byte[] array = { 'a', 'b' };
            // String s = "Hello";
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("./buffer.dat"));

            // byte[] b = s.getBytes();
            output.write(array);

            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}