package oops_practice.oops_class_practice_problem.Library;

public class Author extends Book{
    public String AuthorName;
    public String AuthorBio;
    Book book;

    public Author(String bookTitle, String bookPublicationYear, String authorName, String authorBio, Book book) {
        super(bookTitle, bookPublicationYear);
        AuthorName = authorName;
        AuthorBio = authorBio;
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "AuthorName='" + AuthorName + '\'' +
                ", AuthorBio='" + AuthorBio + '\'' +
                ", book=" + book +
                ", BookTitle='" + BookTitle + '\'' +
                ", BookPublicationYear='" + BookPublicationYear + '\'' +
                '}';
    }
}


