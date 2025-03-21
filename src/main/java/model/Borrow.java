package model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "borrow")
public class Borrow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateBorrow;
    private LocalDate returnDate;

    // Association to model.User
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Association to model.Document (can be model.Book or other model.Document)
    @ManyToOne
    @JoinColumn(name = "document_id")
    private Document document;

    public Borrow() {}

    public Borrow(LocalDate dateBorrow, LocalDate returnDate, User user, Document document) {
        this.dateBorrow = dateBorrow;
        this.returnDate = returnDate;
        this.user = user;
        this.document = document;
    }

    // Getters and Setters
    public Long getId() { return id; }

    public LocalDate getDateBorrow() { return dateBorrow; }
    public void setDateBorrow(LocalDate dateBorrow) { this.dateBorrow = dateBorrow; }

    public LocalDate getReturnDate() { return returnDate; }
    public void setReturnDate(LocalDate returnDate) { this.returnDate = returnDate; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Document getDocument() { return document; }
    public void setDocument(Document document) { this.document = document; }
}
