package oops_practice.gcrcodebase.oops_fundamental.constructor_and_instancevariable;

public class LibraryBookSystem {

    String title;
    String author;
    double price;
    boolean availability;

    LibraryBookSystem(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    void displayDetails() {
        System.out.println("Book Details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }

    public static void main(String[] args) {

        LibraryBookSystem book = new LibraryBookSystem(
                "Java Programming",
                "James Gosling",
                599,
                true
        );

        book.displayDetails();

        System.out.println();

        book.borrowBook();

        System.out.println();

        book.displayDetails();
    }
}