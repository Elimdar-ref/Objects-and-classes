public class Main {
        public static void main(String[] args) {
                Book book1 = new Book("Война и мир", "Л.Толстой", 1867);
                Book book2 = new Book("Спартак", "Р.Джованьоли", 1874);
                Author publisher1 = new Author("Лев", "Толстой");
                Author publisher2 = new Author("Рафаэлло", "Джованьоли");
                book2.setYearPublication(1870);
                System.out.println("Год издания " + book2.getYearPublication());
                System.out.println("Книга " + book1.getTitleBook() + " автор " + publisher1.getName() + " "
                        + publisher1.getSurname() + " год " + book1.getYearPublication());
        }
}