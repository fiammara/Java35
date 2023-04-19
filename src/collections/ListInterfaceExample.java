package collections;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<>();
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");

        System.out.println(car);
        for (String c: car) {
            System.out.println(c);
        }
        System.out.println(car.get(0));

      //Add element at specific index
        car.add(2, "Toyota");
        System.out.println(car);

        //Changing elements value
        car.set(3, "Ford");
        System.out.println(car);
        car.remove(5);
        System.out.println(car);
        car.remove("Mercedes");
        System.out.println(car);

        car.clear();
        System.out.println(car);
    }
}
