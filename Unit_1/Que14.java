
/*14. Write a Java program to check whether a file exists or not if a file exists than change a
file permission to readable. */
import java.util.Scanner;
import java.io.*;

class Que14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name");
        String s = sc.nextLine();
        File f = new File(s);
        try {
            if (f.exists()) {
                f.setReadable(true);
                System.out.println("File exists and permission given to read");
            } else {
                System.out.println("File does not exist");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}