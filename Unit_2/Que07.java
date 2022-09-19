import java.util.*;

// Write a program showing various methods of TreeMap class.
public class Que07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<Integer, Integer> elements = new TreeMap<>();

        System.out.println("Enter 10 Elements: ");
        for (int i = 0; i < 10; i++) {
            int ele1 = input.nextInt();
            elements.put(i, ele1);
        }

        System.out.println("Elements of TreeMap: ");
        System.out.println(elements);

        System.out.println("Get Element: ");
        System.out.println(elements.get(1));

        System.out.println("Remove Element: ");
        System.out.println(elements.remove(1));

        System.out.println("Size of TreeMap: ");
        System.out.println(elements.size());

        System.out.println("keyset: ");
        for (Integer i : elements.keySet()) {
            System.out.println("key: " + i + " value: " + elements.get(i));
        }

        System.out.println("Clear TreeMap ");
        elements.clear();
    }
}
