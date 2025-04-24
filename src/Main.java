public class Main {
        public static void main(String[] args) {
                Author author1 = new Author("Лев", "Толстой");
                Author author2 = new Author("Рафаэлло", "Джованьоли");
                Book book1 = new Book("Война и мир", author1, 1867);
                Book book2 = new Book("Спартак", author2, 1874);
                book2.setYearPublication(1870);
                System.out.println("Год издания " + book2.getYearPublication());
                System.out.println("Книга " + book1.getTitleBook() + " автор " + author1.getName() + " "
                        + author1.getSurname() + " год " + book1.getYearPublication());
                System.out.println();
                System.out.println(book1);
                System.out.println(book2);
                //equals
                System.out.println(author1.equals(author2));
                System.out.println(book1.equals(book2));
                //hashCode
                System.out.println(book1.hashCode());
                System.out.println(book2.hashCode());
                System.out.println(author1.hashCode());
                System.out.println(author2.hashCode());
        }
}