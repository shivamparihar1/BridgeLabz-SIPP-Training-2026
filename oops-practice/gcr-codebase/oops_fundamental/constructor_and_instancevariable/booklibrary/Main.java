package oops_practice.gcrcodebase.oops_fundamental.constructor_and_instancevariable.booklibrary;

public class Main {

    public static void main(String[] args) {

        EBook book = new EBook(
                "978-1234567890",
                "Java Programming",
                "James Gosling",
                "PDF"
        );

        book.displayDetails();

        book.setAuthor("Herbert Schildt");

        System.out.println();
        System.out.println("After Updating Author");
        System.out.println("Author: " + book.getAuthor());
    }
}