
// Write a program for adding 10 elements in a Linkedlist and display 
// them using foreach loop
import java.util.*;

public class Que01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList<Integer> elements = new LinkedList<>();

        System.out.println("Enter 3 Elements: ");
        for (int i = 0; i < 3; i++) {
            int ele1 = input.nextInt();

            elements.add(ele1);
        }

        System.out.println("List of Elements: ");
        for (Integer e : elements) {
            System.out.println(e);
        }

        System.out.println(elements);

    }
}