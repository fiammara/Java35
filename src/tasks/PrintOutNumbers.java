package tasks;

import java.util.Scanner;

public class PrintOutNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number");
        int number = sc.nextInt();
        if (number > 0) {
            for (int i = number; i>=0; i--) {
            System.out.print (number + " ");
            number--;}

        } else if (number < 0) {
            for (int i = number; i<=0; i++) {
                System.out.print(number + " ");
                number++;}

        } else {
            System.out.println(0);
        }
    }
}
