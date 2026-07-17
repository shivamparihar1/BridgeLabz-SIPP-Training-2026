package oops_practice.gcrcodebase.oops_fundamental.static_final_instanceOf_keywords;

public class LibraryManagementSystem {

    static String libraryName = "Central City Library";

    final String isbn;
    String title;
    String author;

    LibraryManagementSystem(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayDetails() {
        System.out.println("Book Details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {

        LibraryManagementSystem book1 = new LibraryManagementSystem(
                "Java Programming",
                "James Gosling",
                "ISBN101"
        );

        LibraryManagementSystem book2 = new LibraryManagementSystem(
                "Data Structures",
                "Mark Allen",
                "ISBN102"
        );

        LibraryManagementSystem.displayLibraryName();

        System.out.println();

        if (book1 instanceof LibraryManagementSystem) {
            book1.displayDetails();
        }

        System.out.println();

        if (book2 instanceof LibraryManagementSystem) {
            book2.displayDetails();
        }
    }
}