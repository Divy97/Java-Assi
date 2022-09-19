import java.util.*;

public class Que09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Vector<Integer> elements = new Vector<Integer>();

        System.out.println("Enter 10 Elements: ");
        for (int i = 0; i < 10; i++) {
            int ele = input.nextInt();
            elements.add(ele);
        }
        Enumeration displayVector = elements.elements();

        System.out.println("Vector elements: ");
        while (displayVector.hasMoreElements())
            System.out.println(displayVector.nextElement());
    }
}