package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private  int book_Id;
    private String book_name;
    private String author;

    public Book() {
    }

    public Book(int book_Id, String book_name, String author) {
        this.book_Id = book_Id;
        this.book_name = book_name;
        this.author = author;
    }

    public int getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(int book_Id) {
        this.book_Id = book_Id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
