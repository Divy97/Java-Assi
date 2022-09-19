// Write a program showing various methods of HashSet class.

import java.util.*;

public class Que8 {
    public static void main(String[] args) {

        HashSet<Integer> elements = new HashSet<Integer>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 Elements: ");
        for (int i = 0; i < 5; i++) {
            int ele1 = input.nextInt();
            elements.add(ele1);
        }

        System.out.print("Display Elements of HashSet");
        System.out.println(elements);

        System.out.print("contains in HashSet ");
        System.out.println(elements.contains(6));

        System.out.print("remove 2nd Element from HashSet ");
        elements.remove(1);

        System.out.print("Size of HashSet ");
        System.out.println(elements.size());

        System.out.print("clear HashSet");
        elements.clear();
    }
}
