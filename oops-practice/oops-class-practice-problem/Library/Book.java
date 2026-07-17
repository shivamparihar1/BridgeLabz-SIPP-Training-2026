package oops_practice.oops_class_practice_problem.Library;

public class Book {
    protected String BookTitle;
    protected String BookPublicationYear;

    public Book(String bookTitle, String bookPublicationYear) {
        BookTitle = bookTitle;
        BookPublicationYear = bookPublicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookTitle='" + BookTitle + '\'' +
                ", BookPublicationYear='" + BookPublicationYear + '\'' +
                '}';
    }
}
