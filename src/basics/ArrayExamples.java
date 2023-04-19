package basics;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        //Declaring array that will store 3 elements of type String

    String[] names = new String[3];

        //Access value no. 1 from array
        System.out.println(names[0]);

        //Set element values using each element`s index
        names[0]="Ben";
        names[1]="Tom";
        names[2]="Bob";

        System.out.println(names[0]);

        //Length
        System.out.println(names.length);

        //Second way - declare and initialize at the same time
        String[] dreamCars = new String[] {"BMW","Tesla", "Ferrari", "Opel", "Ford"};

        for (int i = 0; i < dreamCars.length; i++) {
            System.out.println(i+1 + ". "+ dreamCars[i]);
        }

        //Same idea but using For-each loop
        for (String car : dreamCars) {
            System.out.println(car);
        }


        System.out.println(Arrays.toString(dreamCars));

        // We have array of some amount int values
        //We need to give a comment for every element in the array
        //If the value is odd or even

        int listOfNumbers[]= {234, 5, 45, 23, 65, 33, 0};
        for (int number : listOfNumbers) {
            if(number % 2 == 0) {
            System.out.println(number+ " even");

            } else {
                System.out.println(number + " odd");
            }
        }
    }
}
