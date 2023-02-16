package homeworks;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter speed in mp/h:");
        double speedMpH =  sc.nextDouble();
        double speedKmH = speedMpH * 1.609344;
        System.out.println(speedMpH + " in km/h would be equal to " + speedKmH);

    }


}
