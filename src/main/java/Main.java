import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utill.Factory_Configuration;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        book.setBook_Id(001);
        book.setBook_name("Madolduwa");
        book.setAuthor("mr.Martinvikramasinghe");

        Session session = Factory_Configuration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(book);
        transaction.commit();

        Transaction transaction1 = session.beginTransaction();

       /* Book book1 = session.get(Book.class, "001");
        if (book1!= null){
            book1.setBook_name("Ape gama");
            transaction1.commit();
        }*/
        Transaction transaction2 = session.beginTransaction();
        session.remove(book);
        transaction2.commit();
        session.close();
    }
}
