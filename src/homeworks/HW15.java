package homeworks;

import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1, please choose rock, paper or scissors: ");
        String input1 = scanner.nextLine().trim().toLowerCase();
        System.out.println("Player 2, please choose rock, paper or scissors: ");

        String input2 = scanner.nextLine().trim().toLowerCase();

        if(input1.matches("rock|paper|scissors")
                && input2.matches("rock|paper|scissors")) {
            System.out.println(rockPaperScissors(input1, input2));
        }
        else {
            System.out.println("Wrong input");
        }
    }

   public static String rockPaperScissors(String player1, String player2){
        String result ="";

        if (player1.equals(player2)) {
            result = "TIE";
        }

       else if((player1.equals("rock") && player2.equals("paper")) ||
                (player1.equals("paper") && player2.equals("scissors")))
       {
           result = "player 2 wins";
       }
        else  {
            result = "player 1 wins";
        }

        return result;
   }
}
