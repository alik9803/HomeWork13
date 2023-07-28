public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Лев Толстой");
        Author author1 = new Author("Федор", "Достоевский");

        Book book = new Book("Book ", author, 1967);
        Book book1 = new Book("Book1 ", author1, 1866);

        System.out.println( book);
        System.out.println(book1);
        book.setYaer(1989);
        System.out.println(book);
    }
}