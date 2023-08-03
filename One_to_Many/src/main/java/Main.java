import entity.Author;
import entity.Book;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookId("B001");
        book.setBookName("Gamperaliya");

        Book book1 = new Book();
        book1.setBookId("B002");
        book1.setBookName("MadolDuwa");

        Author author = new Author();
        author.setAuthorId("A001");
        author.setAuthorName("Martin Wickremasinghe");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        bookList.add(book1);
        author.setBook(bookList);

        book.setAuthor(author);
        book1.setAuthor(author);


    }
}