
//10. Write a program to store elements in Hashset and search a perticular element in it.
import java.util.*;

public class Que10 {
    public static void main(String[] args) {

        HashSet<Integer> elements = new HashSet<Integer>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 Elements: ");
        for (int i = 0; i < 5; i++) {
            int ele1 = input.nextInt();
            elements.add(ele1);
        }

        System.out.print("Enter Element to check hashSet contains a element or not: ");
        int contain = input.nextInt();

        if (elements.contains(contain)) {
            System.out.println("Element is in a HashSet ");
        } else {
            System.out.println("Element is not in a HashSet ");
        }

    }
}