package oops_practice.gcrcodebase.inheritance.librarymanagement;
public class Main {

    public static void main(String[] args) {

        Author book = new Author(
                "Java Programming",
                2024,
                "James Gosling",
                "Creator of Java programming language."
        );

        book.displayInfo();
    }
}