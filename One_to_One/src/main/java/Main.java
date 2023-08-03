import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utill.FactoryConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookId(001);
        book.setBookName("Gamperaliya");

        Book book1 = new Book();
        book1.setBookId(002);
        book1.setBookName("Madolduwa");

        Author author = new Author();
        author.setAuthorId(001);
        author.setAuthorName("Martin wicramasinghe");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        bookList.add(book1);
        author.setBook(book);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(book);
        session.persist(author);
        transaction.commit();
        session.close();

    }
}
