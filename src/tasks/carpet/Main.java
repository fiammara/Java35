package tasks.carpet;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter floor length");

        double length = scanner.nextDouble();
        System.out.println("Please enter floor width");

        double width = scanner.nextDouble();

        Floor floor = new Floor(length, width);
        System.out.println("Floor m2 " +  floor.getArea());

        System.out.println("Enter carpet cost: " +  floor.getArea());

        double carpetCost = scanner.nextDouble();

        Carpet carpet = new Carpet(carpetCost);

        System.out.println("Carpet price per m2: " + carpet.getCost());

        Calculator calculator = new Calculator (floor, carpet);
        System.out.println("In total Carpet will cost " + calculator.getTotalCost() + " Eur");
    }

}
