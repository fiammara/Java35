package homeworks;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter age");
        int age= sc.nextInt();
        System.out.println("Your name is "+ name+ " and you are "+ age + " years old");
    }
}
