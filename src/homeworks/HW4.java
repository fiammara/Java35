package homeworks;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number1= sc.nextInt();
        int number2= sc.nextInt();

        System.out.println(number1>0 && number2>0 || number1<0 && number2<0);


    }
}
