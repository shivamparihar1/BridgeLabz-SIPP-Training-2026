package oops_practice.oops_class_practice_problem.Library;

public class LibraryMain {

    public static void main(String[] args) {

        Book b = new Book("Dopamine", "2004");

        Author a = new Author(
                "Dopamine",
                "2004",
                "Pankaj",
                "Software Engineer",
                b
        );

        System.out.println(a);
    }
}