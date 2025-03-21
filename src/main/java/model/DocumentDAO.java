package model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class DocumentDAO {

    public List<Document> getAllDocuments(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DocumentPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT d FROM Document d");
        return query.getResultList();
    }
}
