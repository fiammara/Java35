package homeworks;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name: ");
        String name=sc.nextLine();

        System.out.println("enter your year of birth:");
        int birthYear = sc.nextInt();
        System.out.println("Your name is "+ name + " and you are "+ (2022-birthYear) + " or " + (2023-birthYear) + " years old");
    }
}
