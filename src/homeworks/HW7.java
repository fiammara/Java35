package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required size of the array ");
        int sizeOfArray = sc.nextInt();
        int [] createdArray = new int [sizeOfArray];
        int sumOfElements =0;

        System.out.println("Enter the elements of the array one by one");

        for (int i = 0;  i < createdArray.length; i++) {
            System.out.println("Please enter element number " + (int)(i+1));

            int num=sc.nextInt();
        createdArray[i] = num;
            sumOfElements += num;
        }
        System.out.print("Source Array: ");
        for (int numbers: createdArray) {
        System.out.print(numbers + " ");
        }
        System.out.println();
        System.out.println("Sum of the elements is " + sumOfElements);
    }
}
