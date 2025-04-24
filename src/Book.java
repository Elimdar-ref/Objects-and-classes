import java.util.Objects;

public class Book {
    private String titleBook;//название книги
    private Author author;
    private int yearPublication;

    public Book(String titleBook, Author author, int yearPublication) {
        this.titleBook = titleBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitleBook() {
        return this.titleBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String toString() {
        return "Книга " + this.titleBook + " автор " + author + " год " + this.getYearPublication();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || other.getClass() != getClass()) return false;
        Book otherBook = (Book) other;
        return titleBook.equals(otherBook.titleBook) &&
                author.equals(otherBook.author) &&
                yearPublication == otherBook.yearPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, author, yearPublication);
    }
}