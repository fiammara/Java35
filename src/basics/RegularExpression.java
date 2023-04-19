package basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        //Example1

        Pattern pattern = Pattern.compile ("a+b");
        Matcher matcher = pattern.matcher("abc");
        System.out.println(matcher.matches());
        //a part contains what matches:":
        System.out.println(matcher.find());

        //Example 2
        //Any 3 symbols that would be any lower case letter or number from 5 to 9
        System.out.println(Pattern.matches("[a-z5-9]{3}", "a59"));

        //2 Uppercase letters followed by at least 2 lowercase letters and then by 3 numbers
        System.out.println(Pattern.matches("[A-Z]{2}[a-z]{2,}[0-9]{3}", "UFjd923"));

   //2 to 7 any letter or any numbers
        System.out.println(Pattern.matches("[a-zA-Z0-9]{2,7}", "jD4fg"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter yout car`s plate number");
        String plateNumber = scanner.nextLine();

        //2 uppercase letters followed by one "-" symbol and then 2 to 4 numbers
     if (Pattern.matches("[A-Z]{2}-[0-9]{2,4}", plateNumber )) {
         System.out.println("Your plate number is valid");
     }
     else {
         System.out.println("Your plate number is not valid");
     }
    }
}
