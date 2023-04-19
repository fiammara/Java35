package homeworks;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required size of the array ");
        int sizeOfArray = sc.nextInt();
        float [] createdArray = new float [sizeOfArray];
        float sumOfElements = 0;

        System.out.println("Enter the grades of the array one by one");

        for (int i = 0;  i < createdArray.length; i++) {
            System.out.println("Please enter element number: " + (i+1));

            float num=sc.nextFloat();
            createdArray[i] = num;
            sumOfElements += num;
        }

       // System.out.println();
       float average = sumOfElements/createdArray.length;
        System.out.println("Average grade: " + average);
        System.out.println("There was passed " + sizeOfArray + " values");


    }
}
