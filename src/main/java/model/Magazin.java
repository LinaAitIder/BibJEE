package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "magazine")
public class Magazin extends Document {

    private String publisher;
    private String tableNumber;
    private LocalDate date;
    private LocalDate issueDate;

    // Constructors
    public Magazin() {
    }

    public Magazin(Long id, String title, String publisher, String tableNumber, LocalDate date, LocalDate issueDate) {
        super(title);
        this.publisher = publisher;
        this.tableNumber = tableNumber;
        this.date = date;
        this.issueDate = issueDate;
    }

    // Getters and Setters
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "model.Magazin{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", publisher='" + publisher + '\'' +
                ", tableNumber='" + tableNumber + '\'' +
                ", date=" + date +
                ", issueDate=" + issueDate +
                '}';
    }
}
