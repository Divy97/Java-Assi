//Write a program for adding 10 elements in a Arraylist and display them
//  using ListIterator.

import java.util.*;

public class Que02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> elements = new ArrayList<>();

        System.out.println("Enter 10 Elements: ");
        for (int i = 0; i < 10; i++) {
            int ele1 = input.nextInt();
            elements.add(ele1);
        }

        ListIterator list = elements.listIterator();

        System.out.println("ArrayList Using ListIterator: ");
        while (list.hasNext()) {
            System.out.println(list.next());
        }

    }
}