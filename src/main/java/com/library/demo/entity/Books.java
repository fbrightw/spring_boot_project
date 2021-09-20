package com.library.demo.entity;

import javax.persistence.*;

@Entity (name = "Books")
public class Books {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "author",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String author;
    @Column(
            name = "BooksName",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String BooksName;
    @Column(
            name = "DateOfPublic",
            nullable = false
    )
    private int DateOfPublic;

    public Books(String author,
                 String booksName,
                 int dateOfPublic) {
        this.author = author;
        BooksName = booksName;
        DateOfPublic = dateOfPublic;
    }

    public Books() {
    }

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBooksName() {
        return BooksName;
    }

    public void setBooksName(String booksName) {
        BooksName = booksName;
    }

    public int getDateOfPublic() {
        return DateOfPublic;
    }

    public void setDateOfPublic(int dateOfPublic) {
        DateOfPublic = dateOfPublic;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", BooksName='" + BooksName + '\'' +
                ", DateOfPublic=" + DateOfPublic +
                '}';
    }
}
