package oop;

public class CallingBookClass {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.title = "Test title";
        book1.author = "Test author";

        book1.setNumberOfPages(100);
        book1.printBookInfo();


        Book book2 = new Book();

        book2.title = "This is second book";
        book2.author = "Second author";

        book2.setNumberOfPages(8);
        book2.printBookInfo();

    }
}
