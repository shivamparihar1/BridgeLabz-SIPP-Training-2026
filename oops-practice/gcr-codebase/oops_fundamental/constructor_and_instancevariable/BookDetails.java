package oops_practice.gcrcodebase.oops_fundamental.constructor_and_instancevariable;

public class BookDetails {

    String title;
    String author;
    double price;

    BookDetails() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    BookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Book Details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        BookDetails book1 = new BookDetails();

        BookDetails book2 = new BookDetails("Java Programming", "James Gosling", 599);

        System.out.println("Default Constructor");
        book1.displayDetails();

        System.out.println();

        System.out.println("Parameterized Constructor");
        book2.displayDetails();
    }
}