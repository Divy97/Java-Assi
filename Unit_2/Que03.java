// Write a program for adding 10 elements in a HashMap and display them.

import java.util.*;

public class Que03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HashMap<String, Integer> elements = new HashMap<>();

        System.out.println("Enter 10 Elements: ");
        for (int i = 0; i < 10; i++) {
            int ele1 = input.nextInt();
            elements.put("Element No" + i + " ", ele1);
        }

        System.out.println("Elements of HaspMap: ");
        System.out.println(elements);

    }
}
