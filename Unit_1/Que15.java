
/*15. Write a Java program to check whether a file exists or not if a file exists than change a
file permission to writable.*/
import java.io.*;
import java.util.Scanner;

public class Que15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name");
        String s = sc.nextLine();
        File f = new File(s);
        // System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getParent());
        try {
            if (f.exists()) {
                f.setWritable(true);
                System.out.println("Exists and permission given to write");
            } else {
                System.out.println(" Does not exists");
            }

        } catch (Exception e)

        {
            e.printStackTrace();
        }

    }
}
