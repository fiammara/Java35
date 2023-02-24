package homeworks;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int number=scanner.nextInt();

        int difference=Math.abs(number-100);
        if (difference<=10) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
    }
}
