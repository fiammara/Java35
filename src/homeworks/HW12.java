package homeworks;

import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String wordOriginal = sc.nextLine().trim();

        String wordReversed="";


        for (int i=0; i<wordOriginal.length(); i++) {
            wordReversed = wordReversed + wordOriginal.charAt(wordOriginal.length()-1-i);

        }
        System.out.println("Reversed word " + wordReversed);
       if (wordOriginal.equals(wordReversed)) {
        System.out.println("Palindrome");
}
       else {
        System.out.println("Not a palindrome");
}

    }

}
