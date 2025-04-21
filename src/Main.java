public class Main {
        public static void main(String[] args) {
                Author Author1 = new Author("Лев", "Толстой");
                Author Author2 = new Author("Рафаэлло", "Джованьоли");
                Book book1 = new Book("Война и мир", Author1, 1867);
                Book book2 = new Book("Спартак", Author2, 1874);
                book2.setYearPublication(1870);
                System.out.println("Год издания " + book2.getYearPublication());
                System.out.println("Книга " + book1.getTitleBook() + " автор " + Author1.getName() + " "
                        + Author1.getSurname() + " год " + book1.getYearPublication());
        }
}