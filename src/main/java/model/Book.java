package model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "Book")
public class Book extends Document {

    private String author;
    private String isbn;
    private LocalDate datePublication;

    public Book() {}

    public Book(String title, String author, String isbn, LocalDate datePublication) {
        super(title);
        this.author = author;
        this.isbn = isbn;
        this.datePublication = datePublication;
    }

    // Getters and Setters
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public LocalDate getDatePublication() { return datePublication; }
    public void setDatePublication(LocalDate datePublication) { this.datePublication = datePublication; }
}
