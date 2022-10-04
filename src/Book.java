import java.util.Objects;

public class Book {
    private final String titleOfTheBook;
    private String yearOfPublicationOfTheBook;
    private Author authorOfBook;


    public Book(String titleOfTheBook, String yearOfPublicationOfTheBook, Author authorOfBook){
        this.titleOfTheBook = titleOfTheBook;
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.authorOfBook = authorOfBook;
    }


    public String getTitleOfTheBook(){
        return this.titleOfTheBook;
    }
    public String getYearOfPublicationOfTheBook(){
        return this.yearOfPublicationOfTheBook;
    }
    public String getAuthorBook() {
        return authorOfBook.toString();
    }

    public void setYearOfPublicationOfTheBook(String yearOfPublicationOfTheBook){
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
    }

    @Override
    public String toString() {
        return "Book: " + getTitleOfTheBook() + ". Year of publication: " + getYearOfPublicationOfTheBook() + ". " + authorOfBook ;
    }

    public boolean equals(Object ob){
        Book book = (Book) ob;
        return book.titleOfTheBook.equals(((Author) ob));
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleOfTheBook, yearOfPublicationOfTheBook, authorOfBook);
    }
}
