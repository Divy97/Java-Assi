
// Write a program showing various methods of HashMap class.
import java.util.*;

public class Que06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HashMap<Integer, Integer> elements = new HashMap<>();

        System.out.println("Enter 10 Elements: ");
        for (int i = 0; i < 10; i++) {
            int ele1 = input.nextInt();
            elements.put(i, ele1);
        }

        System.out.println("Elements of HashMap: ");
        System.out.println(elements);

        System.out.println("Get Element: ");
        System.out.println(elements.get(1));

        System.out.println("Remove Element: ");
        System.out.println(elements.remove(1));

        System.out.println("Size of HashMap: ");
        System.out.println(elements.size());

        System.out.println("keyset: ");
        for (Integer i : elements.keySet()) {
            System.out.println("key: " + i + " value: " + elements.get(i));
        }

        System.out.println("Clear HashMap ");
        elements.clear();

    }
}
