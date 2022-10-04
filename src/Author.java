import java.util.Objects;

public class Author {
    private final String authorBook;

    public Author(String authorBook){
        this.authorBook = authorBook;
    }


    @Override
    public String toString() {
        return "Autor: " + authorBook;
    }

    public boolean equals(Object ob){
        Author author = (Author) ob;
        return author.authorBook.equals(((Author) ob).authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorBook);
    }
}
