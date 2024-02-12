package Classes_102;
import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsedCar[] cars = new UsedCar[30];

        for (int i = 0; i < 30; i++) {
            cars[i] = new UsedCar(); // Use default constructor
            cars[i].input(i + 1, scanner);
        }

        System.out.println("\nVehicles with Selling Prices between Kshs. 400,000 and Kshs. 1,000,000:");
        for (UsedCar car : cars) {
            if (car.isWithinPriceRange()) {
                System.out.println(car);
            }
        }
        scanner.close(); // Close the scanner properly
    }
}
