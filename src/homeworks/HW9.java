package homeworks;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int stars = 0;
        int spaces = number - 1;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= stars; k++) {
                System.out.print("*");
            }

            System.out.println("");

            stars +=2;
            spaces--;
        }

        for (int l = 0; l < stars / 2 - 1; l++) {
            System.out.print(" ");
        }

        System.out.print("#");
    }

}
