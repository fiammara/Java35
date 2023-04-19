package homeworks;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfJam = scanner.nextInt();
        int jarsMax = 6;
        int leftToTake = amountOfJam;

          if (amountOfJam == 1||amountOfJam == 42){
            System.out.println(true);
          }
          else if (amountOfJam>42) {
              System.out.println(false);
          }

        do {
            if (leftToTake - 7 >= 0) {
                leftToTake -= 7;
                jarsMax--;


            } else if (leftToTake - 1 >= 0) {
                leftToTake -= 1;
                jarsMax--;

            }


        } while (jarsMax > 0);

        System.out.println(leftToTake == 0);

       }
    }

