// Write a program for adding 10 elements in a TreeMap and display them.

import java.util.*;

public class Que05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TreeMap<String, Integer> elements = new TreeMap<>();

        System.out.println("Enter 10 Elements: ");
        for (int i = 0; i < 10; i++) {
            int ele = input.nextInt();
            elements.put("Element No " + i, ele);
        }

        System.out.println("TreeMap Elements: ");
        System.out.println(elements);
    }
}
