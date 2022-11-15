import java.io.FileInputStream;
import java.io.InputStream;

class InputStream1 {
    public static void main(String args[]) {

        byte[] array = new byte[100];

        try {
            InputStream input = new FileInputStream("./notes.txt");

            System.out.println("Available bytes in the file: " + input.available());

            // Read byte from the input stream
            int index = 0;
            while ((index = input.read()) != -1) {
                System.out.print((char) index + " ");
            }
            // System.out.println("Data read from the file: ");

            // // Convert byte array into string
            // String data = new String(array);
            // System.out.println(data);

            // Close the input stream
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}