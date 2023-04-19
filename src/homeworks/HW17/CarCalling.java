package homeworks.HW17;

import java.util.Scanner;

public class CarCalling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fuel amount in your vehicle:");
        float fuel= scanner.nextFloat();
        System.out.println("Enter your vehicle`s fuel usage per 100 km:");
        float fuelUsage= scanner.nextFloat();
        System.out.println("Enter how many passengers will be in vehicle");
        int passengers = scanner.nextInt();
        boolean airConditioner = false;
        System.out.println("Will you turn on air conditioner? y/n");
        char ch = scanner.next().charAt(0);

        if (ch == 'y') {airConditioner = true;}

        Car car = new Car (fuel, fuelUsage, passengers, airConditioner);

        float driveMaxRounded = Math.round(car.maxDistance() * 100)/100f;

        System.out.println("Your vehicle can drive maximum of " + driveMaxRounded + " kilometers");

    }
}
