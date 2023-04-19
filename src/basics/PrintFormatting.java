package basics;

public class PrintFormatting {
    public static void main(String[] args) {
        //s - String
        //d- integer
        //f- float/double
        //c -char
        //b - boolean

          String name = "Bob";
          int age = 34;
        System.out.println("Hello " + name + "your age is " + age);
        System.out.printf("Hello %s your age is  %d", name, age);

        double height = 192.2343566d;
        System.out.printf("%s is %.2f cm tall", name, height);
        System.out.println("");
        //Hello Bob your age is 34 and your height is 192.... .Good job Bob!
        System.out.printf("Hello %1$s your age is  %2$d and your height is %3$f. Good job %1$s", name, age, height);
    }
}
