public class Operators {
    public static void main(String[] args) {

        //Basic arithmetic operators -, +, *, /, %
        int x = 100;
        x = x % 10;
        System.out.println(x);

        //Assignment operator = , -=, +=, *=, /=
        int a = 10;
         a = 20;
         a+=20;
        System.out.println(a);

        //Incrementation
        int i= 10;
        i++;
        ++i;
        System.out.println(i);

        //Post-incrementation
        int num1 = 10;
        System.out.println(num1++);
        System.out.println(num1);

        //Pre-incrementation
        int num2 = 10;
        System.out.println(++num2);
        System.out.println(num2);

        //4 ways to increment by one
        num1=num1+1;
        num1+=1;
        num1++;
        ++num1;

        //Relational operators
        //Equality ==
        int p = 10;
        int k = 10;
        System.out.println("Equality " + (p==k));

        //Inequality !=
        System.out.println("Inequality " + (p!=k));

        //Greater than or equal
        System.out.println("Greater than "  + (p>k));
        System.out.println("Greater than or equal to "  + (p>=k));

        //Less than or equal
        System.out.println("Less than "  + (p<k));
        System.out.println("Less than or equal to "  + (p<=k));

        //LOGICAL OPERATORS
        //LOGICAL and -&&

        boolean sun = false;
        boolean dry = false;

        System.out.println("I will go outside " + (sun && dry));
   //Logical OR -||
        boolean sale = true;
        boolean rich = false;

        System.out.println("I will buy Iphone " + (sale || rich));
    //negation
        boolean example = true;
        System.out.println(!example);
    }
}
