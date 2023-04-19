package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterfaceExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>(list1);
        System.out.println(list2);
        list2.add(5);
        list2.add(6);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Test1");
        arrayList.add("Test2");
        arrayList.add("Test3");

        for (int i =0; i<arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        for (String str: arrayList) {
            System.out.println(str);
        }
        //Linked List
        LinkedList<String> car = new LinkedList<>();
        car.add("Audi");
        car.add ("Opel");
        car.add ("Toyota");
        System.out.println(car);

        //Last element
        System.out.println(car.getLast());
        System.out.println(car.getFirst());

        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 1; i<101; i++) {
            numbers.add(i);
        }
        for (int element: numbers) {
            System.out.println(element);
        }
    }
}
