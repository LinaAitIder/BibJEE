package model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "document")
@Inheritance(strategy = InheritanceType.JOINED)
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Date dateCrea;

    @OneToMany(mappedBy = "document", cascade = CascadeType.ALL)
    private List<Borrow> borrows;

    public Document() {}

    public Document(String title) {
        this.title = title;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public List<Borrow> getBorrows() { return borrows; }
    public void setBorrows(List<Borrow> borrows) { this.borrows = borrows; }

    public Date getDateCrea() { return dateCrea; }
    public void setDateCrea(Date dateCrea) { this.dateCrea = dateCrea; }

}
