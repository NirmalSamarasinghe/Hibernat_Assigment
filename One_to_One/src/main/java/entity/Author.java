package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Author {
    @Id
    private int authorId;
    private String authorName;
    @OneToOne
    private Book book;

    public Author() {
    }

    public Author(int authorId, String authorName, Book book) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.book = book;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}