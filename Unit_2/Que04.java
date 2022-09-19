/* Write a program that will
-create an array of 5 cars
-print the array
-add 2 cars at 3rd positins
-print the array with changes
-remove the car from 2nd position
-print the array with changes */

import java.util.*;

public class Que04 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 car Names: ");
        for (int i = 0; i < 5; i++) {
            String car = input.nextLine();
            cars.add(car);
        }

        System.out.println("Car Names: ");
        System.out.println(cars);

        cars.add(3, "BMW");
        cars.add(3, "Fiat");

        System.out.println("Car Names after changes: ");
        System.out.println(cars);

        cars.remove(2);
        System.out.println("Car Names after removing Element at 2nd position: ");
        System.out.println(cars);

    }
}
