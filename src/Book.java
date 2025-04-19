public class Book {
    private String titleBook;//название книги
    private String author;
    private int yearPublication;
    public Book(String titleBook, String author, int yearPublication) {
        this.titleBook = titleBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitleBook() {
        return this.titleBook;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}