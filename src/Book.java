import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int yaer;

    public Book (String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.yaer = year;
    }
    public String getTitle(){
        return title;
    }
    public Author getAuthor(){
        return author;
    }
    public int getYaer(){
        return yaer;
    }
    public void setYaer(int yaer){
        this.yaer = yaer;
    }
   @Override
    public String toString() {
        return title + author + yaer;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return yaer == book.yaer && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,author,yaer);
    }
}
