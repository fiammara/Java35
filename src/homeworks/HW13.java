package homeworks;

public class HW13 {
    public static void main(String[] args) {
        int my_array[]= {234, 5, 45, 23, 65, 33, -2};

        System.out.println("Max: " + max(my_array));
        System.out.println("Min: " + min(my_array));

    }
    public static int max(int[] my_array) {
        int max = my_array[0];

        for (int i=1; i<my_array.length; i++) {
            if (my_array[i]>max) {
                max = my_array[i];
            }
        }
        return max;
    }

    public static int min(int[] my_array) {

        int min = my_array[0];

        for (int i=1; i<my_array.length; i++) {
            if (my_array[i]<min) {
                min=my_array[i];
            }
        }

        return min;
    }
}
