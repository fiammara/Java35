package tasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        String yearToCheck = determinLeapYear(year);
        System.out.println(yearToCheck);
    }
    public static String answer;
    public static String determinLeapYear(int year) {

        if (year<0) {

            answer= "Invalid input";

        }
        else if (year > 2100) {
            answer= "You are looking too far in the future, live for today";
        }

        if (year % 400==0||(year % 4==0 && year % 100 !=0)) {
            answer= "Leap year";
        }
        else {
            answer= "Not a leap year";
        }
      return answer;
    }
}
