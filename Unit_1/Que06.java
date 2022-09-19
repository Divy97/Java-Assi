
//Write a Java program to delete file, hide a file
import java.io.File;

public class Que06 {
    public static void main(String[] args) {
        File deleteFile = new File("Demo.txt");

        System.out.println("Is Hidden: " + deleteFile.isHidden());

        System.out.println("File Deleted: " + deleteFile.delete());
    }
}
